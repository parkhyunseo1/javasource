<<<<<<< HEAD
package poly;

public class ProductEx {
    public static void main(String[] args) {
        // 물건 구입
        Buyer buyer = new Buyer();

        // computer 구입
        buyer.buy(new Computer());
        // 에어컨 구입
        buyer.buy(new Air());

        System.out.println("현재 남은 돈 :" + buyer.money + "만 원");
        System.out.println("현재 남은 돈 :" + buyer.bonusPoint + "점");
    }
}
=======
package poly;

public class ProductEx {
    public static void main(String[] args) {
        // 물건 구입
        Buyer buyer = new Buyer();

        // computer 구입
        buyer.buy(new Computer());
        // 에어컨 구입
        buyer.buy(new Air());
    }
}
>>>>>>> ce0a999417578a8be48c26f5566072d556a7963e
