package app;

import app.installations.Airport;
import app.installations.Installation;
import app.vehicles.Airplane;
import app.vehicles.Vehicle;

public class App {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Installation airport = new Airport("Hangar1", "Hangar", airplane);
        System.out.println(airport);
    }
}
