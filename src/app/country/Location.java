package app.country;

import app.installations.Installation;

/**
 * Location
 */
public class Location {

    private int code;
    private Installation instalations;

    public Location(int code){
        setCode(code);
    }

    public void setCode(int code) { this.code = code; }
    public int getCode() { return code; }

    @Override
    public String toString() {
        return "El codigo de la localidad es " + code;
    }
}