package ch4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {

        boolean run = true;
        int balance = 0; // 잔액

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("============================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("============================================");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 잔액 = 잔액 + 입금액
                    // balance = balance + sc.nextInt();
                    System.out.print("입금할 금액을 입력해주세요 > > ");
                    int won = sc.nextInt();
                    balance = balance + won;
                    System.out.printf("입금 완료 후 잔액 : %4d원", balance);
                    System.out.println();

                    break;
                case 2:
                    // 잔액 = 잔액 - 출금액
                    // balance = balance - sc.nextInt();
                    System.out.print("출금할 금액을 입력해주세요 > > ");
                    won = sc.nextInt();
                    balance = balance - won;
                    System.out.printf("출금 완료 후 잔액 : %4d", balance);
                    System.out.println();

                    break;

                case 3:
                    // 잔액 출력
                    // System.out.println("현재잔액" + balance);

                    System.out.printf("잔액 : %4d", balance);
                    System.out.println();

                    break;

                case 4:
                    run = false;

                    break;

            }
        }

    }
}
