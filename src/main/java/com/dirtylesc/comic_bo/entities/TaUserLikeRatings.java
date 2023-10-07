package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;


@Entity
@Table(name = DefDb.TA_USER_LIKE_RATINGS)
public class TaUserLikeRatings {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_USER_ID      = "user_id";
    public static final String COL_RATING_ID   = "rating_id";


    public static final String ATT_ID           = "id";
    public static final String ATT_USER_ID      = "user_id";
    public static final String ATT_RATING_ID   = "rating_id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_USER_ID      , nullable = false)
    private Long user_id;
    @Column(name = COL_RATING_ID   , nullable = false)
    private Long rating_id;

    public TaUserLikeRatings() {}

    public TaUserLikeRatings(Long user_id) {
        this.user_id = user_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
