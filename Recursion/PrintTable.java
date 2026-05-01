package Recursion;

public class PrintTable {
    static void PrintTable(int num, int val){
        if(val==0){
            return;
        }
        PrintTable(num, val-1);
        System.out.println(num+"*"+val+"="+(num*val));
    }
    public static void main(String[] args) {
        PrintTable(5, 10);
    }
    
}
