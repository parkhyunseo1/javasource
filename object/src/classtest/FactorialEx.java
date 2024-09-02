<<<<<<< HEAD
package classtest;

public class FactorialEx {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;

        } else {
            // 재귀호출(recursive call) : 메서드 내부에서 메서드 자신을 호출
            result = n * factorial(n - 1);
        }
        return result;
    }
}
=======
package classtest;

public class FactorialEx {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;

        } else {
            // 재귀호출(recursive call) : 메서드 내부에서 메서드 자신을 호출
            result = n * factorial(n - 1);
        }
        return result;
    }
}
>>>>>>> ce0a999417578a8be48c26f5566072d556a7963e
