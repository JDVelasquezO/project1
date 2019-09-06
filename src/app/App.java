package app;

import app.users.*;

public class App {
    public static void main(String[] args) {
        User user1 = new Client("JD123", "123", "Daniel", "Velásquez", "454598");
        System.out.println(user1);
    }
}
