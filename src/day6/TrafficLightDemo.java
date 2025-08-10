package day6;

//Traffic Light State Machine
//Implement enum TrafficLight implementing interface State, with constants RED, GREEN, YELLOW.
//Each must override State next() to transition in the cycle.
//Simulate and print six transitions starting from RED.

public class TrafficLightDemo {
    interface State {
        State next();
    }

    enum TrafficLight implements State {
        RED {
            public State next() { return GREEN; }
        },
        GREEN {
            public State next() { return YELLOW; }
        },
        YELLOW {
            public State next() { return RED; }
        };
    }

    public static void main(String[] args) {
        State state = TrafficLight.RED;
        for (int i = 0; i < 6; i++) {
            System.out.println("Current Light: " + state);
            state = state.next();
        }
    }
}
