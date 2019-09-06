//Bryan Nonni
//Lab 4 - Array Work
//CSC 2720-20194 Fri, 9-950 AM
import java.util.Arrays;
import java.util.Objects;

public class ArrayWork{
public static int[] arr = new int[12];
public static void main(String[] args) {
 //1. declare empty array
  
    // 2. use for loop to generate 12 random ints
    for (int i = 0; i < 10; i++) {
      // 3. Use Math class to create 12 random ints between 0 - 5
      int r = (int) (Math.random() * 6 - 1);
      // 4. store random ints in array arr
      arr[i] = r;
    }
    //5. print array
    System.out.println(Arrays.toString(arr));
    //6. create new object
    ArrayWork p = new ArrayWork();
    //7. call factorial function
    int product_one = p.findProduct(0);
    arr[5] = product_one;
    ArrayWork p_two = new ArrayWork();
    int product_two = p_two.findProduct(6);
    arr[11] = product_two;
    System.out.println(Arrays.toString(arr));
    ArrayWork d_one = new ArrayWork();
    int[] new_arr_rtn = d_one.delete_zeros();
    System.out.println(Arrays.toString(new_arr_rtn));
    Arrays.sort(new_arr_rtn);
    System.out.println(Arrays.toString(new_arr_rtn));
} 

int[] delete_zeros(){
  int index = 0;
  for(int i = 0; i < 12; i++){
    if(arr[i] != 0 ){
      arr[index++] = arr[i];
    }
  }
  int[] new_arr = new int[index];
  System.arraycopy(arr, 0, new_arr, 0, index);
  return new_arr;
}

int findProduct(int n){
  int product = 1;
  for(int i = n; i < (n + 5); i++){
    if(arr[i] != 0){
      product*=arr[i];
    }
  }
  return product;
}
}