package com.dirtylesc.comic_bo.services.man;

import com.dirtylesc.comic_bo.common.ToolMap;
import com.dirtylesc.comic_bo.entities.categories.TaCategories;
import com.dirtylesc.comic_bo.entities.categories.ViCategories;
import com.dirtylesc.comic_bo.repositories.man.categories.CategoryRepository;
import com.dirtylesc.comic_bo.repositories.man.categories.ViCategoryRepository;
import com.dirtylesc.comic_bo.requests.man.category.StoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;
    ViCategoryRepository viCategoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, ViCategoryRepository viCategoryRepository) {
        this.categoryRepository     = categoryRepository;
        this.viCategoryRepository   = viCategoryRepository;
    }

    public TaCategories doStore(StoreRequest params) throws IllegalAccessException {
        Map<String, String> map = ToolMap.convertUsingReflection(params);

        TaCategories        cat = new TaCategories(map);
        cat.setCreated_at(new Date());
        categoryRepository.save(cat);

        return cat;
    }

    public TaCategories reqBySlug(String slug) {
        return categoryRepository.getBySlug(slug);
    }

    public List<ViCategories> reqLstViSearch(String q) {
        return viCategoryRepository.findAllByNameLike(q);
    }
}
