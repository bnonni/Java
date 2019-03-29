public class CarClient{
 public static void main(String[] args){
   Car myCar = new Car();
   myCar.method1(); //line a
   Truck myTruck = new Truck();
   myTruck.method2(); //line b
   myTruck.method1(); //line c
   Van myVan = new Van();
   myVan.method3(); //line d
   myVan.method2(); //line e
   Truck myVan2 = new Van();
   myVan2.method1(); //line f
   Car myTruck2 = new Truck();
   myTruck2.method1(); //line g
   myTruck2.method3(); //line h
   Car myVan3 = new Van();
   myVan3.method1(); //line i
   myVan3.method3(); //line j
 }
}

/* 
The output of line a is car_1.
The output of line b is truck_2.
The output of line c is truck_1.
The output of line d is car_3.
The output of line e is truck_2.
The output of line f is van_1.
The output of line g is truck_1.
The output of line h is car_3.
The output of line i is van_1.
The output of line j is car_3.
*/