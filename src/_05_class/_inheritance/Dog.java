package _05_class._inheritance;

public class Dog extends Animal{
    // 메소드 오버라이딩 : 부모 클래스의 makeSound() 메소드 재정의

    public Dog(String species, String name, int age) {
        super(species, name, age);
        this.species = "강아지";
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound(){
        System.out.println("멍멍!");
    }

//    @Override
//    void makeSound(){
//     super.makeSound(); // 부모 클래스의 메소드 호출
//    }
    void fetch(){
        System.out.println("공 가져와!!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
