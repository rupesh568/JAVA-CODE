import java.util.Scanner;
public class Lesson4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter num1:");
        int num1=sc.nextInt();
        System.out.print("Enter num2:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
        int division=num1/num2;
        int exponential=(int) Math.pow(num1,num2);
        
        System.out.println("The sum is:"+sum);
        System.out.println("The difference is:"+difference);
        System.out.println("THe product is:"+product);
        System.out.println("The division is:"+division);
        System.out.println("The exponential is :"+exponential);


    }
}



