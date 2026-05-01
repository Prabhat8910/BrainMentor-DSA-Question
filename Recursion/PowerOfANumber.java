package Recursion;

public class PowerOfANumber {
    static void computePow(int num, int pow, int result){
        if(pow==0){
            System.out.println(result);
            return;
        }
        computePow(num, pow-1, num*result);
    }
    public static void main(String[] args){
        computePow( 2,  3, 1 );
    }
    
}
