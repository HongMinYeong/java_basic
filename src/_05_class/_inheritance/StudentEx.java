package _05_class._inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1 = new Student("김새싹",20);

//        //Case1. 부모, 자식 클래스의 필드가 public 인 경우
//        // Person (부모)로부터 상속받은 필드
////        System.out.println(std1.name); //김새싹
//                System.out.println(std1.name);
//        System.out.println(std1.age); //20
//        //Student 필드
//        System.out.println(std1.campus);  //null
//
//        // Person (부모)로부터 상속받은 메소드
//        std1.say(); //안녕!!
//        std1.eat("바나나"); //바나나 를(을) 먹고 있음 !!
//
//        //Student 메소드 호출
//        std1.setCampus("\n새싹 영등포 "); // 새싹 영등포  캠퍼스에서 공부 중 !!
//        System.out.println(std1.campus);

        //Case2. 부모, 자식 클래스의 필드가 private 인 경우
        // Person (부모)로부터 상속받은 필드
//        System.out.println(std1.name); //김새싹
        System.out.println(std1.getName());
//        System.out.println(std1.age); //20
        System.out.println(std1.getAge()); //20
        //Student 필드
//        System.out.println(std1.campus);  //null
        System.out.println(std1.getCampus());

        // Person (부모)로부터 상속받은 메소드
        std1.say(); //안녕!!
        std1.eat("바나나"); //바나나 를(을) 먹고 있음 !!

        //Student 메소드 호출
        std1.setCampus("\n새싹 영등포 "); // 새싹 영등포  캠퍼스에서 공부 중 !!
//        System.out.println(std1.campus);
        System.out.println(std1.getCampus());
    }
}
