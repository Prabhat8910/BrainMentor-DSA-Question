package Recursion;

public class GetMinMax {
    static int [] GetMinMax(int arr[], int index){
        if(arr.length==index){
            int r[] = new int[2];
            r[0] = Integer.MAX_VALUE;
            r[1] = Integer.MIN_VALUE;
            return r;
        }
        int result[] = GetMinMax(arr, index+1);
        if(result[0]>arr[index]){
            result[0] = arr[index];
        }
        else if(result[1]<arr[index]){
            result[1] = arr[index];
        }
        return result;

    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,2,200};
        int result[] = GetMinMax(arr, 0);
        System.out.println("Min: " + result[0] +  " Max: " + result[1]);
    }
    
}
