
// 3) Method accepts str & index and retrieves the chars at that index in str
import java.util.Scanner;

class StringIndex {
 public static void main(String[] args) {
  
  Scanner in = new Scanner(System.in);
   
  System.out.println("Enter a word.");
  String userWord = in.next();

  System.out.println("Enter a number.");
  int userIndex = in.nextInt();

  StringPass obj = new StringPass();
  System.out.println(obj.getChar("Bryan"));
 }
}

class StringPass{
 String word;
 int index;

 public String getChar(int index, String word){
  int length = word.length();
  for(int i = 0; i < word.length; i++){
   //something here
  }
  int lengthMinusOne = length-1;
  if(length >= index){
   String letter = word.substring(index-1, index);
   return letter.toString();
  }else{
   String letter = word.substring(lengthMinusOne, index-length);
   return letter.toString();
  }
 }
 
}