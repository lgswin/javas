package example03;

public class MonitorEx {
    public static void main(String[] args) {

        // monitor 참조 변수는 리모컨과 같은 역할이라고 생각하자
        Monitor monitor = new Monitor();
        System.out.println(monitor);

        monitor.power();
        monitor.channelup();
        monitor.channelup();
        monitor.channeldown();
        monitor.channeldown();
        monitor.volumeUp();
        monitor.volumeUp();

        System.out.println(monitor);
        monitor.power();
    }
}
