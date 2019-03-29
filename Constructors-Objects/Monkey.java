
// Title: classes and interfaces. Test3 coding question.
// (review) This coding question will in Test3.
// Given the following class:

public class Monkey extends Object {
 private int id;
 private String name;
 public Monkey (int id, String name){
   this.id = id; this.name = name;}
 public boolean equals(Object obj){
  if(obj instanceof Monkey ){
   Monkey other = (Monkey) obj; //(Monkey) is casting the obj as a Monkey object similar to how you would cast an int as a double. e.g. int balance = 10; double result = (double)balance / 3;
   return id == other.id && name.equals(other.name);
  }
  else {
   return false;
  }
 }
}
