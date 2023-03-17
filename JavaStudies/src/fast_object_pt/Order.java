package fast_object_pt;

import java.util.Scanner;

public class Order {
    String orderNum;
    String phoneNum;
    String address;
    String date;
    String time;
    int price;
    String menuId;

    public Order() {

    }

    public Order(String orderNum, String phoneNum, String address, String date, String time, int price, String menuId) {
        this.orderNum = orderNum;
        this.phoneNum = phoneNum;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuId = menuId;
    }

    public void printOder() {
        System.out.println("주문 접수 번호 : " + this.orderNum);
        System.out.println("주문 핸드폰 번호 : " + this.phoneNum);
        System.out.println("주문 집 주소 : " + this.address );
        System.out.println("주문 날짜 : " + this.date);
        System.out.println("주문 시간 : " + this.time);
        System.out.println("주문 가격 : " + this.price);
        System.out.println("주문 번호 : " + this.menuId);
    }

    public void takeOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주문 접수 번호 : ");
        this.orderNum = sc.next();
        System.out.print("주문 핸드폰 번호 : ");
        this.phoneNum = sc.next();
        sc.nextLine();
        System.out.print("주문 집 주소 : ");
        this.address = sc.nextLine();
        System.out.print("주문 날짜 : ");
        this.date = sc.next();
        System.out.print("주문 시간 : ");
        this.time = sc.next();
        System.out.print("주문 가격 : ");
        this.price = sc.nextInt();
        System.out.print("메뉴 번호 : ");
        this.menuId = sc.next();
    }
}
