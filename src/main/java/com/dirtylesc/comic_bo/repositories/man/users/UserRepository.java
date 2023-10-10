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
    @Query(value = "Select 1 from TaUsers " +
            "where id = :curUserId and role = :role " +
            "limit 1", nativeQuery = true)
    Boolean isTranslator(@Param("role") Integer role, @Param("curUserId") Long userId);
}
