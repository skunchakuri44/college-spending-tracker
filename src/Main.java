import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        double budget = 0;

        ArrayList<String> expenseNames = new ArrayList<String>();
        ArrayList<Double> expenseCosts = new ArrayList<Double>();
        ArrayList<String> expenseCategories = new ArrayList<String>();

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

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter your monthly budget: $");

                if (!scanner.hasNextDouble()) {
                    System.out.println("Please enter a valid amount.");
                    scanner.nextLine();
                    continue;
                }

                double newBudget = scanner.nextDouble();

                if (newBudget >= 0) {
                    budget = newBudget;
                    System.out.printf("Monthly budget set to: $%.2f%n", budget);
                } else {
                    System.out.println("Budget cannot be negative.");
                }

            } else if (choice == 2) {
                scanner.nextLine();

                System.out.print("Enter expense name: ");
                String expenseName = scanner.nextLine();

                System.out.print("Enter expense cost: $");

                if (!scanner.hasNextDouble()) {
                    System.out.println("Please enter a valid amount.");
                    scanner.nextLine();
                    continue;
                }

                double expenseCost = scanner.nextDouble();

                if (expenseCost >= 0) {
                    System.out.println("Choose a category:");
                    System.out.println("1. Food");
                    System.out.println("2. Transportation");
                    System.out.println("3. Shopping");
                    System.out.println("4. School");
                    System.out.println("5. Other");

                    System.out.print("Enter category number: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid category. Using Other.");
                        scanner.nextLine();
                        expenseNames.add(expenseName);
                        expenseCosts.add(expenseCost);
                        expenseCategories.add("Other");
                        continue;
                    }

                    int categoryChoice = scanner.nextInt();
                    String category = "Other";

                    if (categoryChoice == 1) {
                        category = "Food";
                    } else if (categoryChoice == 2) {
                        category = "Transportation";
                    } else if (categoryChoice == 3) {
                        category = "Shopping";
                    } else if (categoryChoice == 4) {
                        category = "School";
                    } else if (categoryChoice == 5) {
                        category = "Other";
                    }

                    expenseNames.add(expenseName);
                    expenseCosts.add(expenseCost);
                    expenseCategories.add(category);

                    System.out.println("Expense added: " + expenseName);
                    System.out.printf("Cost: $%.2f%n", expenseCost);
                    System.out.println("Category: " + category);
                    System.out.println("Total expenses saved: " + expenseNames.size());

                } else {
                    System.out.println("Expense cannot be negative.");
                }

            } else if (choice == 3) {
                double totalSpent = 0;

                for (int i = 0; i < expenseCosts.size(); i++) {
                    totalSpent = totalSpent + expenseCosts.get(i);
                }

                System.out.printf("Total spent: $%.2f%n", totalSpent);

            } else if (choice == 4) {
                double totalSpent = 0;

                for (int i = 0; i < expenseCosts.size(); i++) {
                    totalSpent = totalSpent + expenseCosts.get(i);
                }

                double remainingBudget = budget - totalSpent;

                System.out.printf("Monthly budget: $%.2f%n", budget);
                System.out.printf("Total spent: $%.2f%n", totalSpent);
                System.out.printf("Remaining budget: $%.2f%n", remainingBudget);

                if (remainingBudget < 0) {
                    System.out.println("Warning: You are over your budget!");
                }

            } else if (choice == 5) {
                System.out.println("Goodbye!");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
