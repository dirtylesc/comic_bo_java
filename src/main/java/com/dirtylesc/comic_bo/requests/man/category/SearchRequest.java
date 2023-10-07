package com.dirtylesc.comic_bo.requests.man.category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequest {
    private String q = "%";

    public void setQ(String q) {
        this.q = "%" + q + "%";
    }
}
