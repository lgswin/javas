package example_method;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int substract (int x, int y) {
        return x - y;
    }

    // static method
    // static 의 특성 : 인스턴스 생성없이 클래스명 정적 메서드명으로 바로 접근가능하
    public static long multiply(long x, long y) {
        // static 메서드는 이미 메모리 상단에 올라가있고 인스턴스 생성없이 접근이 가능해야되는데,
        // 아래 코드는 인스턴스가 생성되어야지만 사용가능한 add()가 왔기 때문에 예외가 발생하는것이다.
        // 인스턴스가 언제 생성될지 아무도 모르기때문에 static 메서드 안에서 인스턴스 메서드가 절대로 오면 안된다.
        // this.add(10,5);
        return x * y;
    }


    public static double divide (double x, double y) {
        return x/y;
    }
}
