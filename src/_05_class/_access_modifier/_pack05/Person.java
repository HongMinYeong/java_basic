package _05_class._access_modifier._pack05;

public class Person {
    private int age;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    //getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //setter
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
