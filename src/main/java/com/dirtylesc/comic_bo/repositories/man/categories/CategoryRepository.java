package com.dirtylesc.comic_bo.repositories.man.categories;

import com.dirtylesc.comic_bo.entities.categories.TaCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<TaCategories, Long> {
    TaCategories getBySlug(String slug);

    List<TaCategories> findAllByNameLike(String q);
}
