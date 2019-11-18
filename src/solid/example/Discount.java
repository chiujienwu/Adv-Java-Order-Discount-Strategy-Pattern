package solid.example;

public class Discount implements Strategy{

    @Override
    public double tip(double billAmount) {
        return (billAmount * 0.5);
    }

}
