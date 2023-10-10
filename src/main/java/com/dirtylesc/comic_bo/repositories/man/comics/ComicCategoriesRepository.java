package com.dirtylesc.comic_bo.repositories.man.comics;

import com.dirtylesc.comic_bo.entities.TaComicCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicCategoriesRepository extends JpaRepository<TaComicCategories, Long> {
}
