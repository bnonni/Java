public class SalesPerson{
 private String name;
 private double sales;

 public SalesPerson(){
  name = "";
  sales = 0.0;
 }

 public SalesPerson(String name, double sales){
  this.name = name;
  this.sales = sales;
 }

 public String getName(){
  return name;
 }
 public double getSales(){
  return sales;
 }

 public void setName(String name){
  this.name = name;
 }
 public void setSales(double sales){
  this.sales = sales;
 }

 public double computeBonus(double sales){
  if (sales > 1000){
   return 100.00;
  }else{
   return 0.00;
  }
 }
  public String toString(){
   return "[name:" + name + "sales:" + sales +"]";
  }
 
}