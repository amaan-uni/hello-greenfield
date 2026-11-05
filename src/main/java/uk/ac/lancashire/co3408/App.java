package uk.ac.lancashire.co3408;

/**
 * A very small greenfield starter project for CO3408 Lab 5.
 */
public class App {

    /** Returns a greeting for the given name. */
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("World"));
    }
}
