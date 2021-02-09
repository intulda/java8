package me.whiteship.java8to11;

public interface Bar {

    /**
     * @implSepc 이 구현체는 getName()을 대문자로 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    String getName();
}
