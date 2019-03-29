import java.util.*;

public class GradeReport{
    public static void main(String[] args){
        runGrade("Enter your grade: ");
        }
                    public static void runGrade(String enter){
                        System.out.println(enter);
                        Scanner input = new Scanner(System.in);
                        int gradeinput = input.nextInt();
                        int tries = 0;
                        tries++;
                    do{if(gradeinput<0 || gradeinput>100){
                    System.out.println("Please reenter your grade");
                    gradeinput = input.nextInt();
                    tries++;    
                    }}while((gradeinput<0 || gradeinput>100) && tries<3);
                        if(gradeinput >= 0 && gradeinput <= 100){
                            String message;
                            int category = gradeinput / 10;
                            switch(category){
                                case 10: message = "Perfect score! Job well done!";
                                break;
                                case 9: message = "Well above average. Excellent!";
                                break;
                                case 8: message = "Above average. Nice job!";
                                break;
                                case 7: message = "Average score.";
                                break;
                                case 6: message = "Below average. Please see the professor.";
                                break;
                                default: message = "Below average. Please see the professor.";
                                break;
                                }
                                System.out.println(message);
                                    }
                                    else{System.out.println("Error: You must enter an integer between 0 and 100");}
                                }
                            }
                        
                        
                                        
                                    
                        
                    
