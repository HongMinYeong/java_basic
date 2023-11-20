// 메인 클래스 (시작 클래스 ) 정의
// - main 메서드 가짐
// - 메인 클래스는 한 개! (Node에서 진입점 파일 역할)
public class Main {
    // 주석
    // 1. // 한줄
    // 2. /* 여러 줄 */
    // 3. /** 문서 주석 */

    //main 메소드
    // - 자바, 응용 프록램의 실행 시작점
    // - 어플리케이션이 실행되려면 최소 1 개 존재해야 함
    // - JVM 은 세미콜론(;)으로 끝나는 문장을 하나의 명령문으로 인식
    public static void main(String[] args) {
        System.out.print("merry" + "merry");
        System.out.printf(" christmas");
        System.out.println("뇽안");
        for (int i=1;i<=5;i++){
        System.out.println("*" + i);
        }
    }
}