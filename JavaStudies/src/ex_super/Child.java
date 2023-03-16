package ex_super;

public class Child extends Parent{
    int x = 20;

    public Child() {
        super(); // 조상 클래스의 기본 생성자, 생략하더라도 컴파일러가 자동으로 추가해준다.
        System.out.println("자손 클래스의 생성자 호출");
    }

    public void show() {
        System.out.println("현재 인스턴스의 x = " + x);
        System.out.println("자손 클래스의 x = " + this.x);
        System.out.println("조상 클래스의 x = "+ super.x);
    }
}
