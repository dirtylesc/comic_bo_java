package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;

@Entity
@Table(name = DefDb.TA_LANGUAGES)
public class TaLanguages {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_NAME         = "name_01";


    public static final String ATT_ID           = "id";
    public static final String ATT_NAME         = "name";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_NAME         , nullable = false)
    private String name;

    public TaLanguages() {}

    public TaLanguages(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
