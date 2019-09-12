package app;

import app.country.Country;
import app.country.Location;
import app.installations.Installation;

public class App {
    public static void main(String[] args) {
        
        Installation installation = new Installation("Denver", "Aeropuerto");
        Installation installation2 = new Installation("Car", "Estacionamiento");
        
        Location location = new Location(2);
        location.addInstallation(installation);
        location.addInstallation(installation2);

        Country country = new Country(2, "Guatemala");
        country.addLocations(location);

        System.out.println(country);
    }
}
