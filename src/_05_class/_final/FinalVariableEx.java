package _05_class._final;

// final 필드
// - final 키워드가 지정된 변수는 한 번 초기화되면 값 변경 불가능

public class FinalVariableEx {
    public static void main(String[] args) {
    //final 변수 선언, 초기화
        final int finalNum = 1;

//        finalNum = 5; //final 필드는 값을 변경할 수 없으므로 컴파일 에러 발생 !

        System.out.println("Final Number : " + finalNum);
    }
}
