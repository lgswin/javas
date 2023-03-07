package example_card;

import java.util.spi.CalendarDataProvider;

public class CardEx {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.setColor("노랑");
        card1.setCompany("국민카드");

        System.out.println(card1);
        card1.show();

        // static 변수는 반드시 클래스명.static변수명으로 접근하여야하고
        // 왠만하면 공유변수는 분석하는 단계에서는 바꾸지 않는 것이 바람직한 방법이다.
        // card1.width = 80;
        // card1.height = 50;
        Card.width = 80;
        Card.height = 50;

        Card card2 = new Card();
        card2.setColor("파랑");
        card2.setCompany("농협");

        System.out.println(card2);
    }
}
