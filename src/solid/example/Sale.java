package solid.example;

public class Sale implements Strategy {

    @Override
    public double tip(double billAmount) {
        return (billAmount * 0.1);
    }
}
