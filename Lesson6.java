//swapping of two numbers without using third variable;
import java.util.Scanner;

public class Lesson6 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of p:");
        int p=sc.nextInt();
        System.out.print("Enter the value of q:");
        int q=sc.nextInt();

        System.out.println("Before swapping p="+p +"and q="+q);
        p=p+q;
        q=p-q;
        p=p-q;
        System.out.println("After swapping p="+p + "and q="+q);
    }
}
