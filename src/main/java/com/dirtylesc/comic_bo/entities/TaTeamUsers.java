package com.dirtylesc.comic_bo.entities;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = DefDb.TA_TEAM_USERS)
public class TaTeamUsers {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID           = "id";

    public static final String COL_TEAM_ID      = "team_id";

    public static final String COL_USER_ID      = "user_id";

    public static final String COL_STATUS       = "status";

    public static final String COL_CREATED_AT   = "created_at";

    public static final String COL_UPDATED_AT   = "updated_at";

    public static final String COL_DELETED_AT   = "deleted_at";



    public static final String ATT_ID           = "id";

    public static final String ATT_TEAM_ID      = "team_id";

    public static final String ATT_USER_ID      = "user_id";

    public static final String ATT_STATUS       = "status";

    public static final String ATT_CREATED_AT   = "created_at";

    public static final String ATT_UPDATED_AT   = "updated_at";

    public static final String  ATT_DELETED_AT   = "deleted_at";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID               , nullable = false)
    private Long id;
    @Column(name = COL_TEAM_ID          , nullable = false)
    private Long team_id;
    @Column(name = COL_USER_ID          , nullable = false)
    private Long user_id;
    @Column(name = COL_STATUS           , nullable = false)
    private Integer status;
    @Column(name = COL_CREATED_AT       , nullable = true)
    private Date created_at;
    @Column(name = COL_UPDATED_AT       , nullable = true)
    private Date updated_at;
    @Column(name = COL_DELETED_AT       , nullable = true)
    private Date deleted_at;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = ATT_TEAM_ID, referencedColumnName = TaTeams.ATT_ID, insertable = false, updatable = false)
//    private TaTeams  team;


    public TaTeamUsers() {}

    public TaTeamUsers(String name) {

    }
}
