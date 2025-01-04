import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded exchange rates (example rates)
        double usdRate = 0.012;  // 1 INR to USD
        double eurRate = 0.011;  // 1 INR to EUR
        double gbpRate = 0.0096; // 1 INR to GBP
        double jpyRate = 1.65;   // 1 INR to JPY

        System.out.println("Currency Converter: INR to Other Currencies");
        System.out.print("Enter amount in INR: ");
        double inrAmount = scanner.nextDouble();

        System.out.println("Choose currency to convert to:");
        System.out.println("1. USD (United States Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound Sterling)");
        System.out.println("4. JPY (Japanese Yen)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double convertedAmount = 0;
        String currency = "";

        switch (choice) {
            case 1:
                convertedAmount = inrAmount * usdRate;
                currency = "USD";
                break;
            case 2:
                convertedAmount = inrAmount * eurRate;
                currency = "EUR";
                break;
            case 3:
                convertedAmount = inrAmount * gbpRate;
                currency = "GBP";
                break;
            case 4:
                convertedAmount = inrAmount * jpyRate;
                currency = "JPY";
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.printf("%.2f INR = %.2f %s%n", inrAmount, convertedAmount, currency);

        scanner.close();
    }
}
