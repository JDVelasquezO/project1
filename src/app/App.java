package app;

import app.country.Country;
import app.country.Location;
import app.installations.Airport;
import app.installations.Installation;

public class App {
    public static void main(String[] args) {
        
        Installation installation = new Airport("Denver", "Aeropuerto");
        Installation installation2 = new Airport("Car", "Estacionamiento");
        
        Location location = new Location(2);
        location.addInstallation(installation);
        location.addInstallation(installation2);

        Country country = new Country(2, "Guatemala");
        country.addLocations(location);

        System.out.println(country);
    }
}
