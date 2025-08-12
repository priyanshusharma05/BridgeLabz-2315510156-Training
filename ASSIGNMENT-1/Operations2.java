import java.util.Scanner;

public class Operations2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double re1=a + b *c;
            double re2=a * b + c;
            double re3=c + a / b;
            double re4=a % b + c;
            System.out.println("The results are :");
            System.out.println(re1);
            System.out.println(re2);
            System.out.println(re3);
            System.out.println(re4);
        }
    }
}
