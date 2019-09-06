public class Planet extends CelestialBody {
 private String name;
 private double area;
 private double weight;
 private long age;
 private int year_discovered;

 private BodyOfWater ocean;
 private BodyOfWater sea;
 private BodyOfWater lake;
 private BodyOfWater river;

 private LandMass continent;
 private LandMass country;
 private LandMass state;

 public Planet() {
  this.name = "";
  this.area = 0.0;
  this.weight = 0.0;
  this.age = 0000;
  this.year_discovered = 1800;
 }

 public Planet(String name, double area, double weight, long age, int year_discovered) {
  this.name = name;
  this.area = area;
  this.weight = weight;
  this.age = age;
  this.year_discovered = year_discovered;
 }

}