import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            int[] arr=new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter "+(i+1)+" number:");
                arr[i]=sc.nextInt();
            }
            for(int x:arr){
                if(x>0){
                    if(x%2==0){
                        System.out.println("The number "+x+"is a postive number as well a even number");
                    }else{
                        System.out.println("The number "+x+"is a postive number as well a odd number");
                    }
                }
                else if(x<0){
                    System.out.println("Negative");
                }else{
                    System.out.println("Zero");
                }
            }
            int v1=arr[0];
            int v2=arr[4];
            if(v1==v2){
                System.out.println("first and last numbers are equal");
            }
            else if(v1>v2){
                System.out.println("First number is greater than last number");
            }else{
                System.out.println("Last number is greater than first");
            }
        }
    }
}
