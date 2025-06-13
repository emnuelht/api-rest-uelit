package org.emnuelht.Repository;

import org.emnuelht.Entitys.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<EntityUser, Long> {

}
