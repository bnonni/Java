public class CarClient{
 public static void main(String[] args){
   Car[] carAry = {new Van(), new Truck(), new Car()};
   for(int i = 0; i < carAry.length; i++){
     carAry[i].method1();
   }
 }
}

/*
van_1 truck_1 car_1

*/