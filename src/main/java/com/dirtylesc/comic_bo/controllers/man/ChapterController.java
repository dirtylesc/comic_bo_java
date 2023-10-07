package com.dirtylesc.comic_bo.controllers.man;

import com.dirtylesc.comic_bo.def.DefDb;
import com.dirtylesc.comic_bo.entities.TaChapters;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(DefDb.PATH_API_PRIV + DefDb.URI_API_CHAPTER)
public class ChapterController {

    @GetMapping("")
    public ResponseEntity<TaChapters> reqLstChapters() {
        return null;
    }
    @GetMapping("{slug}")
    public ResponseEntity<TaChapters> reqChapter() {
        return null;
    }

    @PostMapping("")
    public ResponseEntity<TaChapters> doCreateChapter() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaChapters> doUpdateChapter() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TaChapters> doDestroyChapter() {
        return null;
    }
}
