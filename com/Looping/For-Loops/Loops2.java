public class Loops2{
    public static void main(String[] args){
        int i = 0;
        while (i <= 3) {
            for (int j = 0; j <= 1; j++) {
            System.out.println("i:" + i + " j:" + j);
            }
            System.out.print("done with cycle: " + i);
            System.out.println();
            i++;            
        }
    }
}