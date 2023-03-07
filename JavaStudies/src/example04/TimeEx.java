package example04;

public class TimeEx {
    public static void main(String[] args) {
        Time t1 = new Time();
        // private 로 선언하면 멤버변수 접근이 불가능 t1.hour X
        System.out.println(t1);
        t1.setHour(10);
        t1.setMinute(30);
        t1.setSecond(50);
        System.out.println(t1);
        t1.setHour(24);
        t1.setMinute(60);
        t1.setSecond(60);
        System.out.println(t1);
    }
}
