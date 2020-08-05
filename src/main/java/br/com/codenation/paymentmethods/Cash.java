package br.com.codenation.paymentmethods;

public class Cash implements PriceStrategy {

    private static final double DISCOUNT_INDEX = 0.9;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT_INDEX;
    }

}
