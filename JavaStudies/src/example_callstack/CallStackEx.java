package example_callstack;

public class CallStackEx {
    public static void main(String[] args) {
        // 콜스택은 후입선출FIFO이다  큐는 선입선출LIFO
        System.out.println("main() 실행됨");
        CallStackEx.first(); // static method에서는 static만 호출가능
        System.out.println("main() 종료됨");
    }

    public static void first() {
        System.out.println("first() 실행됨");
        CallStackEx.second();
        System.out.println("first() 종료됨");
    }

    public static void second() {
        System.out.println("second() 실행됨");
        CallStackEx.third();
        System.out.println("second() 종료됨");
    }

    public static void third() {
        System.out.println("third() 실행됨");
        System.out.println("third() 종료됨");
    }
}
