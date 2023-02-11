

import java.util.Scanner;

public class Aq4 {
    public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("enter the no. of test cases");
        int t = scn.nextInt();
        int sum[]=new int[t];

        System.out.println("\n");
        System.out.println("enter the integer values to be added ");

for(int i = 0; i <= t-1; i++){
int a = scn.nextInt();
int b = scn.nextInt();
sum[i]=a+b;

    
}

System.out.println("\n");

System.out.println("output");
for(int k =0; k<=t-1;k++){
System.out.println(sum[k]);

}
    }
}

