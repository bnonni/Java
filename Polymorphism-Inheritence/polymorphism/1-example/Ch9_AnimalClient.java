
public class Ch9_AnimalClient {
  public static void main(String[] args) {
    Ch9_Animal myAnimal = new Ch9_Animal("water"); // line a
    Ch9_Dog myDog = new Ch9_Dog("bone"); // line b
    Ch9_Bird myBird = new Ch9_Bird("worm"); // line c
    // Ch9_Bird myBird2 = new Ch9_Dog ("bone"); //line d -->will not run
    // Ch9_Bird myBird3 = new Ch9_Animal ("water"); //line e -->will not run
    Ch9_Animal myAnimal2 = new Ch9_Dog("bone"); // line f
    Ch9_Animal myAnimal3 = new Ch9_Bird("worm"); // line g
  }
}