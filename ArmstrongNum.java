public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int cpy = num;
        int Count = 0;
        int sum = 0;

        while(cpy != 0){
            Count++;
            cpy = cpy/10;
        }
       cpy = num;

       while(cpy != 0){
        int digit = cpy % 10;
        sum = sum + (int)Math.pow(digit, Count);
        cpy = cpy / 10;
       }
       System.out.println(num == sum ? "Armstrong Number" : "Not Armstrong Number");
    }
}
