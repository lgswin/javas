package example_method;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        // instance 메서드 호출
        int addresult = cal.add(100, 200);
        System.out.println("add result : " + addresult);

        // static 메서드 호출
        long mulResult = Calculator.multiply(100,20);
        System.out.println("mulResult : " + mulResult);

        double divResult = Calculator.divide(10.55, 2.77);
        System.out.println("divREsult : "+divResult);

        // static method 에시
        Integer.parseInt("100");
        Math.random();
    }
}
