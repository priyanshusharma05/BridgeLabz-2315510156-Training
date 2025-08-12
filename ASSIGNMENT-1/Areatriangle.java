import java.util.*;
public class Areatriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter base(in cm): ");
            int base=sc.nextInt();
            System.out.println("Enter height(in cm): ");
            int height=sc.nextInt();
            double area=0.5*(base*height);
            double areainch=area/2.54;
            System.out.println("Area in cm: "+area);
            System.out.println("Area in inches: "+areainch);

        }
    }
    
}
