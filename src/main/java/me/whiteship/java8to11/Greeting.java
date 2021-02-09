package me.whiteship.java8to11;

public class Greeting {

    private String name;

    public Greeting() {
    }

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static String hi(String name) {
        return "Hi " + name;
    }
}
