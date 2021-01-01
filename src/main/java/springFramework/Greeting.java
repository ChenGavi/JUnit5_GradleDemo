package springFramework;

/**
 * @Author Gavin Chen
 * @Date 2020-12-30
 * @Version 1.0
 */
public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld(){ return HELLO + " " + WORLD;}
    public String helloName(String name){ return HELLO + " " + name; }

}
