import java.util.*;

public class AverageGrade{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();

        System.out.println("Enter your Math grade: ");
        int math = input.nextInt();

        System.out.println("Enter your English grade: ");
        int english = input.nextInt();

        System.out.println("Enter your History grade: ");
        int history = input.nextInt();

        int total = math + english + history;
        float average = total/3;

        System.out.println("Name: "+name);
        System.out.println("Overall average: "+ average);

    }
}