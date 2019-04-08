package OOP.Task9;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Bus bus = new Bus();
        bus.setSeats(10);
        person.setName("Vasya");

        bus.setDriver(person);

        System.out.println(bus.getDriver().getName());
        System.out.println(bus.getSeats());
    }
}
