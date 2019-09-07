package app;

import app.vehicles.Airplane;
import app.vehicles.Vehicle;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicle = new Vehicle[2];

        for (int i = 0; i < vehicle.length; i++){
            vehicle[i] = new Airplane(15, 250.0, 1500.25, 4500, "Boeing747", 45600.0);
        }

        vehicle[1] = new Airplane(20, 255.0, 1530.25, 5000, "Boeing777", 45500.0);

        for (Vehicle v: vehicle){
            System.out.println(v);
        }
    }
}
