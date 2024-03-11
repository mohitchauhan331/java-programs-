import java.util.Scanner;

public class helloworld {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a;
        float b;
        char c;
        double d;
        String stringVar;

        System.out.print("Enter an integer: ");
        a = scanner.nextInt();

        System.out.print("Enter a float: ");
        b= scanner.nextFloat();

        System.out.print("Enter a char: ");
        c = scanner.next().charAt(0);

        System.out.print("Enter a double: ");
        d = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter a string: ");
        stringVar = scanner.nextLine();

        System.out.println("\nYou Entered:");
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Char: " + c);
        System.out.println("Double: " + d);
        System.out.println("String: " + stringVar);

        scanner.close();
    }
}
