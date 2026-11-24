import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double budget = 0;

        System.out.println("College Spending Tracker");

        while (choice != 5) {
            System.out.println();
            System.out.println("Main Menu");
            System.out.println("1. Enter monthly budget");
            System.out.println("2. Add an expense");
            System.out.println("3. View total spending");
            System.out.println("4. View remaining budget");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter your monthly budget: $");
                double newBudget = scanner.nextDouble();

                if (newBudget >= 0) {
                    budget = newBudget;
                    System.out.println("Monthly budget set to: $" + budget);
                } else {
                    System.out.println("Budget cannot be negative.");
                }

            } else if (choice == 2) {
                scanner.nextLine();

                System.out.print("Enter expense name: ");
                String expenseName = scanner.nextLine();

                System.out.print("Enter expense cost: $");
                double expenseCost = scanner.nextDouble();

                if (expenseCost >= 0) {
                    System.out.println("Expense added: " + expenseName);
                    System.out.println("Cost: $" + expenseCost);
                } else {
                    System.out.println("Expense cannot be negative.");
                }

            } else if (choice == 3) {
                System.out.println("Total spending feature coming soon.");

            } else if (choice == 4) {
                System.out.println("Remaining budget feature coming soon.");

            } else if (choice == 5) {
                System.out.println("Goodbye!");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
