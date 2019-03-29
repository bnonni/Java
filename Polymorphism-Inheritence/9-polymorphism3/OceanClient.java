
 public class OceanClient{
  public static void main(String[] args){
    Ocean[] waterAry = {new Ocean(), new Lake(), new Pond()};
    for(int i = 0; i < waterAry.length; i++){
      waterAry[i].method1();
    }
  }
 }

/*
Output:

ocean_1ocean_1pond_1

*/
