package _07_generic;

// 사람 객체간 상속 관계
class Person{}
class Teacher extends Person{}
class Student extends Person{}
class WebStudent extends Student{}
class MoblieStudent extends Student{}

// 등록 객체
// - 특정 종류(T) 등록을 나타내는 클래스
class Applicant<T>{
    public T kind;
    public Applicant(T kind){ this.kind = kind;}
}

//과정
// - getClass(): 클래스 정보 반환
// - getSimpleName(): 클래스의 간결한 이름 반환 (ex. String)
class Course{
    // Course A: Person 이라면 누구나 등록 가능 =>> 어떠한 타입도 가능하다 => ? 와일드 카드 사용
    public static void registerCourseA(Applicant<?>applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"(이)가 Course A 등록하셨습니다.");
    }
    // Course B: Teacher 나 Student 가 아닌 Person 만 등록 가능 -> Teacher이거나 Teacher의 부모인 Person 만
    public static void registerCourseB(Applicant<? super Teacher>applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"(이)가 Course B 등록하셨습니다.");
    }

    // Course C: Student만 등록 가능
    public static void registerCourseC(Applicant<? extends Student>applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"(이)가 Course C 등록하셨습니다.");
    }
}
public class GenericEx03 {
    public static void main(String[] args) {

        // Course A
        Course.registerCourseA(new Applicant<Person>(new Person()));
        Course.registerCourseA(new Applicant<Teacher>(new Teacher()));
        Course.registerCourseA(new Applicant<Student>(new Student()));
        Course.registerCourseA(new Applicant<WebStudent>(new WebStudent()));
        Course.registerCourseA(new Applicant<MoblieStudent>(new MoblieStudent()));
        System.out.println();

        //Course B -> Teacher와 Person(Teacher의 부모) 만 가능
        Course.registerCourseB(new Applicant<Person>(new Person()));
        Course.registerCourseB(new Applicant<Teacher>(new Teacher()));
//        Course.registerCourseB(new Applicant<Student>(new Student()));
//        Course.registerCourseB(new Applicant<WebStudent>(new WebStudent()));
//        Course.registerCourseB(new Applicant<MoblieStudent>(new MoblieStudent()));
        System.out.println();

        // Course C -> Student만 가능
//        Course.registerCourseC(new Applicant<Person>(new Person()));
//        Course.registerCourseC(new Applicant<Teacher>(new Teacher()));
        Course.registerCourseC(new Applicant<Student>(new Student()));
        Course.registerCourseC(new Applicant<WebStudent>(new WebStudent()));
        Course.registerCourseC(new Applicant<MoblieStudent>(new MoblieStudent()));
        System.out.println();

    }
}
