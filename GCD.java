public class GCD {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int min = a>b?a:b;

        while(min>0){
            if(a%min==0 && b%min==0){
                System.out.println("GCD" + min);
                break;
            }
            min--;
        }
    }
    
}
