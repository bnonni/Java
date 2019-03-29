import java.util.*;

public class ConvertDate{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date in this format: month day, year");
        String date = in.nextLine();
        
        int length = date.length();
        int space = date.indexOf(" ");
        int finalSpace = date.lastIndexOf(" ");
        
        String monthMinus = date.substring(0,1);
        String month = date.substring(1, space);
        
        String day = date.substring(space, finalSpace);
        day = day.replaceAll(",", "");
        

        String year = date.substring(finalSpace, length);

        System.out.println(day.trim() + " " + monthMinus.toUpperCase() + month.toLowerCase().trim() + " " + year.trim());

    }
}