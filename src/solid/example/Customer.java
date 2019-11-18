package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private char discountType;

    public Customer(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {

        Bill bill = new Bill(billAmount);
        Strategy strategy;

        switch (discountType) {
            case 'S':
            case 's':
                strategy = new Sale();
                break;
            case 'D':
            case 'd':
                strategy = new Discount();
                break;
            case 'L':
            case 'l':
                strategy = new Liquidation();
                break;
            default:
                strategy = new NoTip();
        }
        return strategy.tip(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
