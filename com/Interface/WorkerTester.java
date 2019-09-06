
public class WorkerTester {
 public static void main(String[] args) {
  int x = 5, y = 15, z = 30;
  Worker john = new Worker(x);
  z = john.mystery(); // 10 + 5 = 15
  z -= 5; // z = 15 - 5 = 10
  mysteryA(z);
  System.out.println(z); // line 1
 }

 public static void mysteryA(int x) {
  x = x + 15;
 }

 // public static void mysteryB(int x, Worker anObj) {
 // x = x + 5;
 // x = x + anObj.fetchData();
 // }
}