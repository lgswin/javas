package ex_this;

import example_method.Member;

public class Product {
    static int number = 0;
    int countNo;
    int[] arr = new int[10];

    // 인스턴스 초기화 블럭 (정적 멤버 사용할 수 있음)
    {
        ++number;
        this.countNo = Product.number;
        for (int i = 0; i <arr.length ; i++) {
            this.arr[i] = (int)(Math.random()*10) +1;
        }
    }

    public Product() {
        System.out.println("기본생성자 호출됨");
    }


}
