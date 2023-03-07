package example04;

public class Time {
    // 접근제어자 (Access Modifier)
    // private : 같은 클래스 내에서만 접근 가능
    // protected : 같은 패키지, 자손 클래스에서만 접근 가능함
    // default : 같은 패키지에서만 접근 가능
    // public : 누구나 다 접근 가능

    // 프로그래밍을 할때, 멤버변수는 왠만하면 private접근제어자로
    // 감싸주고(캡슐화), 각 멤버변수에 해당하는 getter()를 제공해주는
    // 방법으로 클래스를 작성하는 것이 올바르다.
    private int hour;
    private int minute;
    private int second;


    // private 으로 선언된 값들에 대한 getter/setter
    // code -> generate -> getter, setter 에서 자동 생성가능
    // setter 는 잘 제공하지 않음.
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
        {
            System.out.println("시간을 잘못 입력하셨습니다.");
            return;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
        {
            System.out.println("분을 잘못 입력하셨습니다.");
            return;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59)
        {
            System.out.println("초를 잘못 입력하셨습니다.");
            return;
        }
        this.second = second;
    }

    public String toString() {
        return this.getHour() + "시 " +  this.getMinute() + "분 " +  this.getSecond() + "초 ";
    }
}
