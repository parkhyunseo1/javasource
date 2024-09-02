package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {

    private String title;

    // User 리스트 생성
    List<User> users = new ArrayList<>();

    // 상품 리스트 생성
    List<Product> products = new ArrayList<>();

    // cart 리스트생성
    List<Product> cart = new ArrayList<>();;

    Scanner sc = new Scanner(System.in);

    // 선택된 user 의 index 보관
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUSer() {
        // user 2명을 생성 후 users 배열 담기

        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향 ", PayType.CASH));

    }

    @Override
    public void genProduct() {
        // CellPhone, SmartTv 5개 생성 후 products 배열 담기
        products.add(new CellPhone("아이폰13", 150000, "KT"));
        products.add(new CellPhone("아이폰14", 250000, "SKT"));
        products.add(new CellPhone("아이폰15", 350000, "LG"));
        products.add(new SmartTv("삼성 울트라 HD", 1800000, "4K"));
        products.add(new SmartTv("LG 스마트", 1400000, "1080p"));
    }

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택
        // ==============================
        // [1] 홍길동(CARD)
        // [2] 성춘향(CASH)
        // [x] 종료
        // 선택 >>

        System.out.println(this.title + " : 메인화면 - 계정선택");
        System.out.println("========================================");
        for (int i = 0; i < users.size(); i++) {
            System.out.printf("[%d] %s(%d)\n" + (i + 1), users.get(i).getName(), users.get(i).getPayType());
        }
        System.out.println("[x] 종료");
        System.out.print("선택 >> ");
        // 사용자 입력 : 1,2,x
        // 사용자 입력이 1,2 인 경우 prodcutList() 호출
        // X 인 경우 : System.exit(0)

        String input = sc.nextLine();

        switch (input) {
            case "1":
            case "2":
                // 배열 인덱스와 동일
                selUser = Integer.parseInt(input) - 1;
                productList();
                break;
            case "X":
            case "x":
                System.exit(0);
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }

    }

    public void productList() {
        // 출력
        // MyShop : 상품목록 - 상품선택
        // ==============================
        // [1] 상품 보여주기
        // [2] 상품 보여주기
        // [3] ~[5]
        // [h] 메인화면
        // [c] 체크아웃
        // 선택 >>
        System.out.println(this.title + " : 상품목록 - 상품선택");
        System.out.println("========================================");

        int i = 1;
        for (Product product : products) {
            System.out.printf("[%d]", i++);
            product.printDetail();

        }
        System.out.println("[h]메인화면");
        System.out.println("[c]체크아웃");
        System.out.println("[x] 종료");
        System.out.print("선택 >> ");

        // 0~4 or h or c
        // h : 메인화면 - 계정선택 호출
        // c : checkOut() 호출
        // 0 ~ 4 : cart에 담기

        // 메뉴 받기
        String input = sc.nextLine();

        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // 0~4 넣기
                int no = Integer.parseInt(input);
                cart.add(products.get(no));
                productList();
                break;
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;
            default:
                System.out.println("입력을 확인해 주세요");
                productList();
                break;
        }
    }

    public void checkOut() {
        // cart 화면 출력
        System.out.println(this.title + "-  " + users.get(selUser).getName() + " : 체크아웃");
        System.out.println("========================================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getpName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        // 결제방법 : CARD or CASH
        System.out.println("결제방법 : " + users.get(selUser).getPayType());
        // 합계 : 카트에 담긴 물건
        System.out.println("합계 : " + sum);
        // [p] 이전
        System.out.println("[p] 이전");
        // [q] 결제완료
        System.out.println("[q] 결제완료");
        // 입력값에 따라
        String input = sc.nextLine();
        // p : 상품목록 화면 보여주기
        switch (input) {
            case "p":
                productList();
                break;
            // q : 종료
            case "q":
                System.exit(0);
                break;

            default:
                System.out.println("입력값을 확인해 주세요");
                checkOut();
                break;
        }
        // q : 종료
    }
}
