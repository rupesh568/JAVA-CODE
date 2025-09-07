import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day:");
        int day=sc.nextInt();
        String dayname;
        switch(day){
            case 1:
                dayname="Monday";
                break;
            case 2:
                dayname="Tuesday";
                break;
            case 3:
                dayname="Wednesday";
                break;
            case 4:
                dayname="Thurday";
                break;
            case 5:
                dayname="Friday";
                break;
            case 6:
                dayname="Saturday";
                break;
            default:
                dayname="Weekend";
                break;
                
        }
        System.out.println("The day is:"+dayname);

    }
    
}
