package solid.example;

public class Bill {

    private double billAmount = 0;
    private Strategy strategy;

    public Bill (double billAmount) {
        this.billAmount = billAmount;
    }

    public double billAmount() {
        return billAmount;
    }

    public void setStrategy (Strategy strategy) {
        this.strategy = strategy;
    }

    public void tip() {
        /*
         * Because we didn't ask for a GrowthStrategy in the constructor, we are
         * trusting the user of BacteriaColony to call setGrowthStrategy() BEFORE
         * they try to call grow(). In case they don't, this null check prevents
         * the program from crashing.
         */
        if (strategy != null) {
            billAmount = strategy.tip(billAmount);
        }
    }

}



