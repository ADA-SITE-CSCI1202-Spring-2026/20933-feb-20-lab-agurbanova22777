import java.util.Scanner;

class Invoice {
    private String itemName;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String itemName, int quantity, double pricePerItem) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double calculateTotal() {
        return quantity * pricePerItem;
    }

    public void displayInvoice() {
        System.out.println("Item: " + itemName + ", Quantity: " + quantity + ", Price per Item: " + pricePerItem + ", Total: " + calculateTotal());
    }
}

public class ArrayOfInvoices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of invoices
        System.out.println("Enter the number of invoices:");
        int numInvoices = scanner.nextInt();
        scanner.nextLine();


        Invoice[] invoices = new Invoice[numInvoices];


        for (int i = 0; i < numInvoices; i++) {
            System.out.println("Enter details for invoice " + (i + 1) + ":");
            System.out.print("Item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Price per item: ");
            double pricePerItem = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoice(itemName, quantity, pricePerItem);
        }

        scanner.close();


        System.out.println("\nInvoices:");
        for (Invoice invoice : invoices) {
            invoice.displayInvoice();
        }
    }
}