package _04_exception;

import java.sql.Array;
import java.util.*;

public class Practice {
    //    public static void main(String[] args) {
//        int[] array = {1,2,3,4};
//     for(int i = 0; i<=array.length;i++){
//         try{
//             System.out.println(array[i]);
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("인덱스가 범위를 벗어났습니다.");
//         }
//     }
//    }
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    try{
//        System.out.print("배열의 크기를 입력해주세요 : ");
//        int x = sc.nextInt();
//        int[] array = new int[x];
//        Arrays.fill(array,7);
//        int sum = 0;
//        for(int n:array){
//            sum +=n;
//        }
//        System.out.println("배열의 평균은 : " + sum/x);
//    }catch(ArithmeticException a){
//        System.out.println("배열의 크기가 0 : " + a.toString());
//    }catch(NegativeArraySizeException b){
//        System.out.println("배열의 크기가 음수 : " + b.toString());
//    }catch(InputMismatchException e){
//        System.out.println("배열의 크기가 정수가 아님 : " + e.toString());
//    }
//
//}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("배열의 크기를 입력해주세요: ");
            int size = sc.nextInt();

            if (size <= 0) {
               throw new InputMismatchException();

            }
            System.out.println("배열 요소를 입력하십시오: ");
            List<Integer> array = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                try {
                    int element = sc.nextInt();
                    array.add(element);
                } catch (InputMismatchException e) {
                    System.out.println("정수가 아닌 값이 입력되었습니다: " + e.toString());
                    return;
                }
            }

            List<List<Integer>> subArrays = new ArrayList<>();
            for (int i = 0; i < array.size(); i++) {
                int current = array.get(i);
                if (array.lastIndexOf(current) > i) {
                    boolean isUnique = subArrays.stream().noneMatch(subarray -> subarray.contains(current));
                    if (isUnique) {
                        int count = 0;
                        for (int num : array) {
                            if (num == current) {
                                count++;
                            }
                        }
                        List<Integer> subarray = new ArrayList<>(Collections.nCopies(count, current));
                        subArrays.add(subarray);
                    }
                }
            }

            System.out.println("중복된 숫자 서브 배열 : ");
            for (List<Integer> subarray : subArrays) {
                System.out.print(subarray.toString() + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("배열의 크기가 정수가 아닙니다: " + e.toString());
        }
    }
}

