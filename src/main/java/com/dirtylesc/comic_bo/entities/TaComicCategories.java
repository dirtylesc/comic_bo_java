package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = DefDb.TA_COMIC_CATEGORIES)
public class TaComicCategories {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_COMIC_ID     = "comic_id";
    public static final String COL_CATEGORY_ID  = "category_id";


    public static final String ATT_ID           = "id";
    public static final String ATT_COMIC_ID     = "comic_id";
    public static final String ATT_CATEGORY_ID  = "category_id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID               , nullable = false)
    private Long id;
    @Column(name = COL_COMIC_ID         , nullable = false)
    private Long comic_id;
    @Column(name = COL_CATEGORY_ID      , nullable = false)
    private Long category_id;

    public TaComicCategories() {}

    public TaComicCategories(Long user_id) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
