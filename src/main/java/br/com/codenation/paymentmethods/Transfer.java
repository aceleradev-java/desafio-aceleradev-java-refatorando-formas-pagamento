package br.com.codenation.paymentmethods;

public class Transfer implements PriceStrategy {

    private static final double DISCOUNT_INDEX = 0.92;

    @Override
    public Double calculate(Double price) {
      return price * DISCOUNT_INDEX;
    }

}
