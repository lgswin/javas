package example_method_overloading_constantfield;

public class MemberReferEx{
    int iv;
    static int cv;
    // 인스턴스 메서드
    // 이유  : 인스턴스 메서드가 호출될 때는 이미 인스턴스가 생성 되어 있을 것임.
    public void instanceMethod() {
        System.out.println(this.iv); // 인스턴스 변수 사용 가능
        System.out.println(cv); // 정적 멤버 변수 사용 가능
        staticMethod(); // 정적 멤버 메서드 사용 가능
    }

    // 인스턴스가 언제 생성될지 아무도 모르기 때문에 정적 메서드 내에서는
    // 인스턴스 멤버들은 절대 사용할 수가 없다.
    public static void staticMethod() {
        //System.out.println(this.iv); // 인스턴스 변수 사용 불가
        System.out.println(cv);  // 정적 멤버 변수 사용 가능
        //this.instanceMethod(); // 인스턴스 멤버 메서드 사용 불가
    }


}
