//student Grade Calculator
import java .util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System .in);
        System.out.println("Enter 5 subject marks:");
        int m1=input .nextInt();
        int m2=input .nextInt();
        int m3=input .nextInt();
         int m4=input .nextInt();
        int m5=input .nextInt();
        int total=m1+m2+m3+m4+m5;
        float percentage=total/5;  
        System.out.println("total: "+total);
        System.out.println("percentage: "+percentage);
        if(percentage>=90){
            System.out.println("grade A");
        }
        else if(percentage>=80){
            System.out.println("grade B");
        }
        else if(percentage>=70){
            System.out.println("grade C");
        }
        else if (percentage>=60){
            System.out.println("grade D");
        }
        else if(percentage>=50){
            System.out.println("grade E");
        }
        else if(percentage>=40){
            System.out.println("grade is Poor");
        }
        else{
            System.out.println("Fail");
        }

    }
}