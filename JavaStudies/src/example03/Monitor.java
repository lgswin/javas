package example03;
public class Monitor {

    //  멤버변수(필드)
    String color;
    int channel;
    int volume;
    boolean power;

    // 멤버 메서드
    public void power() {
        if (!this.power) {
            System.out.println("모니터가 켜졌습니다.");
            this.power = !power;
        }
        else {
            System.out.println("모니터가 꺼졌습니다.");
            this.power = !power;
        }
    }

    public void channelup() {
        this.channel++;
        System.out.println("현재 채널 : " +  this.channel);
    }

    public void channeldown() {
        this.channel--;
        System.out.println("현재 채널 : " +  this.channel);
    }

    public void volumeUp() {
        System.out.println("현재 볼륨 : " +  ++this.volume);
    }

    public void volumeDown() {
        System.out.println("현재 볼륨 : " +  --this.volume);
    }

    // toString 재정의
    @Override
    public String toString() {
        return "현재 채널 : " + this.channel + ", 현재 볼륨 : " + this.volume;
    }
}
