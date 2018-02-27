package com.company.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FeedbackRepository {

    @PersistenceContext
    private EntityManager entityManager;
}
