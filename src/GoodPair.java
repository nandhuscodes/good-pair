import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("enter key: ");
        int B = scanner.nextInt();
        if(goodPairExist(array, B)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    static boolean goodPairExist(int[] A, int B){
        for(int i = 0; i < A.length-1; i++){
            for (int j = i+1; j < A.length; j++){
                if(A[i]+A[j] == B){
                    return true;
                }
            }
        }
        return false;
    }
}
