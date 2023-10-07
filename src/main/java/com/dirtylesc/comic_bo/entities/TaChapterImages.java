package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;

@Entity
@Table(name = DefDb.TA_CHAPTER_IMAGES)
public class TaChapterImages {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_LINK         = "link";
    public static final String COL_CHAPTER_ID   = "chapter_id";


    public static final String ATT_ID           = "id";
    public static final String ATT_LINK         = "link";
    public static final String ATT_CHAPTER_ID   = "chapter_id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_LINK         , nullable = false)
    private String  link;
    @Column(name = COL_CHAPTER_ID   , nullable = false)
    private Long chapter_id;

    public TaChapterImages() {}

    public TaChapterImages(int user_id) {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
