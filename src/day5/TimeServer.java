package day5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//5. Nested Interface for Callback Handling
//•	Create a class TimeServer which declares a public static nested interface named Client with void updateTime(LocalDateTime now).
//•	The server class should have method registerClient(Client client) and notifyClients() to pass current time.
//•	Implement at least two classes implementing Client, registering them, and simulate notifications


public class TimeServer {
    public static interface Client {
        void updateTime(LocalDateTime now);
    }
    private List<Client> clients;
    public TimeServer() {
        this.clients = new ArrayList<>();
    }
    public void registerClient(Client client) {
        clients.add(client);
        System.out.println("Client registered");
    }
    public void notifyClients() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Notifying " + clients.size() + " clients...");
        for (Client client : clients) {
            client.updateTime(currentTime);
        }
    }
}
