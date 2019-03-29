//define main public class and initialized private states to avoid manipulation of initial states
public class Ball {
	private String color;
	private double weight;
  private int size;

 //default constructors assigns default values to the states initialize above
  public Ball(){
   color = "";
   weight = 0.0;
   size = 0;
  }
  //custom constructor to pass custom values into and assign those values to the defaults
  public Ball(String myColor, double myWeight, int mySize ){
    color = myColor;
    weight = myWeight;
    size = mySize;
  }


}