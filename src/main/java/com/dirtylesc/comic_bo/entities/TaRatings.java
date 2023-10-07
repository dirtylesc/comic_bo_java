package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = DefDb.TA_RATINGS)
public class TaRatings {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_RATE         = "rate";
    public static final String COL_MESSAGES     = "messages";
    public static final String COL_LIKE         = "like";
    public static final String COL_PIN          = "pin";
    public static final String COL_USER_ID      = "user_id";
    public static final String COL_COMIC_ID     = "comic_id";
    public static final String COL_IMAGE        = "image";
    public static final String COL_CREATED_AT   = "created_at";
    public static final String COL_UPDATED_AT   = "updated_at";


    public static final String ATT_ID           = "id";
    public static final String ATT_USER_ID      = "user_id";
    public static final String ATT_COMIC_ID     = "comic_id";
    public static final String ATT_CHAPTER_ID   = "chapter_id";
    public static final String ATT_CREATED_AT   = "created_at";
    public static final String ATT_UPDATED_AT   = "updated_at";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_RATE         , nullable = false)
    private Float rate;
    @Column(name = COL_MESSAGES     , nullable = true)
    private String messages;
    @Column(name = COL_LIKE         , nullable = false)
    private Long like;
    @Column(name = COL_PIN          , nullable = false)
    private Integer pin;
    @Column(name = COL_USER_ID      , nullable = false)
    private Long user_id;
    @Column(name = COL_COMIC_ID     , nullable = false)
    private Long comic_id;
    @Column(name = COL_IMAGE        , nullable = true)
    private String image;
    @Column(name = COL_CREATED_AT   , nullable = true)
    private Date created_at;
    @Column(name = COL_UPDATED_AT   , nullable = true)
    private Date updated_at;

    public TaRatings() {}
}
