package ch1;

public class VarLongEx1 {
    public static void main(String[] args) {
        // L,l : 대소문자 둘다 가능(생략가능)
        long value = 123456789L;

        value = 10000000000L;

        System.out.println(value);
        // print() 메소드 안의 + 의미는 연결 : ""랑 같이 있을 때
        System.out.println("value = " + value);
        // 산술연산
        System.out.println(value + value);
    }

}
