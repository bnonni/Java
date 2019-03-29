public class TestRecursionBB{
 public static void main(String[] args){
    System.out.println(fun(3));
 }
 public static int fun(int n){
    if(n == 1) {
       return 1; 
    }
    else {
       return n * fun(n - 1);
    } 
 }
}
//fun(3) = 3 * fun(2) = 3 * 2 = 6
//fun(2) = 2 * fun(1) = 2 * 1 = 2
//fun(1) = 1