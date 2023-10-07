package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;


@Entity
@Table(name = DefDb.TA_USER_LANGUAGES)
public class TaUserLanguages {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";

    public static final String COL_USER_ID      = "user_id";

    public static final String COL_LANGUAGE_ID  = "language_id";



    public static final String ATT_ID           = "id";

    public static final String ATT_USER_ID      = "user_id";

    public static final String ATT_LANGUAGE_ID  = "language_id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID               , nullable = false)
    private Long id;
    @Column(name = COL_USER_ID          , nullable = false)
    private Long user_id;
    @Column(name = COL_LANGUAGE_ID      , nullable = false)
    private Long language_id;

    public TaUserLanguages() {}

    public TaUserLanguages(String name) {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
