package example_factorial;

public class FactorialEx {
    public static void main(String[] args) {
        long result = FactorialEx.factorial(5L);
        System.out.println("5! 의 값 : " + result);
    }

    public static long factorial(long n) {
        long result = 0L;
        if (n==1)
        {
            System.out.println("result 값 : " + result + " n값 : "+n);
            result = 1L;
        }
        else
        {
            System.out.println("result 값 : " + result + " n값 : "+n);
            long temp = factorial(n-1);
            result = n*temp;
            System.out.println(n+" * "+temp +" = "+result);
        }

        //System.out.println(" -> result : "+result);
        return result;
    }
}
