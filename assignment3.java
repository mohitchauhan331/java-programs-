/*A person landed in a country where he has no idea of the currency notes. He asked the locals about the notes available in the country and he had to pay in a shop. Given an amount, find the minimum number of notes of different denominations that sum up to the given amount.Starting from the highest denomination note, try to accommodate as many notes as possible for a given amount. (40 marks)
Test Case 1 :Enter the size of currency denominations
5
Enter the currency denomination 
100
Enter the currency denomination 
50
Enter the currency denomination 
20
Enter the currency denomination 
1
Enter the currency denomination 
5
Enter the amount you want to pay 450
450
Your payment approach in order to give min no of notes will be
100 : 4
50 : 1
Test Case 2:Enter the size of currency denominations
6
Enter the currency denomination 
100
Enter the currency denomination 
50
Enter the currency denomination 
20
Enter the currency denomination 
10
Enter the currency denomination
2
Enter the currency denomination 
5
Enter the amount you want to pay
1257
Your payment approach in order to give min no of notes will be
100 : 12
50 : 1
5 : 1
2 : 1*/
    import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of denominations:");
        int size = scanner.nextInt();
        int[] denominations = new int[size];

        System.out.println("Enter the denominations:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (denominations[j] > denominations[i]) {
                    int temp = denominations[i];
                    denominations[i] = denominations[j];
                    denominations[j] = temp;
                }
            }
        }

        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();

        int remainingAmount = amount;

        System.out.println("Number of notes:");
        for (int i = 0; i < size; i++) {
            int count = remainingAmount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + " : " + count);
                remainingAmount %= denominations[i];
            }
        }

        if (remainingAmount > 0) {
            
            int smallestDenomination = denominations[size - 1];
            int adjustedAmount = (remainingAmount / smallestDenomination + 1) * smallestDenomination;
            int additionalAmount = adjustedAmount - amount;
            System.out.println("Adjusted remaining amount to the smallest denomination: " + adjustedAmount);
            System.out.println("Add " + additionalAmount + " to round off to the smallest denomination.");
            
            
            
        }
    }
}
