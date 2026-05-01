package Recursion;

public class CountEvenOddWithArray {
    static int[] CountEvenOddWithArray(int range){
        if(range==0){
            int result[] = new int[2];
            return result;
        }
        int result[] = CountEvenOddWithArray(range-1);

        if(range%2==0){
            result[0] = result[0] + 1;
        }
        else{
            result[1] = result[1] + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = CountEvenOddWithArray(10);
        System.out.println("Even Count: " + arr[0]);
        System.out.println("Odd Count: " + arr[1]);   
    }
}
