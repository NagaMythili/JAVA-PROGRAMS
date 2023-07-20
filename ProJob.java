import java.util.Scanner;

public class ProJob{
    public static void main(String...x) {
       Scanner sc=new Scanner(System.in);
System.out.println("Enter  your age:");
       int age=sc.nextInt();
        
        if (age >= 18 && age <= 23) {
            System.out.println("You are eligible for the job.");
        } else if(age<=30){
System.out.println("You are eligible for the job.");
}else{
            System.out.println("You are not eligible for the job.");
        }
    }
}
