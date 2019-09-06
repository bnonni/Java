import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BinarySearchTree {

  public static void main(String[] args) {
    ArrayList<Integer> numbers_list = new ArrayList<Integer>(10);
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
      int random_number = random.nextInt(10);
      if (!numbers_list.contains(random_number)) {
        numbers_list.add(random_number);
      }
    }
    Collections.sort(numbers_list);
    System.out.print("Random Array: " + numbers_list.toString() + "\n");
    Integer[] numbers_arr = numbers_list.toArray(new Integer[numbers_list.size()]);
    BinaryTree<Integer> tree4 = new BinaryTree<Integer>();
    tree4.setRootItem(numbers_arr[1]);
    tree4.attachLeft(numbers_arr[0]);
    BinaryTree<Integer> tree3 = new BinaryTree<Integer>();
    tree3.setRootItem(numbers_arr[7]);
    tree3.attachLeftSubtree(tree4);
    tree3.attachRight(numbers_arr[9]);
    BinaryTree<Integer> tree2 = new BinaryTree<Integer>();
    tree2.setRootItem(numbers_arr[3]);
    tree2.attachLeft(numbers_arr[2]);
    tree2.attachRight(numbers_arr[5]);
    BinaryTree<Integer> tree1 = new BinaryTree<Integer>();
    tree1.setRootItem(numbers_arr[4]);
    tree1.attachLeftSubtree(tree2);
    tree1.attachRight(numbers_arr[8]);
    BinaryTree<Integer> Binary_Tree = new BinaryTree<Integer>(numbers_arr[6], tree1, tree3);
    TreeIterator<Integer> BT_iterator = new TreeIterator<Integer>(Binary_Tree);
    BT_iterator.setPreorder();
    System.out.print("Printing Binary Tree in Preorder:");
    while (BT_iterator.hasNext()) {
      System.out.print(BT_iterator.next() + " ");
    }
    Integer[] new_numbers = new Integer[numbers_arr.length - 1];
    for (int i = 0, k = 0; i < numbers_arr.length; i++) {
      if (i == 8) {
        i++;
      }
      new_numbers[k] = numbers_arr[i];
      k++;
    }
    Binary_Tree.makeEmpty();
    tree4.setRootItem(new_numbers[1]);
    tree4.attachLeft(new_numbers[0]);
    tree3.setRootItem(new_numbers[7]);
    tree3.attachLeftSubtree(tree4);
    tree3.attachRight(new_numbers[8]);
    tree2.setRootItem(new_numbers[3]);
    tree2.attachLeft(new_numbers[2]);
    tree2.attachRight(new_numbers[5]);
    tree1.setRootItem(new_numbers[4]);
    tree1.attachLeftSubtree(tree2);
    Binary_Tree.setRootItem(new_numbers[6]);
    Binary_Tree.attachLeftSubtree(tree1);
    Binary_Tree.attachRightSubtree(tree3);
    BT_iterator.setPreorder();
    System.out.print("\nValue 8 removed.");
    System.out.print("\nPrinting Binary Tree in Preorder: ");
    while (BT_iterator.hasNext()) {
      System.out.print(BT_iterator.next() + " ");
    }
    System.out.println();
  }
}