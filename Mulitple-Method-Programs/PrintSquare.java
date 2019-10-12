
public class PrintSquare {

    public static void main(String[] args) {
           printSquare(1, 5);
       }
    public static void printSquare(int a, int b) {
           for(int i=a; i<=b; i++){
               System.out.print(i);
               for(int j=i+1 ; j<=b ; j++){
                   System.out.print(j);
               }
               for(int k=a; k<i; k++){
                System.out.print(k);
                }
               System.out.println();	
           } 
       }
   }