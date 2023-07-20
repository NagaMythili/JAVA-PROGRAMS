import java.util.*;
public class Pro9 {
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 for(int i=0;i<=n;i++){
 if(i==0){
 System.out.println("you are at"+i+"floor");
 //System.out.println("you reached"+i+"floor");
 }
 if(i>0){
 //System.out.println("you are at"+i+"floor");
 System.out.println("you crossed"+(i-1)+"floor");
 System.out.println("you reached"+i+"floor");
 }
 }
 sc.close();
 }
}
