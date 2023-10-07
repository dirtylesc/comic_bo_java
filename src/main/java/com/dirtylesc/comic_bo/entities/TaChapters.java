package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = DefDb.TA_CHAPTERS)
public class TaChapters {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_TITLE        = "title";
    public static final String COL_NUMBER       = "number";
    public static final String COL_VIEW         = "view";
    public static final String COL_STATUS       = "status";
    public static final String COL_SLUG         = "slug";
    public static final String COL_COMIC_ID     = "comic_id";
    public static final String COL_CREATED_AT   = "created_at";
    public static final String COL_UPDATED_AT   = "updated_at";
    public static final String COL_DELETED_AT   = "deleted_at";


    public static final String ATT_ID           = "id";
    public static final String ATT_TITLE        = "title";
    public static final String ATT_NUMBER       = "number";
    public static final String ATT_VIEW         = "view";
    public static final String ATT_STATUS       = "status";
    public static final String ATT_SLUG         = "slug";
    public static final String ATT_COMIC_ID     = "comic_id";
    public static final String ATT_CREATED_AT   = "created_at";
    public static final String ATT_UPDATED_AT   = "updated_at";
    public static final String ATT_DELETED_AT   = "deleted_at";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_TITLE        , nullable = false)
    private String title;
    @Column(name = COL_NUMBER       , nullable = false)
    private BigDecimal number;
    @Column(name = COL_VIEW         , nullable = false)
    private Integer view;
    @Column(name = COL_STATUS       , nullable = false)
    private Integer status;
    @Column(name = COL_SLUG         , nullable = false)
    private String  slug;
    @Column(name = COL_COMIC_ID     , nullable = false)
    private Long comic_id;
    @Column(name = COL_CREATED_AT   , nullable = true)
    private Date created_at;
    @Column(name = COL_UPDATED_AT   , nullable = true)
    private Date updated_at;
    @Column(name = COL_DELETED_AT   , nullable = true)
    private Integer deleted_at;

    public TaChapters() {}

    public TaChapters(int user_id) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
