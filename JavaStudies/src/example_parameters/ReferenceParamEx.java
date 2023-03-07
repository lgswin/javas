package example_parameters;

public class ReferenceParamEx {
    public static void main(String[] args) {
        A a = new A();
        a.data = 77;
        System.out.println("메서드 호출전 main() 내의 값 : " + a.data);
        // 동생한테 "시계가 어딨니" 라고 물어보는 형태라서 값을 ㅇ릭고 수정도 할수 있다.
        // Call by Reference (주소에 의한 호출)
        ReferenceParamEx.datachange(a); //
        System.out.println("datachange() 호출 후 : "+ a.data);
    }

    // int[], double[], String --> 참조변수형태의 호출
    public static void datachange(A a) {
        // a 라는 주소값을 매개변수로 넘어왔기 때문에 주소를 공유한다.
        // a 라는 주소를 공유하게 되면 호출한 곳에서 영향을 무조건 받는다.
        a.data = 44;
        System.out.println("datachange()내의 값 : "+ a.data);
        return;
    }
}
