package OOP.Task10;

public class Person {
    private String name;
    private int age;
    private String gender;
    private Dog [] dog = new Dog[5];


    public Dog[] getDog() {
        return dog;
    }

    public void setDog(Dog[] dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        Bus.seats--;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
