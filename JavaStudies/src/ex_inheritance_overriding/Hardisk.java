package ex_inheritance_overriding;

public class Hardisk extends Object{
    int capacity; // 용량
    int rpm; // 속도

    public Hardisk() {

    }

    public Hardisk(int capacity, int rpm) {
        this.capacity = capacity;
        this.rpm = rpm;
    }

    // HddDisk 사용자 정의 메서드
    public String status() {
        String str =    "하드디스크 용량 : " + this.capacity + "\n" +
                        "하드디스크 속도 : " + this.rpm + "(rpm)";

        return str;
    }
}
