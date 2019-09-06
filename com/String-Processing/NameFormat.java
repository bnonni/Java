import java.util.*;

public class NameFormat{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name.");
        String name = input.nextLine();
        changeNameFormat(name);
    }

    public static void changeNameFormat(String name){
        int length = name.length();
        int space_index = name.indexOf(' ');
        System.out.print("Your name for our system will be: ");
        for(int i=space_index+1;i<length;i++){
            System.out.print(name.charAt(i));}
            System.out.print(",");
            System.out.print(" ");
        for(int j=0; j<=space_index; j++){
            System.out.print(name.charAt(j));}
            System.out.println();    
        }
        
    }



