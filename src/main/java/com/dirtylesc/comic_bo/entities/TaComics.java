package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import com.dirtylesc.comic_bo.entities.categories.TaCategories;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = DefDb.TA_COMICS)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TaComics {
    private static final Long serialVersionUID = 1000L;

    public static final Integer STATUS_ONGOING      = 0;
    public static final Integer STATUS_COMPLETED    = 1;
    public static final Integer STATUS_UNRELEASED   = 2;
    public static final Integer STATUS_DEFERED      = 3;
    public static final Integer STATUS_PENDING      = 4;

    //---------------------------------------------------------------------

    public static final String COL_ID           = "id";

    public static final String COL_USER_ID      = "user_id";
    public static final String COL_NAME         = "name";
    public static final String COL_ALIAS        = "alias";
    public static final String COL_AVATAR       = "avatar";
    public static final String COL_AUTHOR       = "author";
    public static final String COL_LANGUAGE     = "language";
    public static final String COL_DESCRIPTION  = "description";
    public static final String COL_PRE_VIEW     = "pre_view";
    public static final String COL_STATUS       = "status";
    public static final String COL_SLUG         = "slug";

    public static final String COL_CREATED_AT   = "created_at";

    public static final String COL_UPDATED_AT   = "updated_at";
    public static final String COL_COMPLETED_AT = "completed_at";
    public static final String COL_DELETED_AT   = "deleted_at";


    public static final String ATT_ID           = "id";

    public static final String ATT_USER_ID      = "user_id";
    public static final String ATT_NAME         = "name";
    public static final String ATT_ALIAS        = "alias";
    public static final String ATT_AVATAR       = "avatar";
    public static final String ATT_AUTHOR       = "author";
    public static final String ATT_LANGUAGE     = "language";
    public static final String ATT_DESCRIPTION  = "description";
    public static final String ATT_PRE_VIEW     = "pre_view";
    public static final String ATT_STATUS       = "status";
    public static final String ATT_SLUG         = "slug";

    public static final String ATT_CREATED_AT   = "created_at";

    public static final String ATT_UPDATED_AT   = "updated_at";
    public static final String ATT_COMPLETED_AT = "completed_at";
    public static final String ATT_DELETED_AT   = "deleted_at";

    //----------------------------------------------------------

    public static final String SQL_JOIN_COMIC_CATEGORIES = "join comic_categories c_cats on c_cats.comic_id = comics.id";
    public static final String SQL_JOIN_CATEGORIES       = "join categories cats on cats.id = c_cats.category_id";
    public static final String SQL_WHERE                 = "where";
    public static final String SQL_LIKE                  = "comics.%s like %s";
    public static final String SQL_IN                    = "comics.%s in (%s)";

    //----------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID           , nullable = false)
    private Long id;
    @Column(name = COL_USER_ID      , nullable = true)
    private Long user_id;
    @Column(name = COL_NAME         , nullable = false)
    private String name;
    @Column(name = COL_ALIAS        , nullable = true)
    private String alias;
    @Column(name = COL_AVATAR       , nullable = true)
    private String avatar;
    @Column(name = COL_AUTHOR       , nullable = true)
    private String author;
    @Column(name = COL_LANGUAGE     , nullable = true)
    private Integer language;
    @Column(name = COL_DESCRIPTION  , nullable = true)
    private String description;
    @Column(name = COL_PRE_VIEW     , nullable = false)
    private Integer pre_view;
    @Column(name = COL_STATUS       , nullable = false)
    private Integer status;
    @Column(name = COL_SLUG         , nullable = false)
    private String slug;
    @Column(name = COL_CREATED_AT   , nullable = true)
    private Date created_at;
    @Column(name = COL_UPDATED_AT   , nullable = true)
    private Date updated_at;
    @Column(name = COL_COMPLETED_AT , nullable = true)
    private Date completed_at;
    @Column(name = COL_DELETED_AT   , nullable = true)
    private Integer deleted_at;

    public TaComics(Map<String, String> map) {
        this.name           = map.get(ATT_NAME);
        this.alias          = map.get(ATT_ALIAS);
        this.author         = map.get(ATT_AUTHOR);
        this.language       = Integer.parseInt(map.get(ATT_LANGUAGE));
        this.avatar         = map.get(ATT_AVATAR);
        this.description    = map.get(ATT_DESCRIPTION);
        this.pre_view       = Integer.parseInt(map.get(ATT_PRE_VIEW));
        this.status         = Integer.parseInt(map.get(ATT_STATUS));
        this.user_id        = Long.parseLong(map.get(ATT_USER_ID));
        this.slug           = map.get(ATT_SLUG);
    }
}
