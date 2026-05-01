public class LCM {
    public static void main(String[] args){
        int a = 12;
        int b = 48;

        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;

        }
        int lcm = (a*b)/b;
        System.out.println(lcm);
    }
    
}
