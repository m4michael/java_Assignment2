import java.util.Scanner;

public class Aq3 {
    public static void main(String arg[]){

         Scanner s= new Scanner(System.in);
         System.out.println("Marks of robert in three subjects");
         int m1=s.nextInt();
         int m2=s.nextInt();
         int m3=s.nextInt();

         int total=m1+m2+m3;
         float percent=(total*100)/300;

         System.out.println("Total marks="+total);
        System.out.println("Percentage ="+percent);


    }
}
