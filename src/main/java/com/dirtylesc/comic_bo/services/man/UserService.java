package com.dirtylesc.comic_bo.services.man;

import com.dirtylesc.comic_bo.entities.users.TaUsers;
import com.dirtylesc.comic_bo.entities.users.ViTranslators;
import com.dirtylesc.comic_bo.repositories.man.users.UserRepository;
import com.dirtylesc.comic_bo.repositories.man.users.ViUserRepository;
import jakarta.persistence.*;
import jakarta.persistence.criteria.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @PersistenceContext
    EntityManager   eManager;
    UserRepository  userRepository;
    ViUserRepository viUserRepository;

    @Autowired
    public UserService(UserRepository userRepository, ViUserRepository viUserRepository) {
        this.userRepository     = userRepository;
        this.viUserRepository   = viUserRepository;
    }

    public List<TaUsers> getLst() {
        return null;
//        return userRepository.getAllByRole(TaUsers.ROLE_TRANSLATOR);
    }

    public List<ViTranslators> reqLstTranslators_(String q) {
        CriteriaBuilder                 builder  = eManager.getCriteriaBuilder();
        CriteriaQuery<ViTranslators>    cqTrans  = builder.createQuery(ViTranslators.class);

        Root<ViTranslators> fromTrans       = cqTrans.from(ViTranslators.class);
        cqTrans.where(builder.equal(fromTrans.get(ViTranslators.ATT_ROLE)   , TaUsers.ROLE_TRANSLATOR));

        if(q != null && !q.isBlank()) {
            cqTrans.where(builder.or(
                    builder.equal(fromTrans.get(ViTranslators.ATT_NAME)     , q)),
                    builder.equal(fromTrans.get(ViTranslators.ATT_NICKNAME) , q));
        }

        fromTrans.join("teamUsers");
//                .join("team"       , JoinType.LEFT).get(TaTeams.ATT_USER_ID);

        TypedQuery<ViTranslators> query = eManager.createQuery(cqTrans);
        return query.getResultList();
    }

    public List<ViTranslators> reqLstTranslators(String q) {
        if(q == null) q = "";

        return viUserRepository.getAllTranslators(q, TaUsers.ROLE_TRANSLATOR, 8L);
    }

    public Boolean isTranslator() {
        return userRepository.isTranslator(TaUsers.ROLE_TRANSLATOR, 8L);
    }
}
