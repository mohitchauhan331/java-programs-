 /*Write a Java program to get the character at the given index within the string.
Sample Output:Original String = Java Exercises!
The character at position 0 is J
The character at position 10 is i*/
    public class assignement {
    public static void main(String argu []) 
    {
        String str = "hello everyone!";
        int i1 = 0;
        int i2 = 10;

        System.out.println(" String = " +str);

        char c1 = str.charAt(i1);
        System.out.println(" character at " +i1+ " is " +c1);

        char c2 = str.charAt(i2);
        System.out.println(" character at " +i2+ " is " +c2);
    }
}
