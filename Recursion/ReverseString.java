package Recursion;

public class ReverseString {
    static String Reverse(String str){
        if(str.length()==0){
            return "";
        }
        String SmallString = Reverse(str.substring(1));
        char firstchar = str.charAt(0);
        return SmallString + firstchar;
        
    }
    public static void main(String[] args){
        String r = Reverse("Prabhat");
        System.out.println(r);
    }
    
}
