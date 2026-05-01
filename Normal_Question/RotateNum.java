public class RotateNum {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int rotate = 2;

        int pow = (int)Math.pow(10, rotate);
        int lhs = num / pow;
        int rhs = num % pow;
        // System.out.println(lhs);
        // System.out.println(rhs);
        while(num != 0){
            count++;
            num = num/10;
        }
        int pow2 = (int)Math.pow(10, count-rotate);
        int result = rhs * pow2 + lhs;
        System.out.println(result);
    }
    
}
