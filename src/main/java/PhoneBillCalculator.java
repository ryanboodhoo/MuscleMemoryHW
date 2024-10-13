import java.util.Scanner;

    public class PhoneBillCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter base cost of the plan: ");
            double baseCost = scanner.nextDouble();

            System.out.print("Enter overage minutes: ");
            double overageMinutes = scanner.nextDouble();

            scanner.close();

            double overageCharge = calculateOverages(overageMinutes);
            double tax = calculateTax(baseCost + overageCharge);
            double total = baseCost + overageCharge + tax;

            printBill(baseCost, overageCharge, tax, total);
        }

        public static double calculateOverages(double extraMinutes) {
            return extraMinutes * 0.25;
        }

        public static double calculateTax(double subtotal) {
            return subtotal * 0.15;
        }

        public static void printBill(double base, double overage, double tax, double total) {
            System.out.printf("Phone Bill Statement%nPlan: $%.2f%nOverage: $%.2f%nTax: $%.2f%nTotal: $%.2f%n",
                    base, overage, tax, total);
        }
    }
