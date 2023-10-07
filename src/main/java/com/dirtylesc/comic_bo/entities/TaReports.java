package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = DefDb.TA_REPORTS)
public class TaReports {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_MESSAGES     = "messages";
    public static final String COL_TYPE         = "type";
    public static final String COL_STATUS       = "status";
    public static final String COL_USER_ID      = "user_id";
    public static final String COL_COMIC_ID     = "comic_id";
    public static final String COL_RATING_ID    = "rating_id";
    public static final String COL_CHAPTER_ID   = "chapter_id";
    public static final String COL_COMMENT_ID   = "comment_id";
    public static final String COL_CREATED_AT   = "created_at";
    public static final String COL_UPDATED_AT   = "updated_at";



    public static final String ATT_ID           = "id";
    public static final String ATT_MESSAGES     = "messages";
    public static final String ATT_TYPE         = "type";
    public static final String ATT_STATUS       = "status";
    public static final String ATT_USER_ID      = "user_id";
    public static final String ATT_COMIC_ID     = "comic_id";
    public static final String ATT_RATING_ID    = "rating_id";
    public static final String ATT_CHAPTER_ID   = "chapter_id";
    public static final String ATT_COMMENT_ID   = "comment_id";
    public static final String ATT_CREATED_AT   = "created_at";
    public static final String ATT_UPDATED_AT   = "updated_at";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_MESSAGES     , nullable = false)
    private String messages;
    @Column(name = COL_TYPE         , nullable = false)
    private Integer type;
    @Column(name = COL_STATUS       , nullable = false)
    private Integer status;
    @Column(name = COL_USER_ID      , nullable = false)
    private Long user_id;
    @Column(name = COL_COMIC_ID     , nullable = false)
    private Long comic_id;
    @Column(name = COL_RATING_ID   , nullable = false)
    private Long rating_id;
    @Column(name = COL_CHAPTER_ID   , nullable = false)
    private Long chapter_id;
    @Column(name = COL_COMMENT_ID   , nullable = false)
    private Long comment_id;
    @Column(name = COL_CREATED_AT   , nullable = true)
    private Date created_at;
    @Column(name = COL_UPDATED_AT   , nullable = true)
    private Date updated_at;

    public TaReports() {}

    public TaReports(int user_id) {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
