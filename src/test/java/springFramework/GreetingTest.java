package springFramework;

import org.junit.jupiter.api.*;

/**
 * @Author Gavin Chen
 * @Date 2020-12-30
 * @Version 1.0
 */
class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before - I am only called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each ....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        Assertions.assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void helloName() {
        Assertions.assertEquals("Hello John", greeting.helloName("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each ....");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After - I am only called once!!!");
    }
}