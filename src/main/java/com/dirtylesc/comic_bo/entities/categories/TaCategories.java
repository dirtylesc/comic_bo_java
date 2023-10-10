package com.dirtylesc.comic_bo.entities.categories;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = DefDb.TA_CATEGORIES)
public class TaCategories {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_NAME         = "name";
    public static final String COL_DESCRIPTION  = "description";
    public static final String COL_SLUG         = "slug";
    public static final String COL_CREATED_AT   = "created_at";
    public static final String COL_UPDATED_AT   = "updated_at";
    public static final String COL_DELETED_AT   = "deleted_at";


    public static final String ATT_ID           = "id";
    public static final String ATT_NAME         = "name_01";
    public static final String ATT_DESCRIPTION  = "description";
    public static final String ATT_SLUG         = "slug";
    public static final String ATT_CREATED_AT   = "created_at";
    public static final String ATT_UPDATED_AT   = "updated_at";
    public static final String ATT_DELETED_AT   = "deleted_at";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_NAME         , nullable = false)
    private String name;
    @Column(name = COL_DESCRIPTION  , nullable = false)
    private String description;
    @Column(name = COL_SLUG         , nullable = false)
    private String slug;
    @Column(name = COL_CREATED_AT   , nullable = true)
    private Date created_at;
    @Column(name = COL_UPDATED_AT   , nullable = true)
    private Date updated_at;
    @Column(name = COL_DELETED_AT   , nullable = true)
    private Date deleted_at;

    public TaCategories(Map<String, String> map) {
        this.name           = map.get(ATT_NAME);
        this.description    = map.get(ATT_DESCRIPTION);
        this.slug           = map.get(ATT_SLUG);
        this.slug           = map.get(ATT_SLUG);
    }
}
