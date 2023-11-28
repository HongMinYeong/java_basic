package _05_class._access_modifier._pack05._abstract;

public  abstract class Student {
    String name,school;
    int age,number;

    public Student(String name, String school, int age, int number) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.number = number;
    }

    abstract void todo();

    public void getInfo(){
        System.out.println("===="+name + " 학생의 정보====");
        System.out.println("학교: " + school);
        System.out.println("나이: " + age);
        System.out.println("학번: " + number);
    }

}
