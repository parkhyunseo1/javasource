package ch4;

public class ForEx8 {
    public static void main(String[] args) {
        // 4x + 5y = 60을 만족하는 x,y 값 출력
        // x,y는 10이하의 자연수

        // 4 * 1 + 5 * (1~10) = 60
        // 4 * 2 + 5 * (1~10) = 60
        // 출력 예시 (4,5)

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (4 * i + 5 * j == 60) {
                    System.out.printf("(%d,%d\n)", i, j);

                }

            }

        }

    }
}
