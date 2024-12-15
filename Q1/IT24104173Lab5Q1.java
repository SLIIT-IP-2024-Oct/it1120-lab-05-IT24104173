import java.util.Scanner;

public class IT24104173Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Display the entered numbers
        System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);

        // Finding the smallest and largest numbers
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Display he result
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        scanner.close();
    }
}
