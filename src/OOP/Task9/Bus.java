package OOP.Task9;

public class Bus {
    private int seats;
    private Person driver;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
        this.seats = this.seats - 1;
    }
}
