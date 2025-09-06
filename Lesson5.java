//swap two numbers using third variable;
import java.util.Scanner;
public class Lesson5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        int c;
        System.out.println("Before swapping:a="+a+"and b="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping:a="+a+"and b="+b);

        



    }
}

