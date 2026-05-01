package Recursion;

public class ArmStrongNumber {
    static int CountDigit(int num){
        if(num==0){
            return 0;
        }
        int count = CountDigit(num/10);
        return count+1;
    }
    static void ArmStrongnumber(int num, int sum, int cpy, int count){
        if(num==0){
            if(sum==cpy){
                System.out.println("ArmStrong Number");
            }
            else{
                System.out.println("Not ArmStrong Number");
            }
            return;
        }
        int Digit = num%10;
        int result = (int)Math.pow(Digit, count);
        sum = sum + result;
        ArmStrongnumber(num/10, sum, cpy, count);
    }
    public static void main(String[] args) {
        int num = 153;
        int count = CountDigit(num);
        ArmStrongnumber(0, 0, num, count);
    }
    
}
