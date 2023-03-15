package ex_inheritance_overriding;

public class Circle extends Shape{
    Point center;
    int radius;

    public Circle() {
        this(new Point(0,0), 100);
    }

    public Circle(Point center, int radius) {
        System.out.println("Circle 메서드에 매개변수가 있는 생성자 호출");
        this.center = center;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("색깔 : " + this.color);
        System.out.println("원점 : (x : " + this.center.x + ", y : " + this.center.y + "), 반지름 :"+this.radius);
    }
}

