package app;

import java.util.Scanner;

import app.country.Country;
import app.country.Location;
import app.installations.Installation;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Country[] countries;
        Location[] locations;
        Installation[] installations;
        int numberCountries, numberLocations, numberInstallations;
        String nameCountry, nameLocation, nameInstallation, typeInstallation;

        System.out.println("Ingrese el numero de paises: ");
        numberCountries = scanner.nextInt();
        countries = new Country[numberCountries];

        for (int i = 0; i < numberCountries; i++) {
            System.out.println("Datos para el para el país " + (i+1));
            System.out.println("Nombre: ");
            nameCountry = scanner.next();
            System.out.println("Numero de localidades para el país " + nameCountry);
            numberLocations = scanner.nextInt();
            
            locations = new Location[numberLocations];
            countries[i] = new Country(numberLocations, nameCountry);

            for (int j = 0; j < numberLocations; j++) {
                System.out.println("Datos para la localidad " + (j+1));
                System.out.println("Nombre: ");
                nameLocation = scanner.next();
                System.out.println("Numero de instalaciones para " + nameLocation);
                numberInstallations = scanner.nextInt();
                
                locations[j] = new Location(numberInstallations, nameLocation);
                installations = new Installation[numberInstallations];

                for (int k = 0; k < numberInstallations; k++) {
                    System.out.println("Datos para la instalacion " + (k+1));
                    System.out.println("Nombre: ");
                    nameInstallation = scanner.next();
                    System.out.println("Tipo de instalacion: ");
                    typeInstallation = scanner.next();

                    installations[k] = new Installation(nameInstallation, typeInstallation);
                    locations[j].addInstallation(installations[k]);
                }
                countries[i].addLocations(locations[j]);
            }
        }

        System.out.println("");
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }
    }
}
