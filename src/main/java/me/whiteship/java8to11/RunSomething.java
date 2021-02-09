package me.whiteship.java8to11;

/**
 *  오로지 추상 메소드가 하나만 있으면 함수형 인터페이스
 *  인터페이스에 static 메소드 default를 선언 할 수 있다.
 *
 *  아래와 같은 하나를 받아서 하나를 리턴하는 인터페이스는 기존 자바에서 지원하기 때문에 필요없는 인터페이스
 */
@FunctionalInterface
public interface RunSomething {
    int doIt(int number);

    static void printName() {
        System.out.println("BoGeun");
    }

    default void printAge() {
        System.out.println("30");
    }
}
