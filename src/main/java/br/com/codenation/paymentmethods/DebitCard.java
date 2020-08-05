package br.com.codenation.paymentmethods;

public class DebitCard implements PriceStrategy {

    private static final double DISCOUNT_INDEX = 0.95;

    @Override
    public Double calculate(Double price) {
      return price * DISCOUNT_INDEX;
    }

}
