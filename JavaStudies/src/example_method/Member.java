package example_method;

public class Member {
    int iv = 100; // instance member variable
    static int cv = 200; // static member variable

    // instance method
    public void imethod() {
        System.out.println("iv : " + this.iv);
        System.out.println("cv : " + Member.cv);
    }

    // static method
    public static void smethod() {
        // System.out.println("iv : "+this.iv); // 언제 인스턴스가 만들어질지 모르므로  static 메서드에서 호출이 불가능하다
        System.out.println("cv : " + Member.cv); //  static 변수는 인스터느 생성없이 접근가능하므로 static method 에서 가능
    }
}
