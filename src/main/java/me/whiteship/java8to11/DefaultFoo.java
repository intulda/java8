package me.whiteship.java8to11;

public class DefaultFoo implements Foo, Bar {

    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Default Foo");
    }

    //디폴트메소드가 충돌할 경우 직접 구현해야함.
    @Override
    public void printNameUpperCase() {

    }

    @Override
    public String getName() {
        return this.name;
    }
}
