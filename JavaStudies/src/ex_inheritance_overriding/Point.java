package ex_inheritance_overriding;

public class Point {

    int x;
    int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        System.out.println("Point 클래스의 매개변수가 있는 생성자 호출");
        this.x = x;
        this.y = y;
    }
}
