package app.country;

/**
 * Country
 */
public class Country {

    private String code;
    private String name;
    private Location location;

    public Country(String name) {
        setName(name);
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "El nombre del pais es " + name;
    }
}