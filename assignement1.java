public class assignement1 {  
  public static void main(String argu [] )  
    {
        String word = "hello";
        
        boolean Present = false; 

        for (int i = 0; i <= word.length(); i++) 
        {
            if (word.charAt(i) == 'z') 
            {
                Present = true;
                break; 
            }
        }

        if (Present)
        {
            System.out.println(" 'e' is present ");
        } 
        else 
        {
            System.out.println("'e' is not present ");
        }
    }
}
