package _05_class._inheritance;

public class DogEx {
    public static void main(String[] args) {
        Dog myDog = new Dog("","하루",3);
        System.out.println(myDog.toString());
        Cat myCat = new Cat("","나비",3);
        myDog.makeSound();
        myCat.makeSound();


    }
}
