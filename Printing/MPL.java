import java.util.*;

public class MPL{
    public static void main(String[] args){
        String s = new String("hello");
        String ss = new String("hello");
        if(s == ss)
        System.out.print("== works");
        else
            System.out.println("== doesn't work"); //doesnt work bc s and ss are two seperate & different objects in computer's memory & == compared equality

        if(s.equals(ss))
            System.out.println(".equals works"); //works because .equals checks the existence of an object in memory and compares
    }
}
