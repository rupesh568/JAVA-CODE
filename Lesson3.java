import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        //taking input of string
        System.out.print("Enter you First name:");
        String firstName=sc.next();
         
        sc.nextLine();
        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter an integer:");
        int a=sc.nextInt();

        System.out.print("Enter a float value:");
        float b=sc.nextFloat();

        System.out.print("Enter the double value:");
        double c=sc.nextDouble();

        System.out.print("Enter the long value");
        long d=sc.nextLong();

        System.out.print("Enter a character value");
        char e=sc.next().charAt(0);

        System.out.print("Enter a boolean value");
        boolean f=sc.nextBoolean();

        System.out.println("My first name is :"+ name);
        System.out.println("My fullname is:" +firstName);
        System.out.println("The integer value is:" +a);
        System.out.println("The float value is:" +b);
        System.out.println("THe double value is:" +c);
        System.out.println("The long value is:"+d);
        System.out.println("The character value is:"+e);
        System.out.println("The boolean value is:"+f);
        


        
        

    }
}
