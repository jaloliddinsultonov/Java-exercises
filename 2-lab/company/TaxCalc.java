package com.company;

import java.math.BigDecimal;

public class TaxCalc {
    public static void main(String[] args) {

        double priceWithoutVat = 9.99;

        System.out.println("Price without Vat: " + priceWithoutVat);

        double priceWithVat = priceWithoutVat * 1.23;
        System.out.println("Pride with VAT " + priceWithVat);

        double valueWithVat = priceWithVat * 10000;
        System.out.println("Value with VAT: " + valueWithVat);

        double priceWithoutVat2 = valueWithVat / 1.23;
        System.out.println("Value wihtout VAT: " + priceWithoutVat2);

        //Using the BigDecimal class
        System.out.println("");
        System.out.println("Same thing after using Big Decimal:");

        BigDecimal dbPriceWithoutVat =  new BigDecimal("9.99");
        System.out.println("Price without VAT: " + dbPriceWithoutVat);

        BigDecimal dbPriceWithVat = dbPriceWithoutVat.multiply(
                new BigDecimal("1.23"));

        dbPriceWithVat = dbPriceWithVat.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Price with VAT rounded: " + dbPriceWithVat);

        BigDecimal dbValueWithVat = dbPriceWithVat.multiply(
                new BigDecimal(10000));
        System.out.println("Value with VAT:" + dbValueWithVat);

        BigDecimal dbPriceWithoutVat2 = dbValueWithVat.divide(
                new BigDecimal("1.23"),
                BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Value without VAT: " +dbPriceWithoutVat2);



    }
}
