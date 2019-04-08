package OOP.Task10a;

public class Bus {
    private int seats;
    private Person[] passenger;

    public Bus(int seats) {
        this.seats = seats;
        passenger = new Person[seats];
    }

    public void getPassenger() {
        while (seats < 20) {
            System.out.println("Passenger - " + passenger[seats].getName());
            System.out.println("Age is  -  " + passenger[seats].getAge());
            if (passenger[seats].getDog() != null)
                System.out.println("Dog name-   " + passenger[seats].getDog().getName());
            seats++;
            System.out.println();
        }
    }

    public void addPassenger(Person passenger) {
        if (seats > 1) {
            this.passenger[seats - 1] = passenger;
            seats--;
        } else System.out.println("Mest NET");
    }

    public int getSeats() {
        return seats-1;
    }

}
