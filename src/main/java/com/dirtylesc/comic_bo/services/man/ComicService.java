package com.dirtylesc.comic_bo.services.man;

import com.dirtylesc.comic_bo.common.ToolMap;
import com.dirtylesc.comic_bo.entities.TaComicCategories;
import com.dirtylesc.comic_bo.entities.TaComics;
import com.dirtylesc.comic_bo.entities.categories.TaCategories;
import com.dirtylesc.comic_bo.entities.categories.ViCategories;
import com.dirtylesc.comic_bo.repositories.man.categories.ViCategoryRepository;
import com.dirtylesc.comic_bo.repositories.man.comics.ComicCategoriesRepository;
import com.dirtylesc.comic_bo.repositories.man.comics.ComicRepository;
import com.dirtylesc.comic_bo.requests.man.comic.PaginateSearchRequest;
import com.dirtylesc.comic_bo.requests.man.comic.StoreRequest;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@AllArgsConstructor
@Service
public class ComicService {
    final ComicRepository           comicRepository;
    final ViCategoryRepository      viComicRepository;
    final ComicCategoriesRepository comicCategoriesRepository;
    final JdbcTemplate jdbcTemplate;

    public TaComics doStore(StoreRequest params) throws IllegalAccessException {
        Map<String, String> map     = ToolMap.convertUsingReflection(params);
        Set<Long>           catIds  = params.getCategories();

        TaComics comic = new TaComics(map);
        comic.setCreated_at(new Date());
        comicRepository.save(comic);

        //Store Comic Categories
        if(catIds != null && !catIds.isEmpty()) {
            List<ViCategories> categories = viComicRepository.findAllByIdIn(catIds);

            if(categories != null) {
                String sql = TaComicCategories.buildSqlSaveAll(categories, comic.getId());
                jdbcTemplate.execute(sql);
            }
        }

        return comic;
    }


    public List<TaComics> reqList(PaginateSearchRequest params) {
        Set<Integer> categories = params.getCategories();
        Set<Integer> status     = params.getStatus();
        String       q          = params.getQ();
        Integer      page       = params.getPage();
        Integer      pageSize   = params.getPageSize();
        Pageable     pageable   = PageRequest.of(page, pageSize);

        if(status == null) {
            status = new HashSet<>();
            status.add(TaComics.STATUS_ONGOING);
        }

        if(categories == null) {
            return comicRepository.findAllByNameLikeAndStatusIn(q, status, pageable);
        }

        return null;
    }

    public TaComics reqBySlug(String slug) {
        return comicRepository.getBySlug(slug);
    }

    public Long reqCheckSlug(String slug){
        return comicRepository.countBySlug(slug);
    }

}
