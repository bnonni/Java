public class Student implements Grade {
 private double gpa;

 public double computeGpa() {
  return gpa;
 }

 public void printGpa() {
  System.out.println("gpa is " + gpa);
 }
}