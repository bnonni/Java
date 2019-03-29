import java.io.*;
import java.util.*;

public class BinarySearchClient{
 public static void main(String[] args){
  int[] numbers = {-1, 3, 5, 8, 15, 18, 22, 39, 40, 42, 50, 57, 71, 73, 74};
  int index = Arrays.binarySearch(numbers, 73);
  System.out.println(index);
 }
}

//7, 11, 13