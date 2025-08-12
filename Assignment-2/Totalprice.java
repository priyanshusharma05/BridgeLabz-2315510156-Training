import java.util.Scanner;

public class Totalprice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter the price of the item:");
            int price=sc.nextInt();
            System.out.println("Enter the quantity of the item:");
            int quantity=sc.nextInt();
            int totalprice=price*quantity;
            System.out.println(" The total purchase price is INR "+totalprice+" if the quantity "+quantity+" and unit price is INR "+price);
        }
    }
}
