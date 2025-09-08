//Break and continue:

public class Lesson14 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println("i="+i);
            

        }
    }
}

//continue statement;
class newClass{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println("i="+i);
        }
    }
}
