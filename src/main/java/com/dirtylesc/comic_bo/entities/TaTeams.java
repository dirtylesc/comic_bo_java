package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = DefDb.TA_TEAMS)
public class TaTeams {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_NAME         = "file";
    public static final String COL_AVATAR       = "link";
    public static final String COL_DESCRIPTION  = "type";
    public static final String COL_STATUS       = "status";
    public static final String COL_USER_ID      = "user_id";
    public static final String COL_CREATED_AT   = "created_at";
    public static final String COL_UPDATED_AT   = "updated_at";
    public static final String COL_DELETED_AT   = "deleted_at";


    public static final String ATT_ID           = "id";
    public static final String ATT_FILE         = "file";
    public static final String ATT_LINK         = "link";
    public static final String ATT_TYPE         = "type";
    public static final String ATT_STATUS       = "status";
    public static final String ATT_USER_ID      = "user_id";
    public static final String ATT_CREATED_AT   = "created_at";
    public static final String ATT_UPDATED_AT   = "updated_at";
    public static final String ATT_DELETED_AT   = "deleted_at";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_NAME         , nullable = false)
    private String name;
    @Column(name = COL_AVATAR       , nullable = true)
    private String avatar;
    @Column(name = COL_DESCRIPTION  , nullable = true)
    private String description;
    @Column(name = COL_STATUS       , nullable = false)
    private Integer status;
    @Column(name = COL_USER_ID      , nullable = false)
    private Long user_id;
    @Column(name = COL_CREATED_AT   , nullable = true)
    private Date created_at;
    @Column(name = COL_UPDATED_AT   , nullable = true)
    private Date updated_at;
    @Column(name = COL_DELETED_AT   , nullable = true)
    private Date deleted_at;

    public TaTeams() {}

    public TaTeams(Long user_id) {
        this.user_id = user_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

