package ex_this;

public class Car {
    String color;
    String gearType;
    int door;

    // 기본 생성자
    //
    public Car() {
//        this.color = "노랑";
//        this.gearType = "오토";
//        this.door = 4;
        // 매개변수를 직접 초기화하기보다
        // 같은 클래스내에 있는 매개벼내수가 3개 있는 생성자를 호출하는 것이 좋음
        this("노랑", "오토", 4);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public Car(Car a) {
        this.color = a.color;
        this.gearType = a.gearType;
        this.door = a.door;
    }

    public Car(String color, String gearType) {
        this.color = color;
        this.gearType = gearType;
    }

    public Car(int door) {
        this.door = door;
    }

    public String toString() {
        return this.color + ", " + this.gearType + ", " + this.door;
    }
}
