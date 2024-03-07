package org.example;

import org.junit.jupiter.api.*;

class MainTest {

    @BeforeAll
    static void init() {
        System.out.println("init test run");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach test run");
    }

    @Test
    void exampleFirstTest() {
        //given
        //when
        System.out.println("exampleFirstTest test run");
        //then
    }

    @Test
    void exampleSecondTest() {
        //given
        //when
        System.out.println("exampleSecondTest test run");
        //then
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach test run");
    }

    @AfterAll
    static void exit() {
        System.out.println("exit test run");
    }


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testWinningStrategy() {
        // Тестирование выигрышной стратегии
        //given
        //when
        //then
    }

    @Test
    void testLosingStrategy() {
        // Тестирование проигрышной стратегии
        //given
        //when
        //then
    }

    @Test
    void testNegativeCases() {
        // Негативные тесты, например, некорректные входные данные
        //given
        //when
        //then
    }

    @Test
    void notWorkTest() {
        //Проверка на ошибку в коде
        //given
        //when
        int a = 100 / 0;
        //then
        Assertions.assertTrue(true);
    }
}

