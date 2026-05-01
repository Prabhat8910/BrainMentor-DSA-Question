package Recursion;

public class RecursionExample {
    static void PrintName(int num){

        if(num==0){
            return;
        }
        System.out.println("Prabhat");
        PrintName(num-1);
    }
    public static void main(String[] args) {
        PrintName(5);
    }

    
}
