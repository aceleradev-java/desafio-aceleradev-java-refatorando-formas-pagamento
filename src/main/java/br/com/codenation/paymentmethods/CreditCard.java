package br.com.codenation.paymentmethods;

public class CreditCard implements PriceStrategy {

    private static final double DISCOUNT_INDEX = 0.98;

    @Override
    public Double calculate(Double price) {
        return price * DISCOUNT_INDEX;
    }

}
