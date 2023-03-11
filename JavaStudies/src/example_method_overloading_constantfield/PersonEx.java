package example_method_overloading_constantfield;

public class PersonEx {
    public static void main(String[] args) {
        Person_final p= new Person_final(50);
        // p.nation= "USA"; // final 은 값 변경 불가
        // p.age = 100; // 생성자 초기화 이후 값 대입도 불가
        System.out.println(p);
        System.out.println(Person_final.MAX_NUMBER);

        Person_final p1= new Person_final(50);
        Person_final p2= new Person_final(150);
        Person_final p3= new Person_final(250);

        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p3.age);
    }
}
