package OOP.Task10a;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(20);

        Person person1 = new Person();
        person1.setName("Kolya");
        person1.setAge(33);
        bus.addPassenger(person1);

        Person person2 = new Person();
        person2.setName("Petya");
        person2.setAge(44);
        bus.addPassenger(person2);

        Person person3 = new Person();
        person3.setName("Vasya");
        person3.setAge(25);
        bus.addPassenger(person3);

        Person person4 = new Person();
        person4.setName("Vova");
        person4.setAge(39);
        bus.addPassenger(person4);

        Person person5 = new Person();
        person5.setName("Olya");
        person5.setAge(18);
        bus.addPassenger(person5);

        Person person6 = new Person();
        person6.setName("Ira");
        person6.setAge(30);
        bus.addPassenger(person6);

        Person person7 = new Person();
        person7.setName("Roma");
        person7.setAge(44);
        bus.addPassenger(person7);

        Person person8 = new Person();
        person8.setName("Gena");
        person8.setAge(37);
        bus.addPassenger(person8);

        Person person9 = new Person();
        person9.setName("Oleg");
        person9.setAge(29);
        bus.addPassenger(person9);

        Person person10 = new Person();
        person10.setName("Masha");
        person10.setAge(55);
        bus.addPassenger(person10);

        Person person11 = new Person();
        person11.setName("Gora");
        person11.setAge(35);
        person11.setDog(new Dog("Tuzik"));
        bus.addPassenger(person11);

        Person person12 = new Person();
        person12.setName("Alex");
        person12.setAge(34);
        person12.setDog(new Dog("Bobik"));
        bus.addPassenger(person12);

        Person person13 = new Person();
        person13.setName("Tolik");
        person13.setAge(42);
        person13.setDog(new Dog("Sharik"));
        bus.addPassenger(person13);

        Person person14 = new Person();
        person14.setName("Katya");
        person14.setAge(55);
        person14.setDog(new Dog("Barsik"));
        bus.addPassenger(person14);

        Person person15 = new Person();
        person15.setName("Vitik");
        person15.setAge(28);
        person15.setDog(new Dog("Muha"));

        System.out.println("Svobodnih mest  " + bus.getSeats());
        bus.getPassenger();



    }
}
