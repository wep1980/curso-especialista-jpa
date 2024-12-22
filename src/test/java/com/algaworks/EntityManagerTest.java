package com.algaworks;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class EntityManagerTest {

    protected static EntityManagerFactory entityManagerFactory;

    protected EntityManager entityManager;

    @BeforeAll //Metodo que se inicia antes de tudo
    public static void setUpBeforeClass() {
        entityManagerFactory = Persistence
                .createEntityManagerFactory("Ecommerce-PU");
    }

    @AfterAll // Metodo que funciona depois de tudo
    public static void tearDownAfterClass() {
        entityManagerFactory.close();
    }

    @BeforeEach //Metodo executado antes de cada teste da classe
    public void setUp() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterEach //Metodo executado apos cada teste da claase
    public void tearDown() {
        entityManager.close();
    }
}
