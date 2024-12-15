import java.util.Scanner;

public class IT24104173Lab5Q3 {
    public static void main(String[] args) {
        
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int MAX_DAYS = 31;
        final int MIN_DAYS = 1;

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < MIN_DAYS || startDate > MAX_DAYS || endDate < MIN_DAYS || endDate > MAX_DAYS) {
            System.out.println("Error: Days must be between 1 and 31");
            return; // Exit the program
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return; // Exit the program
        }

        
        int daysReserved = endDate - startDate;

        
        double discountRate = 0.0;
        if (daysReserved == 3 || daysReserved == 4) {
            discountRate = 10.0; // 10% discount
        } else if (daysReserved >= 5) {
            discountRate = 20.0; // 20% discount
        }

        
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discount = totalAmount * (discountRate / 100);
        totalAmount -= discount;

        
        System.out.printf("Room Charge Per Day: Rs. %.1f/=\n", ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.printf("Total Amount to be Paid: Rs. %.1f\n", totalAmount);

        scanner.close();
    }
}
