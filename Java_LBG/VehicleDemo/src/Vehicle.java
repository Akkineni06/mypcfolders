
public class Vehicle {
    private String name;
    private int year;
    private String fuel;

    public Vehicle(){}

    public Vehicle(String name, int year, String fuel) {
        this.name = name;
        this.year = year;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Vehicle: " + "Name: " + name + ", year: " + year + ", fuel: " + fuel;
    }
}
