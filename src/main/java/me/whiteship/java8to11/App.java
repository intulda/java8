package me.whiteship.java8to11;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("bogeun");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnyThing();
    }
}
