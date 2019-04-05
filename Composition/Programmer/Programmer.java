public class Programmer {
 private String name;
 private int age;
 private char gender;
 private Computer computer;

 public Programmer(String name, int age, char gender) {
  this.name = name;
  this.age = age;
  this.gender = gender;
  this.computer = new Computer();
  computer.setType("Mac");
  computer.setRAM(32);
  computer.setProcessorSpeed(4.3);
  computer.setStorageCapacity(512);
 }

 public String getType() {
  return computer.getType();
 }

 public int getRAM() {
  return computer.getRAM();
 }

 public int getStorage() {
  return computer.getStorageCapacity();
 }

 public double getProcessor() {
  return computer.getProcessorSpeed();
 }

 public void getComputer() {
  computer.getComputerInfo();
 }

 public void start() {
  computer.startUp();
 }

 public void reboot() {
  computer.sudoReboot();
 }

 public void shutdown() {
  computer.sudoShutdown();
 }

 public void setName(String name) {
  this.name = name;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public void setGender(char gender) {
  this.gender = gender;
 }

 public void getProgrammerInfo() {
  System.out.println("Programmer: " + "\n[Name]= " + name + "\n[Age]= " + age + " years old" + "\n[Gender]= " + gender);
 }

}