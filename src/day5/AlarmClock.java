package day5;

import java.time.LocalDateTime;

//. Nested Interface for Callback Handling
// •	Create a class TimeServer which declares a public static nested interface named Client with void updateTime(LocalDateTime now).
// •	The server class should have method registerClient(Client client) and notifyClients() to pass current time.
// •	Implement at least two classes implementing Client, registering them, and simulate notifications.


public class AlarmClock implements TimeServer.Client {
    private String name;
    private LocalDateTime alarmTime;
    public AlarmClock(String name, LocalDateTime alarmTime) {
        this.name = name;
        this.alarmTime = alarmTime;
    }
    public void updateTime(LocalDateTime now) {
        System.out.println(name + " received time: " + now.toString());
        if (alarmTime != null && now.isAfter(alarmTime)) {
            System.out.println(name + " - ALARM! Time's up!");
            alarmTime = null;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        TimeServer server = new TimeServer();
        DigitalClock clock1 = new DigitalClock("Kitchen Clock");
        DigitalClock clock2 = new DigitalClock("Bedroom Clock");
        AlarmClock alarm = new AlarmClock("Morning Alarm", LocalDateTime.now().plusSeconds(2));
        server.registerClient(clock1);
        server.registerClient(clock2);
        server.registerClient(alarm);
        server.notifyClients();
        Thread.sleep(3000);
        server.notifyClients();
    }
}
