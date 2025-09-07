//Function:Function is a block of code which is used to perform specific task.It is the reusable code which we can use from any part of our program.


public class Lesson11 {
    static void hello(){   //here static means the function is inside the class and it is not inside the object of class and void means it will not return any value but simply print the value of print statement:
        System.out.println("welcome to Java programming language");
    }
    public static void main(String[] args){
        hello();
    }
    
}

class NewFunction{
    static void name(String myname){
        System.out.println("my name is:"+myname);
    }
    public static void main(String[] args){
        name("Rupesh Kumar Chaudhary");
    }
}

class Second{
    static void Collegename(String name){
        System.out.println("My college name is:"+name);
    }
    public static void main(String[] args){
        Collegename("IILM UNIVERSITY");
    }
}

class Third{                //sum using void keyword
    static void add(int a,int b){
        int sum=a+b;
        System.out.println("The sum is:"+sum);
    }
    public static void main(String[] args){
        add(2,3);
        
    }
}

class Fourth{
    static int add1(int p,int q){
        return p+q;

    }
    public static void main(String[] args){
        int result=add1(2,33);
        System.out.println("The sum of two number is:"+result);
    }
}

//Function overloading;
class Five{
    static int multiply(int c,int d){
        return c*d;
    }
    static double multiply(double c,double d){
        return c*d;
    }

    public static void main(String[] args){
        System.out.println(multiply(2,3));
        System.out.println(multiply(3333,3333));
    }
}

//Recursion functions:

class sixth{
    static int factorial(int num){
        if(num==0){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args){
        int result=factorial(3);
        System.out.println("The factorial of num is:"+result);
    }
}

//Static and non static function:
class Seventh{
    static void value(){
        System.out.println("The fuction is static");
    }
    void nonstatic(){
        System.out.println("The function is non static");

    }

    public static void main(String[] args){
        value();
        Seventh obj=new Seventh();
        obj.nonstatic();
    }
}