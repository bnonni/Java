public class Pupil implements Comparable<Pupil> {
 private int age;
 private String name;

 public Pupil(int a, String n) {
  age = a;
  name = n;
 }

 public int compareTo(Pupil obj) {
  return this.age - obj.age;
 }

 public String toString() {
  return "" + age;
 }
}
