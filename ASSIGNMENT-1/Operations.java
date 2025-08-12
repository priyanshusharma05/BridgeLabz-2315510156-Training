import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            int re1=a + b *c;
            int re2=a * b + c;
            int re3=c + a / b;
            int re4=a % b + c;
            System.out.println("The results are :");
            System.out.println(re1);
            System.out.println(re2);
            System.out.println(re3);
            System.out.println(re4);
        }
    }
}
