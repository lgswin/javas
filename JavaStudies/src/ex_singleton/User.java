package ex_singleton;

public class User {
    // 해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성을 하고 있다.
    private static User singleton = new User();

    // 해당 클래스를 외부에서 new 연산자로 인스턴스를 생성 못하게 막자.
    private User() {

    }

    public static void add() {
        System.out.println("add 메서트 호출");
    }
    //
    public static User getSingleton() {
        return User.singleton;
    }
}
