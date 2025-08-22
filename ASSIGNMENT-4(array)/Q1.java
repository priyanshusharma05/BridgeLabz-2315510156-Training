import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            int[] arr=new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter your age:");
                arr[i]=sc.nextInt();
            }
            for(int x:arr){
                if(x>=18){
                    System.out.println("You are eligible to vote");
                }else if(x<0){
                    System.out.println("Invalid age!!");
                }
                else{
                    System.out.println("Sorry! You can not vote");
                }
            }
        }
    }
}
