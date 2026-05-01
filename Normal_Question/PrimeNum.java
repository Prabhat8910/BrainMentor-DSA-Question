public class PrimeNum {
    public static void main(String[] args) {
        int num = 11;
        int count = 0;

        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
    
}
