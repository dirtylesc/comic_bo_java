package com.dirtylesc.comic_bo.entities.users;

import com.dirtylesc.comic_bo.def.DefDb;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = DefDb.TA_USERS)
public class TaUsers {
    private static final Long serialVersionUID = 1000L;

    public static final Integer ROLE_SUPER_ADMIN        = 0;
    public static final Integer ROLE_ADMIN              = 1;
    public static final Integer ROLE_TRANSLATOR         = 2;
    public static final Integer ROLE_READER             = 3 ;

    public static final String COL_ID                   = "id";
    public static final String COL_EMAIL                = "email";
    public static final String COL_AVATAR               = "avatar";
    public static final String COL_PASSWORD             = "password";
    public static final String COL_NAME                 = "name";
    public static final String COL_NICKNAME             = "nickname";
    public static final String COL_ROLE                 = "role";
    public static final String COL_PHONE                = "phone";
    public static final String COL_LOCATION             = "location";
    public static final String COL_DESCRIPTION          = "description";
    public static final String COL_GENDER               = "gender";
    public static final String COL_EMAIL_VERIFIED_AT    = "email_verified_at";
    public static final String COL_REMEMBER_TOKEN       = "remember_token";

    public static final String COL_CREATED_AT           = "created_at";

    public static final String COL_UPDATED_AT           = "updated_at";
    public static final String COL_DELETED_AT           = "deleted_at";


    public static final String ATT_ID                   = "id";
    public static final String ATT_EMAIL                = "email";
    public static final String ATT_AVATAR               = "avatar";
    public static final String ATT_PASSWORD             = "password";
    public static final String ATT_NAME                 = "name";
    public static final String ATT_NICKNAME             = "nickname";
    public static final String ATT_ROLE                 = "role";
    public static final String ATT_PHONE                = "phone";
    public static final String ATT_LOCATION             = "location";
    public static final String ATT_DESCRIPTION          = "description";
    public static final String ATT_GENDER               = "gender";
    public static final String ATT_EMAIL_VERIFIED_AT    = "email_verified_at";
    public static final String ATT_REMEMBER_TOKEN       = "remember_token";

    public static final String ATT_CREATED_AT           = "created_at";

    public static final String ATT_UPDATED_AT           = "updated_at";
    public static final String ATT_DELETED_AT           = "deleted_at";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID                   , nullable = false)
    private Long id;
    @Column(name = COL_EMAIL                , nullable = false)
    private String email;
    @Column(name = COL_AVATAR               , nullable = true)
    private String  avatar;
    @Column(name = COL_PASSWORD             , nullable = true)
    private String  password;
    @Column(name = COL_NAME                 , nullable = true)
    private String  name;
    @Column(name = COL_NICKNAME             , nullable = true)
    private String  nickname;
    @Column(name = COL_ROLE                 , nullable = false)
    private Integer role;
    @Column(name = COL_PHONE                , nullable = true)
    private String  phone;
    @Column(name = COL_LOCATION             , nullable = true)
    private String location;
    @Column(name = COL_DESCRIPTION          , nullable = true)
    private String description;
    @Column(name = COL_GENDER               , nullable = true)
    private Integer gender;
    @Column(name = COL_EMAIL_VERIFIED_AT    , nullable = true)
    private Date    email_verified_at;
    @Column(name = COL_REMEMBER_TOKEN       , nullable = true)
    private String  remember_token;
    @Column(name = COL_CREATED_AT           , nullable = true)
    private Date    created_at;
    @Column(name = COL_UPDATED_AT           , nullable = true)
    private Date    updated_at;
    @Column(name = COL_DELETED_AT           , nullable = true)
    private Date    deleted_at;

    public TaUsers() {}

    public TaUsers(int user_id) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
