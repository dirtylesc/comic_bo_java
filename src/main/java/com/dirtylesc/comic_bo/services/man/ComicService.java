package com.dirtylesc.comic_bo.services.man;

import com.dirtylesc.comic_bo.entities.TaComics;
import com.dirtylesc.comic_bo.repositories.man.comics.ComicRepository;
import com.dirtylesc.comic_bo.requests.man.comic.StoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Service
public class ComicService {
    ComicRepository comicRepository;

    @Autowired
    public ComicService(ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }

    public TaComics doStore(StoreRequest params) throws IllegalAccessException {
        Map<String, String> map = convertUsingReflection(params);

        TaComics comic = new TaComics(map);

        if(comic == null) {
            return null;
        }

        return comic;
    }

    private Map<String, String> convertUsingReflection(Object object) throws IllegalAccessException {
        Map<String, String> map = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field: fields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(object).toString());
        }

        return map;
    }

    public TaComics reqBySlug(String slug) {
        return comicRepository.getBySlug(slug);
    }

    public Long reqCheckSlug(String slug){
        return comicRepository.countBySlug(slug);
    }

}
