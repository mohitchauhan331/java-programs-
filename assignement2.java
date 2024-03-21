/*Write a program that takes your full name as input and displays the abbreviations of the
first and middle names except the last name which is displayed as it is. 
For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.*/
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
