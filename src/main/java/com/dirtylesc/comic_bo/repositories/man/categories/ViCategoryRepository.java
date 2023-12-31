package com.dirtylesc.comic_bo.repositories.man.categories;

import com.dirtylesc.comic_bo.entities.categories.ViCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ViCategoryRepository extends JpaRepository<ViCategories, Long> {
    List<ViCategories> findAllByNameLike(String q);
    List<ViCategories> findAllByIdIn(Set<Long> ids);
}
