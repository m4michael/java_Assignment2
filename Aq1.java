import java.util.Scanner;

class Aq1{

    public static void main(String arg[]){

        Scanner s=new Scanner(System.in);

        String first_name=s.next();
        String last_name=s.next();
        int    roll=s.nextInt();
        String fieldOfInterest=s.next();

        System.out.println("Name="+first_name+" "+last_name);
        System.out.println("Roll="+roll);
        System.out.println("Field of Interest="+fieldOfInterest);


    }
}