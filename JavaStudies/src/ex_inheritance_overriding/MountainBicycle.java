package ex_inheritance_overriding;

public class MountainBicycle extends Bicycle{
    String frame;
    int gear;
    int price;

    public void print() {
        System.out.println("id : " + this.id);
        System.out.println("brand : " + this.brand);
        System.out.println("frame : " + this.frame);
        System.out.println("gear : " + this.gear);
        System.out.println("price : " + this.price);
    }

    public static void main(String[] args) {
        MountainBicycle mountainBicycle = new MountainBicycle();
        mountainBicycle.id = 1111;
        mountainBicycle.brand = "LESPO";
        mountainBicycle.frame = "알루미늄";
        mountainBicycle.gear = 30;
        mountainBicycle.price = 30000;
        mountainBicycle.owner = "홍길동";
        mountainBicycle.print();
    }
}
