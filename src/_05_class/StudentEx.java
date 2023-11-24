package _05_class;

public class StudentEx {
    public static void main(String[] args) {
        // std1 변수가 Student 객체 참조
        Student std1 = new Student("김새싹",1);
//        System.out.println(std1); //오버라이딩 전(toString) ->_05_class.Student@7a81197d
        System.out.println(std1); //오버라이딩 후(toStrinng) -> Student{name='김새싹', grade=1}

        //메소드 사용
        std1.goToSchool();
        std1.study("java 프로그래밍");
        System.out.println(std1.getGrade() + "학년");
        System.out.println(std1.getTestResult(100));
    }
}
