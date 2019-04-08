public class Coding {
 public static void main(String[] args) {
  Programmer employee_001 = new Programmer("Bryan", 28, 'M');
  Computer c_001 = new Computer();
  System.out.println();
  employee_001.getProgrammerInfo();
  System.out.println();
  c_001.getComputerInfo();
  System.out.println();
  c_001.startUp();
  System.out.println();
  System.out.println("Upgrading processor speed...\n");
  c_001.setProcessorSpeed(5.5);
  System.out.println("New processor speed= " + c_001.getProcessorSpeed());
 }
}