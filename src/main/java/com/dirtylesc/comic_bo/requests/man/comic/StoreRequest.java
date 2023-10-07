package com.dirtylesc.comic_bo.requests.man.comic;

import com.dirtylesc.comic_bo.entities.TaComics;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class StoreRequest {
    private String          name;

    private String          alias       = null;

    private String          author      = null;

    private Integer         language    = null;

    private String          avatar      = null;

    private String          description = null;

    private Integer         pre_view    = 0;

    private Integer         status      = TaComics.STATUS_ONGOING;

    private Set<Integer>    categories  = null;

    private Integer         user_id     = null;

    private String          slug;
}
