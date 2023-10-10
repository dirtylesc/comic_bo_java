package com.dirtylesc.comic_bo.services.man;

import com.dirtylesc.comic_bo.entities.TaComicCategories;
import com.dirtylesc.comic_bo.repositories.man.comics.ComicCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ComicCategoriesService {
    ComicCategoriesRepository comicCategoriesRepository;

//    @Autowired
//    public ComicCategoriesService(ComicCategoriesRepository comicCategoriesRepository) {
//        this.comicCategoriesRepository = comicCategoriesRepository;
//    }

//    public TaComicCategories doStore(Long comicId, Set<Long> lstIds) {
//        List<TaComicCategories> lst = new ArrayList<>();
//        for (Long id : lstIds) {
//            TaComicCategories comicCategories = new TaComicCategories(comicId, id);
//            lst.add(comicCategories);
//        }
//
//        return null;
//    }
}
