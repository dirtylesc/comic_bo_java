package com.dirtylesc.comic_bo.requests.man.comic;

import com.dirtylesc.comic_bo.entities.TaComics;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaginateSearchRequest {
    private Set<Integer> categories;
    private Set<Integer> status;
    private String       q        = "%";
    private Integer      page     = 0;
    private Integer      pageSize = 15;

    public void setQ(String q) {
        this.q = "%" + q + "%";
    }
}
