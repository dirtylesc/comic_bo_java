package com.dirtylesc.comic_bo.repositories.man.comics;

import com.dirtylesc.comic_bo.entities.TaComics;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ComicRepository extends JpaRepository<TaComics, Long> {
    TaComics       getBySlug(String slug);

    Long           countBySlug(String slug);

    List<TaComics> findAllByNameLikeAndStatusIn(String name, Collection<Integer> status, Pageable pageable);
}
