package org.emnuelht.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryQuery {

    @PersistenceContext
    private EntityManager entityManager;

}
