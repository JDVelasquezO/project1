package app;

import java.util.Scanner;

import app.country.Country;
import app.country.Location;
import app.installations.Airport;
import app.installations.Installation;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int countryIndex = 0, installationIndex = 0, locationIndex = 0;
        String countryName, locationName;

        System.out.println("Escribe el numero de países: ");
        countryIndex = scanner.nextInt();

        Country[] countries = new Country[countryIndex];

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Nombre para el pais " + (i+1));
            countryName = scanner.next();
            System.out.println("Escribe el numero de localidades para el pais " + countryName);
            locationIndex = scanner.nextInt();
            
            Location[] locations = new Location[locationIndex];
            countries[i] = new Country(locationIndex, countryName);

            for (int j = 0; j < locationIndex; j++) {
                System.out.println("Coloca el nombre de la localidad " + (j+1));
                locationName = scanner.next();
                System.out.println("Escribe el numero las instalaciones para " + locationName);
                installationIndex = scanner.nextInt();
                locations[i] = new Location(installationIndex, locationName);
            }

            System.out.println(countries[i]);
        }

        // // Pais
        // Country country = new Country(2, "Guatemala");
        // // Instalaciones 1
        // Installation installation = new Airport("Denver", "Aeropuerto");
        // Installation installation2 = new Airport("Car", "Estacionamiento");
        // // Localidad 1
        // Location location = new Location(2, "Mixco");
        // location.addInstallation(installation);
        // location.addInstallation(installation2);
        // // Agregacion 1
        // country.addLocations(location);
        // // Instalaciones 2
        // Installation installation3 = new Airport("Aurora", "Aeropuerto");
        // Installation installation4 = new Airport("AI", "Aeropuerto");
        // // Localidad 2
        // Location location2 = new Location(2, "Villa Nueva");
        // location2.addInstallation(installation3);
        // location2.addInstallation(installation4);
        // // Agregacion 2
        // country.addLocations(location2);

        // System.out.println(country);
    }
}
