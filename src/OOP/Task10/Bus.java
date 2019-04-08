package OOP.Task10;

public class Bus {
    public static int seats = 20;
    private Person[] passengers = new Person[20];

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Person[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Person[] passengers) {
        this.passengers = passengers;

    }
}
