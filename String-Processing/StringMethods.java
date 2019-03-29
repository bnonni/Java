

public class StringMethods{
    public static void main(String[] args){
        String str1 = new String("This is My Introduction Cooking guide to CS_Computer Science");
        String str2 = new String("Computer");
        String str3 = new String("Introduction");
        System.out.println(str1.indexOf("C"));
        System.out.println(str1.indexOf("C", 15));
        System.out.println(str1.indexOf(str2));

        System.out.println(str1.indexOf(str3));
    }
}

