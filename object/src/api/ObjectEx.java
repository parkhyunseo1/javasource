package api;

public class ObjectEx {
    public static void main(String[] args) {
        // java.lang.Object : root 클래스

        // 인스턴스 생성
        ObjectEx obj1 = new ObjectEx();
        ObjectEx obj2 = new ObjectEx();

        // equals() : 주소 비교
        System.out.println(obj1.equals(obj2) ? "같다" : "다르다");
        System.out.println(obj1 == obj2 ? "같다" : "다르다");

        // toString() : 객체가 저장된 곳의 주소
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        // 사용자 지정 클래스
        // 값이 같으면 true를 만들기 위해 equals()로 재정의
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2) ? "같다" : "다르다");
        // 객체가 가지고 있는 값의 출력으로 바꾸려면 toString()으로 재정의
        System.out.println(v1.toString());
        System.out.println(v2.toString());

    }
}
