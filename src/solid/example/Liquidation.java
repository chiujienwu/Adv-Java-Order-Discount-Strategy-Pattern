package solid.example;

public class Liquidation implements Strategy{

    @Override
    public double tip(double billAmount) {
        return (billAmount * 0.75);
    }

}
