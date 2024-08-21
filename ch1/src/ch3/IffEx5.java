package ch3;

import java.util.Scanner;

public class IffEx5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 근무 시간에 따른 임금 계산
        // 근무시간 입력받기
        // 8 시간까지 시간당 기본임금(10000) 제공
        // 초과근무시간은 시간당 기본임금 1.5배 제공

        int rate = 10000, pay = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 >> ");

        int hours = sc.nextInt();

        if (hours > 8) {
            pay = (int) (rate * (hours - 8) * 1.5) + rate * 8;

        } else {
            pay = rate * hours;

        }

        System.out.printf("근무 시간 : %d, 임금 : %d\n", hours, pay);

        sc.close();

    }

}
