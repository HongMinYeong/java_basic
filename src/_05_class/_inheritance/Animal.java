package _05_class._inheritance;

public class Animal {
    public String species;
    public String name;
    public int age;
    public Animal(String species,String name,int age){
        this.species = species;
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println("동물은 소리를 낸다");
    }
}
