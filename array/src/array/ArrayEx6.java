package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 79, 88, 91, 33, 100, 55, 95 };

        // 배열 요소 중에서 가장 큰 값과 가장 작은 값 구하기
        int min = scores[0], max = scores[0];
        // for (int i = 0; i < scores.length; i++) {

        // if (min > scores[i]) {
        // min = scores[i];

        // }
        // if (scores[i] > max) {
        // max = scores[i];

        // }

        // }
        for (int score : scores) {
            if (min > score) {
                min = score;

            }
            if (score > max) {
                max = score;

            }

        }

        System.out.println("제일 큰 수는 : " + max);
        System.out.println("제일 작은 수는 : " + min);

    }

}
