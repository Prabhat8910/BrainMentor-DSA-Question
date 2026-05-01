package Recursion;

public class PalindroneNumber {
    static void PalindroneNumber(int num, int reverse, int cpy){
        if(num==0){
            System.out.println(reverse==cpy?"Palindrone Number":"Not Palindrone Number");
            return;
        }
        int Digit = num%10;
        reverse = reverse*10 + Digit;
        PalindroneNumber(num/10, reverse, cpy);
}
    public static void main(String[] args) {
        int num = 121;
        int cpy = num;
        PalindroneNumber(num, 0, cpy);
    }
}
