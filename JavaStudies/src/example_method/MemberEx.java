package example_method;

public class MemberEx {
    public static void main(String[] args) {
        // 아래 static 멤버들이므로 인스턴스 생성벖이 얼마든지 클래스명.정적멤버명으로
        // 접근 가능하다 라는 것을 보여주고있다.
        // static은 static만 호출이 가능하다.
        Member.smethod();
        Member.cv = 500;
        Member.smethod();

        // 인스턴스 멤버들을 사용하기 위해서는 반드시 new라는 연산자가 힙에다가
        // 인스턴스를 만들어야 사용이 가능하다.
        Member m = new Member();
        m.imethod();
        m.iv = 999;
        m.imethod();
    }
}
