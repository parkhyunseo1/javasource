<<<<<<< HEAD
package classtest;

public class DataEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // change(d.x); 값 복사
        change(d); // 주소복사
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

    }

    // static void change(int x){
    // x = 10000;
    // System.out.println("change() : x =" + x);
    // }
    static void change(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);
    }
}
=======
package classtest;

public class DataEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // change(d.x); 값 복사
        change(d); // 주소복사
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

    }

    // static void change(int x){
    // x = 10000;
    // System.out.println("change() : x =" + x);
    // }
    static void change(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);
    }
}
>>>>>>> ce0a999417578a8be48c26f5566072d556a7963e
