package OOP.Task2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "Tuzik";
        System.out.println(dog.name);

        dog.setAge(5);
        System.out.println("Dog age - " + dog.getAge());
    }
}
