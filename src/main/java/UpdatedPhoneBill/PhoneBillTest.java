import UpdatedPhoneBill.PhoneBill1;

public class PhoneBillTest {
    public static void main(String[] args) {
        // Creating a PhoneBill object with ID 123456 and default values
        PhoneBill1 bill = new PhoneBill1(123456);

        // Setting the minutes used to 1000
        bill.setMinutesUsed(1000);

        // Printing the itemized bill
        bill.printItemizedBill();
    }
}
