package _05_class._static;

public class StudentEx {
        public static void main(String[] args) {

            new Student("김새싹", 20231001, 1);
            Student.displayInfo();
            new Student("박지은", 20231002, 2);
            Student.displayInfo();
            new Student("이은지", 20231003, 3);
            Student.displayInfo();

            System.out.printf("총 학생수는 : %d명 입니다.", Student.getTotalStudents());
        }
    }

