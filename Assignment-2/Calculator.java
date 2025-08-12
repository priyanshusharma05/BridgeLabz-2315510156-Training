import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
        System.out.println("Enter first number: ");
        double number1=sc.nextFloat();
        System.out.println("Enter Second number: ");
        double number2=sc.nextFloat();
        double add=number1+number2;
        double sub=number1-number2;
        double mul=number1*number2;
        double div=number1/number2;
        System.out.println("Addition= "+add);
        System.out.println("Subtraction= "+sub);
        System.out.println("Multiplication= "+mul);
        System.out.println("division= "+div);
    }
}
}
