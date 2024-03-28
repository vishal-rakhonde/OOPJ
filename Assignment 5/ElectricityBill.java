public class ElectricityBill{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBillAmount(){
        if (unitsConsumed <= 100){
            billAmount = unitsConsumed * 5;
        } 
		else if (unitsConsumed <= 300){
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7;
        } 
		else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;
        }
    }

    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }

    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill("vishal", 250); // Example values
        bill.calculateBillAmount();
        bill.displayBill();
    }
}
