package example_method_overloading_constantfield;

class A {
    int data1= 10;
    int data2 = 30;
}
public class AccumulatorEx {
    public static void main(String[] args) {
        Accumulator_overloading ac = new Accumulator_overloading();
        int iresult = ac.add(10, 50);
        System.out.println("iresult : " + iresult);

        long lresult = ac.add(100, 7500L); // type 구분을 위해서 접미사 L 을 반드시 붙여줘야함.
        System.out.println("lresult : " + lresult);

        lresult = ac.add(1000L, 10);
        System.out.println("lresult : " + lresult);

        double dresult = ac.add(107.88, 11.55);
        System.out.println("dresult : " + dresult);

        long arrResult = ac.add(new int[] {1,2,3,4,5});
        System.out.println("arrResult : " + arrResult);

        iresult = ac.add(new A());
        System.out.println("iresult : "+iresult);
    }
}
