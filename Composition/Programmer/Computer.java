
public class Computer {
  private String type;
  private int RAM;
  private int storage_capacity;
  private double processor_speed;

  public void getComputerInfo() {
    System.out.println("Computer: " + "\n[Type]= " + type + "\n[RAM]= " + RAM + " GB" + "\n[Storage Capacity]= "
        + storage_capacity + "\n[Processor Speed]= " + processor_speed + " GHz");
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setRAM(int RAM) {
    this.RAM = RAM;
  }

  public int getRAM() {
    return RAM;
  }

  public void setStorageCapacity(int storage_capacity) {
    this.storage_capacity = storage_capacity;
  }

  public int getStorageCapacity() {
    return storage_capacity;
  }

  public void setProcessorSpeed(double processor_speed) {
    this.processor_speed = processor_speed;
  }

  public double getProcessorSpeed() {
    return processor_speed;
  }

  public void startUp() {
    System.out.println("Mac Starting Up... Welcome!");
  }

  public void sudoReboot() {
    System.out.println("Mac Rebooting... See you soon.");
  }

  public void sudoShutdown() {
    System.out.println("Mac Shutting Down... Goodbye.");
  }
}
