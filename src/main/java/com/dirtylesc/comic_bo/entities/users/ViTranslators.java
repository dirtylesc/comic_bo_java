package com.dirtylesc.comic_bo.entities.users;

import com.dirtylesc.comic_bo.def.DefDb;
import com.dirtylesc.comic_bo.entities.TaTeamUsers;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.CascadeType;

@Entity
@Getter
@Table(name = DefDb.TA_USERS)
public class ViTranslators {
    private static final Long serialVersionUID = 1000L;

    public static final String COL_ID                   = "id";
    public static final String COL_NAME                 = "name";
    public static final String COL_NICKNAME             = "nickname";
    public static final String COL_ROLE                 = "role";


    public static final String ATT_ID                   = "id";
    public static final String ATT_NAME                 = "name";
    public static final String ATT_NICKNAME             = "nickname";
    public static final String ATT_ROLE                 = "role";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = COL_ID                   , nullable = false)
    private Long    id;
    @Column(name = COL_NAME                 , nullable = true)
    private String  name;
    @Column(name = COL_NICKNAME             , nullable = true)
    private String  nickname;

//    @ManyToOne
//    @JoinColumn(name = ATT_ID, referencedColumnName = TaTeamUsers.ATT_USER_ID, insertable = false, updatable = false)
//    private TaTeamUsers teamUsers;

    public ViTranslators() {}

    public ViTranslators(int user_id) {
    }
}
