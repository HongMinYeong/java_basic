package _05_class._access_modifier._pack06;

// protected 접근  제한자
// - 같은 패키지; default 랑 동일
// - 다른 패키지; 자식 클래스만 접근 허용

public class A {
    protected int field1;

    // 생성자
    protected A() {};

    // 메소드
    protected void method1() {}
}
