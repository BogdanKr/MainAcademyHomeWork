package OOP.Task10;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Person[] person = new Person[20];
        Dog[] dog = new Dog[5];

        for (int i = 0; i < 20; i++) {
            person[i] = new Person();
        }

        bus.setPassengers(person);

        person[0].setName("Petya");
        person[1].setName("Vasya");
        person[2].setName("Kolya");
        person[3].setName("Bogdan");
        person[4].setName("Alex");
        person[5].setName("Vova");
        person[6].setName("Roma");
        person[7].setName("Lena");
        person[8].setName("Natali");
        person[9].setName("Ira");

        person[0].setGender("M");
        person[1].setGender("M");
        person[2].setGender("M");
        person[3].setGender("M");
        person[4].setGender("M");
        person[5].setGender("M");
        person[6].setGender("M");
        person[7].setGender("W");
        person[8].setGender("W");
        person[9].setGender("W");

        person[0].setAge(30);
        person[1].setAge(25);
        person[2].setAge(38);
        person[3].setAge(33);
        person[4].setAge(28);
        person[5].setAge(18);
        person[6].setAge(22);
        person[7].setAge(45);
        person[8].setAge(39);
        person[9].setAge(35);

        for (int i = 0; i < 5; i++) {
            dog[i] = new Dog();
            person[i + 10].setDog(dog);

        }

        person[10].setName("Gena");
        person[11].setName("Oleg");
        person[12].setName("Gora");
        person[13].setName("Oksana");
        person[14].setName("Lena");

        dog[0].setName("Tuzik");
        dog[1].setName("Sharik");
        dog[2].setName("Bobik");
        dog[3].setName("Muhtar");
        dog[4].setName("Tarzan");


        for (int i = 0; i < 10; i++) {
            System.out.print(bus.getPassengers()[i].getName() + "    ");
            System.out.print(bus.getPassengers()[i].getAge() + "    ");
            System.out.println(bus.getPassengers()[i].getGender());
        }

        int j = 0;
        for (int i = 10; i < 15; i++) {
            System.out.print(person[i].getName() + "  ego sobaka-  ");
            System.out.println(person[i].getDog()[j].getName());
            j++;
        }
        System.out.println();
        System.out.println("Svobodnih mest=  " + bus.seats);
    }
}
