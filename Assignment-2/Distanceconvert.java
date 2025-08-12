import java.util.Scanner;

public class Distanceconvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter the distance: ");
            int disfoot=sc.nextInt();
            int disyards=disfoot/3;
            double dismiles=disyards/1760;
            System.out.println("The distance(yards) is "+disyards+" and distance(in miles) is "+dismiles);
        }
    }
}
