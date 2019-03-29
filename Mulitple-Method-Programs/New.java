public class New{
    public static void main(String[] args){
        printSquare(3,6);
    }
public static void printSquare (int startNum, int height){

    for (int i = startNum; i < height; i++) {
        for (int j = i; j < height-2 + i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
    System.out.println();
}
}
