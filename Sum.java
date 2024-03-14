import java.util.Scanner;
public class Sum{
public static void main (String argu [])
    {
      Scanner scanner = new Scanner (System.in);
    System.out.println("Enter the first number:");

   int num1 = scanner.nextInt(); 

   System.out.println("enter the second number :");

   int num2 =scanner.nextInt();

   scanner.close();

   int sum = num1 + num2 ;

   System.out.println("the sum of"+num1+ "and "+num2 +"is "+sum);

    }
}