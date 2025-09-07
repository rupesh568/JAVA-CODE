//Operators in java:operators perfoms operation over operands;
import java.util.Scanner;
public class Lesson12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        System.out.println("a++="+(a++));
        System.out.println("a--="+(a--));

    }
}

class first{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of p:");
        int p=sc.nextInt();
        System.out.print("Enter the value of q:");
        int q=sc.nextInt();
        System.out.println("p==q="+(p==q));
        System.out.println("p>q="+(p>q));
        System.out.println("p<q="+(p<q));
        System.out.println("p!=q="+(p!=q));
    }
}
//Assignmet operators:
class Second{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of C:");
        int C=sc.nextInt();


    
        System.out.println("C+=2="+(C+=2));
        System.out.println("C-=1"+(C-=1));
        System.out.println("C*=4="+(C*=4));
        System.out.println("C/=2"+(C/=2));
        System.out.println("C%=2="+(C%=2));

    }
}

//Boolean operators;
class Third{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of s:");
        int s=sc.nextInt();
        System.out.print("Enter the value of t:");
        int t=sc.nextInt();

        System.out.print("Enter the value of u:");
        int u=sc.nextInt();
        System.out.println("(s>=t && s>=u=)"+(s>=t && s>=u));
        System.out.println("(s==t || t==u)="+(s==t || t==u));
        System.out.println("(s!=u)="+(s!=u));
    }
}
//Bitwise operators:



