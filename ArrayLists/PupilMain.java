import java.util.*;

public class PupilMain {
 public static void main(String[] args) {
  ArrayList<Pupil> list = new ArrayList<Pupil>();
  list.add(new Pupil(30, "john"));
  list.add(new Pupil(15, "bob"));
  list.add(new Pupil(12, "ted"));
  Collections.sort(list);
  System.out.print(list.get(1));
 }
}