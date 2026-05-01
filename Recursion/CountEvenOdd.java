package Recursion;

public class CountEvenOdd {
    static void CountEvenOdd(int range, int even, int odd){
        if(range==0){
            System.out.println("Even Count: " + even + " Odd Count: " + odd);
            return;
    }
    if(range%2==0){
        even++;
    }
    else{
        odd++;
    }
    CountEvenOdd(range-1, even, odd);
}
    public static void main(String[] args){
        CountEvenOdd(10, 0, 0);
    }
    
}
