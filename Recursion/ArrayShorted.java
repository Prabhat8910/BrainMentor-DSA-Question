package Recursion;

public class ArrayShorted {
    static boolean isShorted(int []arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isShorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,2,30,40,50};
        System.out.println(isShorted(arr, 0)?"Shorted":"Not Shorted");
    }
    
}
