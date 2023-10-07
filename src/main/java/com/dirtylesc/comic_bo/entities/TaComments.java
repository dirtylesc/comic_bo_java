package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = DefDb.TA_COMMENTS)
public class TaComments {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_MESSAGES     = "title";
    public static final String COL_LIKE         = "number";
    public static final String COL_PIN          = "view";
    public static final String COL_USER_ID      = "status";
    public static final String COL_RATING_ID    = "slug";
    public static final String COL_IMAGE        = "comic_id";
    public static final String COL_CREATED_AT   = "created_at";
    public static final String COL_UPDATED_AT   = "updated_at";


    public static final String ATT_ID           = "id";
    public static final String ATT_MESSAGES     = "title";
    public static final String ATT_LIKE         = "number";
    public static final String ATT_PIN          = "view";
    public static final String ATT_USER_ID      = "status";
    public static final String ATT_RATING_ID    = "slug";
    public static final String ATT_IMAGE        = "comic_id";
    public static final String ATT_CREATED_AT   = "created_at";
    public static final String ATT_UPDATED_AT   = "updated_at";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_MESSAGES     , nullable = false)
    private String messages;
    @Column(name = COL_LIKE         , nullable = false)
    private Integer like;
    @Column(name = COL_PIN          , nullable = false)
    private Integer pin;
    @Column(name = COL_USER_ID      , nullable = false)
    private Long user_id;
    @Column(name = COL_RATING_ID    , nullable = false)
    private Long rating_id;
    @Column(name = COL_CREATED_AT   , nullable = true)
    private Date created_at;
    @Column(name = COL_UPDATED_AT   , nullable = true)
    private Date updated_at;

    public TaComments() {}

    public TaComments(Long user_id) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
