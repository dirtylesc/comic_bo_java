package com.dirtylesc.comic_bo.services.man;

import com.dirtylesc.comic_bo.entities.categories.TaCategories;
import com.dirtylesc.comic_bo.entities.TaComics;
import com.dirtylesc.comic_bo.entities.categories.ViCategories;
import com.dirtylesc.comic_bo.repositories.man.categories.CategoryRepository;
import com.dirtylesc.comic_bo.repositories.man.categories.ViCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;
    ViCategoryRepository viCategoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, ViCategoryRepository viCategoryRepository) {
        this.categoryRepository     = categoryRepository;
        this.viCategoryRepository   = viCategoryRepository;
    }

    public TaComics doStore() {
        return null;
    }

    public TaCategories reqBySlug(String slug) {
        return categoryRepository.getBySlug(slug);
    }

    public List<ViCategories> reqLstViSearch(String q) {
        return viCategoryRepository.findAllByNameLike(q);
    }
}
