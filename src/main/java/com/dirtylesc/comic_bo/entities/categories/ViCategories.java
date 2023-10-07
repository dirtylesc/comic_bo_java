package com.dirtylesc.comic_bo.entities.categories;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = DefDb.TA_CATEGORIES)
public class ViCategories {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_NAME         = "name";


    public static final String ATT_ID           = "id";
    public static final String ATT_NAME         = "name";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_NAME         , nullable = false)
    private String name;
}
