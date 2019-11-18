package solid.example;

public class NoTip implements Strategy{

    @Override
    public double tip(double billAmount) {
        return (billAmount);
    }


}
