package Recursion;

public class PrintDigit {
    static void PrintDigit(int num){
        if(num==0){
            return;
        }
        PrintDigit(num/10);
        System.out.println(num%10);
    }
    public static void main(String[] args) {
        PrintDigit(12345);
    }
    
}
