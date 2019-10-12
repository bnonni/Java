public class Animal_Tester{ 
 public static void main(String[] args){ 
    Animal_Override obj = new Animal_Override(); 
    System.out.println(obj.displayColor()); //line a 
    System.out.println(obj.mystery()); //line b 
    
    Bird_Override birdObj = new Bird_Override(); 
    System.out.println(birdObj.mystery()); //line c 
    System.out.println(birdObj.displayColor()); //line d  
    
    Dog_Override dogObj = new Dog_Override(); 
    System.out.println(dogObj.mystery()); //line e 
    System.out.println(dogObj.displayColor()); //line f 
 } 
} 