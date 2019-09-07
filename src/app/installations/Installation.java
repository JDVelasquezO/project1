package app.installations;

import app.vehicles.Vehicle;

/**
 * Installation
 */
public abstract class Installation {

    //private int id;
    private String name;
    private String type;
    private Vehicle parkingLot;

    public Installation(String name, String type, Vehicle vehicle){
        setType(type);
    }

    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setParkingLot(Vehicle parkingLot)
    { this.parkingLot = parkingLot; }

    public String getName() { return name; }
    public Vehicle getParkingLot() { return parkingLot; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Se creo un " + type;
    }
}
