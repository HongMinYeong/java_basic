package _07_generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
//    public int sumLessThan(int[] num, int num2){
//        int sum = 0;
//    for(int n:num){
//        if(n<num2){
//            sum+=n;
//        }
//    }
//    return sum;
//    }
//    public static void main(String[] args) {
//        int[] nums1 = {2,5,8,3,7};
//        Test test = new Test();
//        System.out.println(test.sumLessThan(nums1, 8));
//
//    }
    // 두 숫자의 합이 타겟 값이 되는 배열의 첫번째 두 숫자의 인덱스를 반환 가장 먼저 조합되어 나오는 두 수
//public static int[] findIndices(int[] num, int num2) {
//    ArrayList<Integer> result = new ArrayList<>();
//    for (int i = 0; i < num.length; i++) {
//        for (int j = i + 1; j < num.length; j++) {
//            if (num[i] + num[j] == num2) {
//                result.add(i);
//                result.add(j);
//                break;
//            }
//        }
//    }
//
//    // ArrayList<Integer>를 int[]로 변환
//    int[] resultArray = new int[result.size()];
//    for (int i = 0; i < result.size(); i++) {
//        resultArray[i] = result.get(i);
//    }
//
//    return resultArray;
//}
//
//public static void main(String[] args) {
//    int[] nums2 = {3,2,5,7,11};
//    int target2 = 9;
//    int[] result2 = findIndices(nums2,target2);
//    System.out.println("[" + result2[0] + ", " + result2[1] + "]"); //출력 : [1,3]
//}
public static int search(int[] num,int target){
    int result = -1;
    for(int n:num){
        if(num[n] == target){
            result = n;
        }
    }
    return result;
}
public static void main(String[] args) {
    int[] nums = {3,4,5,6,7,8,0,1,2};
    int target = 0;
    System.out.println(search(nums,target)); //출력: 6
}
}
