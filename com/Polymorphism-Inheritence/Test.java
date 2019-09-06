public class Test{
 public static void main(String[] args) {
  int x = 2;
  int y = mystery(x);
  System.out.println("y="+y);
 }
 public static double mystery(double x){
  x++; x+=2; x-=3; x--;
 return x;
 }
 public static int mystery(int x){
  x++; x+=2; x-=3; x--;
  return x;
 }
}

