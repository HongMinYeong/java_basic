package _07_generic;

import _05_class._access_modifier._pack02.C;

import java.util.ArrayList;
class Calculator<T extends Number>{
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }
}
//class Pair<K, V> {
//    private K key;
//    private V value;
//
//    public Pair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//}

public class GenericPractice {
    public static void main(String[] args) {
//        Pair<String, Integer> pair1 = new Pair<String, Integer>("One", 1);
//        Pair<Integer, String> pair2 = new Pair<Integer, String>(2, "Two");
//
//        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
//        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
        Calculator<Integer> cal = new Calculator<Integer>(13,12);
        Calculator<Double> cal2 = new Calculator<Double>(5.34,5.32);

        System.out.println("Integer Sum :" + cal.add());
        System.out.println("Double Sum :" + cal2.add());
    }
}

