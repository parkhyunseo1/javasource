<<<<<<< HEAD
package modifier;

public final class FinalTest {
    // 상수(대문자) 선언
    final int MAX_SIZE = 10;

    final int getMaxSize() {
        // final 지역변수 == 상수와 같은 역할
        final int LV = MAX_SIZE;
        return MAX_SIZE;
    }
}

=======
package modifier;

public final class FinalTest {
    // 상수(대문자) 선언
    final int MAX_SIZE = 10;

    final int getMaxSize() {
        // final 지역변수 == 상수와 같은 역할
        final int LV = MAX_SIZE;
        return MAX_SIZE;
    }
}

>>>>>>> ce0a999417578a8be48c26f5566072d556a7963e
// class A extends FinalTest{} (X)