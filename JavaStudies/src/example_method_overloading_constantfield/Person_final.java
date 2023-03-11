package example_method_overloading_constantfield;

public class Person_final {

    // 불변의 정적 상수
    // 공용데이터로써 사용되어지고 함부로 변경하지 않는것이 좋다.
    // 클래별로 관리되어진다.
    // 메모리상 하나만 생성되고 주소만 공유되어진다.
    static final int MAX_NUMBER = 1000; // 선언과 동시에 무조건 초기화 해야함

    // final 초기화 방법
    // 1. 선언과 동ㅅ디에 초기화
    // 2. 생성자에서 단 한번 초기화
    final String nation = "KOREA"; // 상수선언
    final int age; // 생성자가 없으면 에러

    public Person_final(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "nation : " + this.nation + " age : " + this.age;
    }
}
