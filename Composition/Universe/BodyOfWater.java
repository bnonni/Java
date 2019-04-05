public class BodyOfWater extends Planet {
 private boolean salt_water;
 private String salinity;
 private String name;
 private double size;
 private int year_discovered;

 // Setup a blank, default constructor
 public BodyOfWater() {
  this.salt_water = true;
  this.salinity = "";
  this.name = "";
  this.size = 0.0;
  this.year_discovered = 0000;
 }

 public BodyOfWater(boolean salt_water, String salinity, String name, double size, int year_discovered) {
  this.salt_water = salt_water;
  this.salinity = "salt water";
  this.name = "";
  this.size = 0.0;
  this.year_discovered = 0000;
 }

 public void setWaterName(String name) {
  this.name = name;
 }

 public String getWaterName() {
  return name;
 }

 public void setSaltWater(boolean salt_water, String salinity) {
  this.salt_water = salt_water;
  if (salt_water == true)
   this.salinity = "salt water";
  else
   this.salinity = "fresh water";
 }

 public boolean getSaltWater() {
  return salt_water;
 }

 public String getWaterSalinity() {
  return salinity;
 }

 public void setWaterSize(int size) {
  this.size = size;
 }

 public double getWaterSize() {
  return size;
 }

 public void setWaterDiscovery(int year_discovered) {
  this.year_discovered = year_discovered;
 }

 public int getWaterDiscovery() {
  return year_discovered;
 }
}