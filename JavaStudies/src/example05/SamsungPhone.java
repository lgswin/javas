package example05;

public class SamsungPhone {
    private String company;
    private String model;
    private String color;
    private int release;

    public void setCompany(String company) {
        if (!company.equals("삼성")) {
            System.out.println("삼성폰이 아닙니다");
            return;
        }
        this.company = company;
    }

    public void setModel(String model) {
        if (!model.contains("갤럭시")) {
            System.out.println("삼성 모델이 아닙니다");
            return;
        }
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getRelease() {
        return release;
    }

    public String toString() {
        return this.getCompany() + " 회사의 " + this.getModel() + " 모델이며, 출시일은 "
                + this.getRelease() + "년 입니다. 색상은 " + this.getColor() + "색입니다.";
    }
}
