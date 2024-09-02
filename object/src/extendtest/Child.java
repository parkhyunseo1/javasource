<<<<<<< HEAD
package extendtest;

public class Child extends Parent {

    String name;

    void play() {
        System.out.println("놀자!!!!");
    }

    @Override
    void print() {
        super.print(); // 가려지는 부모 메소드 호출
        System.out.println("자식 메소드");
    }
}
=======
package extendtest;

public class Child extends Parent {

    String name;

    void play() {
        System.out.println("놀자!!!!");
    }

    @Override
    void print() {
        super.print(); // 가려지는 부모 메소드 호출
        System.out.println("자식 메소드");
    }
}
>>>>>>> ce0a999417578a8be48c26f5566072d556a7963e
