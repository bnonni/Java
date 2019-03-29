public class OceanClient{
 public static void main(String[] args){
   Ocean myOcean = new Ocean();
   myOcean.method1(); //line a
   Lake myLake = new Lake();
   myLake.method2(); //line b
   myLake.method1(); //line c
   Pond myPond = new Pond();
   myPond.method2(); //line d
   Ocean myOcean2 = new Pond();
   myOcean2.method1(); //line e
   myOcean2.method2(); //line f
   Lake myLake2 = new Pond();
   myLake2.method1(); //line g
   myLake2.method2(); //line h
 }
}