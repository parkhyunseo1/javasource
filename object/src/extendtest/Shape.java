package extendtest;

public class Shape {
    private String color = "black";

    void draw() {
        System.out.printf("[color =%s]\n", color);
    }

    public String getColor() {
        return color;
    }

}
