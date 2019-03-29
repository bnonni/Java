public class CarClient{
 public static void main(String[] args){
   Car[] carAry = {new Van(), new Truck(), new Car()};
   for(int i = 0; i < carAry.length; i++){
     carAry[i].method2();
   }
 }
}

/* 

Output: truck_2 truck_2 car_3 

*/