import java.util.Scanner;

public class assignement2
{
    public static void main(String argu []) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String fullName = scanner.nextLine();

        String[] parts = fullName.split(" ");

        char firstname = parts[0].charAt(0);

        String lastName = parts[parts.length-1];

        System.out.println(" name: " + firstname + "." + lastName);
    }
}
