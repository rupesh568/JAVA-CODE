//conditional statements;
import java.util.Scanner;
public class Lesson9 {
    public static void main(String[] args){
        int age=50;
        if(age>=18){
            System.out.println("The person is not child:"+age);

        }
    }
    
}

class Program1{
    public static void main(String[] args){
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even number:"+num);
        }else{
            System.out.println("The number is odd number:"+num);
        }

        
    }
}

//if-else-if statments;
class program2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.print("Enter the value of c:");
        int c=sc.nextInt();
        
        if(a>=b && a>=c){
            System.out.println("The greatest number is a with value:"+a);
        }else if(b>=a && b>=c){
            System.out.println("The greatest number is b with value:"+b);
        }else{
            System.out.println("The greatest number is c with value:"+c);
        }
    }
}

class Program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("The grade is A+");
        }else if(marks>=80){
            System.out.println("The grade is A");
        }else if(marks>=70){
            System.out.println("The grade is B+");
        }else if(marks>=60){
            System.out.println("The grade is B");
        }else if(marks>=40){
            System.out.println("The grade is C+");
        }else{
            System.out.println("The student is failed");
        }
    }
}
//Terniary conditonal statements;
class Program4{
    public static void main(String[] args){
        int number=10;
        String result=(number>5)?"Greater than 5":"Less than 5";
        System.out.println("Result is:"+result);
    }
}


