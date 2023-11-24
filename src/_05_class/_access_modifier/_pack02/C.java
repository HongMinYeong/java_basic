package _05_class._access_modifier._pack02;

import _05_class._access_modifier._pack01.B;

public class C {

//    A a;
    // C 클래스 A, B 클래스와 패키지가 다르므로
    // default 제한자인 A 클래스는 불러올 수 없고,
    // public 제한자인 B 클래스는 불러올 수 없다.
    B b;
}
