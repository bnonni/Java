public class Sum{
    public static void main(String[] args){
        int[] arr = {10, 34, 44, 56, 100, 12, 98};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
           total += arr[i];
        }
        System.out.println("Total is " + total);
    }
}
