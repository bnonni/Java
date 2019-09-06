public class AnimalClient{
 public static void main(String[] args){
   Animal myAnimal = new Animal ("water");
   Dog myDog = new Dog ("bone");
   Bird myBird = new Bird ("worm");
   whatDoYouEat(myAnimal);
   whatDoYouEat(myDog );
   whatDoYouEat(myBird );
 }
 public static void whatDoYouEat(Animal obj){   //line a
   System.out.println("It's food is " + obj.getFood());
 }
//  public static void whatDoYouEat(Dog obj){ //line b
//    System.out.println("It's food is " + obj.getFood());
//  }
//  public static void whatDoYouEat(Bird obj){  //line c
//    System.out.println("It's food is " + obj.getFood());
//  }
}


// Which of the following method applies the polymorphism technique?
// a. whatDoYouEat(Ch9_Animal obj)
// b. whatDoYouEat(Ch9_Dog obj)
// c. whatDoYouEat(Ch9_Bird obj)