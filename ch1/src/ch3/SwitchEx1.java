package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {
        // switch : if ~ els if ~ else 대체

        // switch (char or Sring or int) {
        // case value:

        // break;

        // default:
        // break;
        int random = (int) (Math.random() * 6) + 1;
        switch (random) {
            case 1: // random ==1
                System.out.println("주사위 1 이 나옴");
                break;
            case 2: // random ==2
                System.out.println("주사위 2 가 나옴");
                break;
            case 3: // random ==3
                System.out.println("주사위 3 이 나옴");
                break;
            case 4: // random ==4
                System.out.println("주사위 4 가 나옴");
                break;
            case 5: // random ==5
                System.out.println("주사위 5 가 나옴");
                break;

            default: // else
                System.out.println("주사위 6 이 나옴");
                break;
        }
    }
}
