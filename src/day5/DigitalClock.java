package day5;

//. Nested Interface for Callback Handling
// •	Create a class TimeServer which declares a public static nested interface named Client with void updateTime(LocalDateTime now).
// •	The server class should have method registerClient(Client client) and notifyClients() to pass current time.
// •	Implement at least two classes implementing Client, registering them, and simulate notifications.

import java.time.LocalDateTime;

public class DigitalClock implements TimeServer.Client {
    private String name;
    public DigitalClock(String name) { this.name = name; }
    public void updateTime(LocalDateTime now) {
        System.out.println(name + " displays: " + now.toString());
    }
}
