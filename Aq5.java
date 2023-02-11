import java.util.Scanner;

public class Aq5 {

    public static void main (String arg []){
        //System.out.print("Input:");

        Scanner s1 = new Scanner(System.in);
        System.out.print("Input:");

        while (s1.hasNextLine()) {
            
             String line = s1.next();

            if(line.equals("exit")){   // To end the while loop , type " exit " in input
                
                break;
            }
            
           
            String line2= s1.next();
            
            System.out.println("\n");
            System.out.println("Output:");
            System.out.println(line+"_"+line2);
            System.out.println();
            System.out.println("Input:");
              
            
        }
        
        
                
            }
            
        }
        