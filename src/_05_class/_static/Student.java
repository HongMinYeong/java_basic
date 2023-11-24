package _05_class._static;


public class Student {
    private static String name;
    private static int studentID;
    private static int grade;
    private static int totalStudents;

    public static int getTotalStudents() {
        return totalStudents;
    }

    public Student(String name, int studentID, int grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
        totalStudents++;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public static int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void displayInfo() {
        System.out.println("=== 학생 정보 ===");
        System.out.println("이름 : " + getName());
        System.out.println("학번 : " + getStudentID());
        System.out.println("학년 : " + getGrade());
    }
}



