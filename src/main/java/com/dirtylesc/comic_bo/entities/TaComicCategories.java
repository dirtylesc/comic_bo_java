package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import com.dirtylesc.comic_bo.entities.categories.TaCategories;
import com.dirtylesc.comic_bo.entities.categories.ViCategories;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = DefDb.TA_COMIC_CATEGORIES)
public class TaComicCategories {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";
    public static final String COL_COMIC_ID     = "comic_id";
    public static final String COL_CATEGORY_ID  = "category_id";


    public static final String ATT_ID           = "id";
    public static final String ATT_COMIC_ID     = "comic_id";
    public static final String ATT_CATEGORY_ID  = "category_id";

    //----------------------------------------------------------
    public static final String SQL_INSERT       = "Insert into comic_categories (`comic_id`, `category_id`) Values";
    public static final String SQL_INSERT_VALUE = " (%d, %d),";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID               , nullable = false)
    private Long id;

    @Column(name = COL_COMIC_ID         , nullable = false)
    Long comic_id;
    @Column(name = COL_CATEGORY_ID      , nullable = false)
    Long category_id;

    public TaComicCategories(Long comic_id, Long category_id) {
        this.comic_id       = comic_id;
        this.category_id    = category_id;
    }

    public static String buildSqlSaveAll(List<ViCategories> lstCats, Long comicId) {
        StringBuilder sql = new StringBuilder(SQL_INSERT);

        for (ViCategories cat : lstCats) {
            sql.append(String.format(SQL_INSERT_VALUE, comicId, cat.getId()));
        }

        return sql.substring(0, sql.length() - 1);
    }
}
