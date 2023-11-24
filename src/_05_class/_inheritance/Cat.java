package _05_class._inheritance;

public class Cat extends Animal{
    public Cat(String species, String name, int age) {
        super(species, name, age);
        this.species = "고양이";
        this.name = name;
        this.age = age;
    }

    @Override
        void makeSound(){
            System.out.println("냐냐냐냐냐냐옹!");
        }
    }
