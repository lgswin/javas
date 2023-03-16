package ex_inheritance_overriding;

public class HddEx {
    public static void main(String[] args) {
        Hardisk hardisk = new Hardisk(500, 7200);
        UsbMemory usbMemory= new UsbMemory(32, 960);

        System.out.println("HDD 상세 ");
        System.out.println(hardisk.status());

        System.out.println("USB 상세 ");
        System.out.println(usbMemory.status());
        System.out.println(usbMemory.status(9999));
    }
}
