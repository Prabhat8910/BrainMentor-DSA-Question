package Recursion;

public class PrintLast {
    static void PrintName(int num){

        if(num==0){
            return;
        }
        System.out.println("Prabhat" + num);
        PrintName(num-1);
        System.out.println("Kaushal" + num);
    }
    public static void main(String[] args) {
        PrintName(5);
    }

    
}
