package Recursion;

public class SumofDigit {
    static void sumOfDigit(int num, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        int Digit = num%10;
        sum = sum + Digit;
        sumOfDigit(num/10, sum);
    }

        public static void main(String[] args) {
        sumOfDigit( 123, 0);
        } 
}
