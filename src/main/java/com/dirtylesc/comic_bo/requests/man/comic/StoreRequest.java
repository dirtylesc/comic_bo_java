package com.dirtylesc.comic_bo.requests.man.comic;

import com.dirtylesc.comic_bo.entities.TaComics;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

@Setter
@Getter
public class StoreRequest {
    private String          name;

    private String          alias       = null;

    private String          author      = null;

    private Integer         language    = null;

//    private MultipartFile   avatar      = null;

    private String          description = null;

    private Integer         pre_view    = 0;

    private Integer         status      = TaComics.STATUS_ONGOING;

    private Set<Long>       categories  = null;

    private Long            user_id     = null;

    private String          slug;
}
