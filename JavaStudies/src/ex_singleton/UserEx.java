package ex_singleton;

import example_method.Calculator;

import java.util.Calendar;
import java.util.Date;

public class UserEx {
    public static void main(String[] args) {
        // User user1 = new User();
        User user2 = User.getSingleton();
        User user3 = User.getSingleton();
        System.out.println(user2);
        System.out.println(user3);
        // 동일한 주소를 가리킴 (singleton)
        // ex_singleton.User@11531931
        // ex_singleton.User@11531931

        // if(user2 == user3)
        if(user2.equals(user3)) {
            System.out.println("같은 객체입니다.");
        }
        else {
            System.out.println("다른 객체입니다.");
        }

        // 싱글톤 패턴을 사용 하는 이유
        // 단 하나의 인스턴스를 생성해서 서로 공유할때 사용
        // ex) 사용자 환경설정, 커넥션 풀, 스레드 풀, os 운영체제 시간, 날짜 등
        // Calendar cal = new Calendar(); singleton 패턴이라 인스턴스 생성이 안됨
        Calendar cal = Calendar.getInstance();
        Date d = cal.getTime();
        System.out.println(d);
    }
}
