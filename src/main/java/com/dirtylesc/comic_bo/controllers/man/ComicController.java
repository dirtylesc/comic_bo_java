package com.dirtylesc.comic_bo.controllers.man;

import com.dirtylesc.comic_bo.def.DefAPI;
import com.dirtylesc.comic_bo.def.DefDb;
import com.dirtylesc.comic_bo.entities.main.ApiResponse;
import com.dirtylesc.comic_bo.requests.man.comic.StoreRequest;
import com.dirtylesc.comic_bo.entities.TaComics;
import com.dirtylesc.comic_bo.services.man.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(DefDb.PATH_API_PRIV + DefDb.URI_API_COMIC)
public class ComicController {
    private final ComicService comicService;

    @Autowired
    public ComicController(ComicService comicService) {
        this.comicService = comicService;
    }

    @GetMapping("")
    public ResponseEntity<TaComics> reqLstComics() {
        Long i = 2L;

        return ResponseEntity.ok(new TaComics());
    }
    @GetMapping("/{slug}")
    public ResponseEntity<TaComics> reqComic(@PathVariable String slug) {
        TaComics comic = comicService.reqBySlug(slug);

        if(comic == null) return ResponseEntity.badRequest().body(null);

        return ResponseEntity.ok(comic);
    }

    @PostMapping(DefDb.URI_API_STORE)
    public ResponseEntity<ApiResponse> doCreateComic(@RequestBody StoreRequest params) throws IllegalAccessException {
        TaComics comic = comicService.doStore(params);

        if(comic == null) {
            return ResponseEntity.ok(new ApiResponse(-1, DefAPI.SV_CODE_API_NO));
        }

        return ResponseEntity.ok(new ApiResponse(1, DefAPI.SV_CODE_API_YES, comic));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaComics> doUpdateComic() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TaComics> doDestroyComic() {
        return null;
    }

    @PostMapping(DefDb.URI_API_CHECK_SLUG)
    public ResponseEntity<ApiResponse> doCheckSlug(@RequestBody String slug){
        return ResponseEntity.ok(new ApiResponse(
                1,
                DefAPI.SV_CODE_API_YES,
                comicService.reqCheckSlug(slug)));
    }
}
