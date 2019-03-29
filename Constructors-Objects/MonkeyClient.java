public class MonkeyClient{
 public static void main(String[] args){
    
    Monkey kim = new Monkey(123, "jane"); //line a
    Monkey john = new Monkey(123, "jane"); //line a
    if(kim.equals(john)){
      System.out.println("ABC");
        } else {
      System.out.println("abc");
        }
        
  }
}