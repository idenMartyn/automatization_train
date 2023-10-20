package junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class JunitTests {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }
    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @Test
    void firstTest() {
        System.out.println("firstTest");
        assertTrue(5 < 2);
    }

    @Test
    void secondTest() {
        System.out.println("secondTest");
        assertTrue(5 < 6);
    }
}
