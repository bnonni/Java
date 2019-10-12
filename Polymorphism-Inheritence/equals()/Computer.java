public class Computer {
 private double price;
 public boolean equals(Object obj) {
   if(obj instanceof Computer){
 Computer other = (Computer)obj;
     return price == other.price; //boolean zen style coding
   }
   else {
     return false;
   }
 }
}