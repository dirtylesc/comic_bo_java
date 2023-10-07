package com.dirtylesc.comic_bo.controllers.man;

import com.dirtylesc.comic_bo.def.DefDb;
import com.dirtylesc.comic_bo.entities.categories.TaCategories;
import com.dirtylesc.comic_bo.entities.categories.ViCategories;
import com.dirtylesc.comic_bo.requests.man.category.SearchRequest;
import com.dirtylesc.comic_bo.services.man.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(DefDb.PATH_API_PRIV + DefDb.URI_API_CATEGORY)
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(DefDb.URI_APT_VIEW)
    public ResponseEntity<List<ViCategories>> reqLstCategories(SearchRequest params) {
        return ResponseEntity.ok(categoryService.reqLstViSearch(params.getQ()));
    }
    @GetMapping("/{slug}")
    public ResponseEntity<TaCategories> reqComic(@PathVariable String slug) {
        TaCategories category = categoryService.reqBySlug(slug);

        if(category == null) return ResponseEntity.badRequest().body(null);

        return ResponseEntity.ok(category);
    }

    @PostMapping("")
    public ResponseEntity<TaCategories> doCreateCategory() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaCategories> doUpdateCategory() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TaCategories> doDestroyCategory() {
        return null;
    }
}
