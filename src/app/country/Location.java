package app.country;

import app.installations.Airport;
import app.installations.Installation;

/**
 * Location
 */
public class Location {

    private Installation instalations[];
    private static int counter = 0;
    private int code;
    private String name;

    public Location(int index, String name){
        setCode(code); setName(name);
        this.instalations = new Installation[index];
        for (int i = 0; i < instalations.length; i++) {
            this.instalations[i] = new Airport();
        }
    }

    public Location() {
        this(0, "null");
    }

    public void setCode(int code) { this.code = code; }
    public int getCode() { return code; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setInstalations(Installation[] instalations) {
        this.instalations = instalations;
    }
    public Installation[] getInstalations() { return instalations; }

    public void addInstallation(Installation installation) {
        instalations[counter] = installation;
        counter++;
    }

    @Override
    public String toString() {
        String str = "\tEn la localidad " + name + ": \n";

        for (Object o : instalations) {
            str += o + "\n";
        }

        return str;
    }
}
