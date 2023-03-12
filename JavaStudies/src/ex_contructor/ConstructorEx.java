package ex_contructor;

// A클래스는 컴파일러가 기본생성자를 자동으로 생성
class A {
    int value;
}

class B {
    int value;
    public B(int value) {
        this.value = value;
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        A a = new A();
        // B b = new B(); // => 기본 생성자를 추가해주거나, 매개변수를 넣어주거나 해야함
    }
}
