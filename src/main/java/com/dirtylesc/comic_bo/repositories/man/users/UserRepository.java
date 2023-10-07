package com.dirtylesc.comic_bo.repositories.man.users;

import com.dirtylesc.comic_bo.entities.users.TaUsers;
import com.dirtylesc.comic_bo.entities.users.ViTranslators;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<TaUsers, Long> {

//    @Query(value = "select ta_u.id, ta_u.name, ta_u.nickname " +
//            "from users ta_u " +
//            "left join team_users ta_tu on ta_tu.user_id=ta_u.id " +
//            "left join teams ta_t on ta_t.id=ta_tu.team_id " +
//            "where ta_u.role=:role " +
//            "and (ta_u.name like %:q% or ta_u.nickname like %:q%) " +
//            "and ta_t.user_id = 8", nativeQuery = true)
//    List<ViTranslators> getAllTranslators(@Param("q") String q, @Param("role") Integer role);


    @Query(value = "Select 1 from TaUsers " +
            "where id = :curUserId and role = :role " +
            "limit 1", nativeQuery = true)
    Boolean isTranslator(@Param("role") Integer role, @Param("curUserId") Long userId);
}
