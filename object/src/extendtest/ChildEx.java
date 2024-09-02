<<<<<<< HEAD
package extendtest;

public class ChildEx {
    public static void main(String[] args) {

        // 부모 클래스는 자신에게 선언된 멤버와 메소드만 접근가능
        Parent parent = new Parent();

        // 자식 클래스는 부모의 멤버와 메소드 + 자신의 멤버와 메소드 접근가능
        Child child = new Child();
        child.print();// 부모 메소드 호출 가능
        child.play(); // 자식 메소드 호출

        child.
    }
}
=======
package extendtest;

public class ChildEx {
    public static void main(String[] args) {

        // 부모 클래스는 자신에게 선언된 멤버와 메소드만 접근가능
        Parent parent = new Parent();

        // 자식 클래스는 부모의 멤버와 메소드 + 자신의 멤버와 메소드 접근가능
        Child child = new Child();
        child.print();// 부모 메소드 호출 가능
        child.play(); // 자식 메소드 호출

        child.
    }
}
>>>>>>> ce0a999417578a8be48c26f5566072d556a7963e
