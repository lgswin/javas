package example_card;

public class Card {

    // instance variables - 반드시 인스턴스를 생성해야 접근 가능
    private String color;
    private String company;

    // static variables - 인스턴스 생성 없이도 클래스명.static변수명 으로 접근 가능
    // class memory 영역에 올라감
    static int width = 100;
    static int height = 50;

    // instance methods
    public String getColor() {
        return color;
    }

    public String getCompany() {
        return company;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void show() {
        // 지역변수는 반드시 초기화해야한다.
        // 메서드 안에 static 변수를 사용하지 못한다. 그 이유는
        // static 의 특성은 인스턴스 생성없이도 얼마든지 접근 가능해야되는데
        // 언제 인스턴스가 생성될지 아무도 모르기때문에 이렇게 코드를 작성하는것은
        // 올바른 방법이 아니다.
        // static int i = 10;
        String color = this.color;
        String company = this.company;
        System.out.println(color +", " + company);
    }
    @Override
    public String toString() {
        // 정적변수는 접근 방법이 반드시 클래스명.static변수명으로 접근해야 올바른 방법이다.
        return "card1의 색상 : " + this.color + " card1의 회사 : " + this.company
                + " 크기 : (" + Card.height + ", " + Card.width + ")";
    }
}
