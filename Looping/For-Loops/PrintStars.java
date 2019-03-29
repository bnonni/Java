public class PrintStars {
        public static void main (String[] args){
            for(int i = 0; i <= 10; i++) {
                for(int j = 10; j > 0; j--)
                System.out.print(i < j ? " " : "*") ;
            
                System.out.println();
                }
    }
}