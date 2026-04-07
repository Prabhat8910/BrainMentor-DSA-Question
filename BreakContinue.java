// public class BreakContinue {
//     public static void main(String[] args){
//         for(int i = 1; i<=3; i++){
//             for(int j = 1; j<=3; j++){
//                 if(i==j){
//                     break;
//                 }
//                 System.out.println(i + " " + j);
//             }
//         }
//     }
    
// }

public class BreakContinue {
    public static void main(String[] args){
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if(i==j){
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
    
}
