package classtest;

public class Square {
    // 직사가형(가로, 세로) 넓이, 정사각형(가로)의 넓이
    // 메소드 오버로딩
    double areaRectangle(double w, double h) {
        return w * h;

    }

    double areaRectangle(double w) {
        return w * w;
    }

}
