package ch3;

public class IffEx2 {
    public static void main(String[] args) {
        // 임의로 1 ~ 6 사이의 숫자 생성

        // 0.0 <= Math.random() < 1.0
        // System.out.println(Math.random());
        // 0.0 <= Math.random() < 1.0 * 6
        // System.out.println((int) Math.random() * 6);

        int random = (int) (Math.random() * 6) + 1;
        System.out.println("random " + random);

        if (random == 1) {
            System.out.println("주사위 1 이 나옴");
        } else if (random == 2) {
            System.out.println("주사위 2 가 나옴");
        } else if (random == 3) {
            System.out.println("주사위 3 이 나옴");
        } else if (random == 4) {
            System.out.println("주사위 4 가 나옴");
        } else if (random == 5) {
            System.out.println("주사위 5 가 나옴");
        } else if (random == 6) {
            System.out.println("주사위 6 이 나옴");
        }
    }
}
