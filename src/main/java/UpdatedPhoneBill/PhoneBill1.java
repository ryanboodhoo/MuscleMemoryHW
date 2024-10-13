package UpdatedPhoneBill;

public class PhoneBill1 {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    // Default constructor
    public PhoneBill1() {
        this(0, 79.99, 800, 800);
    }

    // Constructor with ID
    public PhoneBill1(int id) {
        this(id, 79.99, 800, 800);
    }

    // Constructor with all parameters
    public PhoneBill1(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int minutes) {
        this.allottedMinutes = minutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutes) {
        this.minutesUsed = minutes;
    }

    // Calculate overage
    public double calculateOverage() {
        return Math.max(0, (minutesUsed - allottedMinutes) * 0.25);
    }

    // Calculate tax
    public double calculateTax() {
        return 0.15 * (baseCost + calculateOverage());
    }

    // Calculate total bill
    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    // Print itemized bill
    public void printItemizedBill() {
        System.out.printf("ID: %d%nBase Rate: $%.2f%nOverage Fee: $%.2f%nTax: $%.2f%nTotal: $%.2f%n",
                id, baseCost, calculateOverage(), calculateTax(), calculateTotal());
    }
}
