public class loop {
 static int y[], k = 0;

 public static void main(String[] args) {
  for (int i = 5; i > 0; i--) {
   for (int j = 3; j > 0; j--) {
    int x = i + j;
    System.out.print(x + " ");
   }
  }
 }
}