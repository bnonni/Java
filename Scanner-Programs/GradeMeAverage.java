import java.util.*;

public class GradeMeAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers of students in your class: ");
        int numOfStudents = input.nextInt();
        int[] grades = new int[numOfStudents];
        for(int i = 1; i <= numOfStudents; i++){
            System.out.println("Enter the grade for student " + i + ":");
            int grade = input.nextInt();
            if(grade > 100 || grade < 0){
                System.out.println("Invalid grade. Please reenter.");
                System.out.println("Enter the grade for student " + i + ":");
                grade = input.nextInt();
            }
            grades[i-1] = grade;
         
        }
        int total = 0;
        for(int j = 1; j <= grades.length; j++){
            total += grades[j-1];
        }
        int average = total/numOfStudents;
    System.out.println("The class average is " + average);
            
        }
    }
