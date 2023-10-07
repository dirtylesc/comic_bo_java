package com.dirtylesc.comic_bo.repositories.man.comics;

import com.dirtylesc.comic_bo.entities.TaComics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepository extends JpaRepository<TaComics, Long> {
    TaComics getBySlug(String slug);

    Long countBySlug(String slug);
}
