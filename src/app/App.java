package app;

import app.users.*;
// import app.vehicles.*;

public class App {
    public static void main(String[] args) {
        User user = new Client("JD123", "123", "Daniel", "Velásquez", "454598");
        // Vehicle vehicle = new Bus();
        System.out.println(user);
    }
}
