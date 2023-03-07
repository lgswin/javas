package example05;

public class SamsungPhoneEx {
    public static void main(String[] args) {
        SamsungPhone sam = new SamsungPhone();
        sam.setCompany("삼성");
        sam.setModel("갤럭시 s23");
        sam.setRelease(2018);
        sam.setColor("검정");
        System.out.println(sam);
    }
}
