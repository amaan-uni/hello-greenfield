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
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println(greet(name));
    }}
