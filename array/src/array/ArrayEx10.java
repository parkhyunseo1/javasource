package array;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 원래의 단어 맞추기
        String[] words = { "television", "computer", "mouse", "phone" };

        for (int i = 0; i < words.length; i++) {
            // 문제 출제
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                int pos = (int) (Math.random() * question.length);

                char temp = question[j];
                question[j] = question[pos];
                question[pos] = temp;
            }

            System.out.printf("Q%d) %s의 원래 단어는 무엇일까요?", i + 1, new String(question));

            // 답변 입력
            // 사용자의 답변이 원래 단어와 일치하는지 확인
            Scanner sc = new Scanner(System.in);

            System.out.print("답변을 입력 해주세요>> ");

            String answer = sc.nextLine();

            if (words[i].equals(answer)) {
                System.out.print("정답입니다");

            } else {
                System.out.print("오답입니다");

            }

        }
    }
}
