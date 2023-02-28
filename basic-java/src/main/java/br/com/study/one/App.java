package br.com.study.one;

import static java.lang.String.format;

import java.util.Locale;

import lombok.extern.java.Log;

@Log
public class App {

    static final String FORMATED_PRODUCT_PRICE = "%s which price is $ %.2f%n";
    
    public static void main(String[] args) {

        String productOne = "Computer";
        String productTwo = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double priceOne = 2100.0;
        double priceTwo = 650.50;
        double measure = 53.234567;

        log.info(format(FORMATED_PRODUCT_PRICE, productOne, priceOne));
        log.info(format(FORMATED_PRODUCT_PRICE, productTwo, priceTwo));
        log.info(format("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender));
        Locale.setDefault(Locale.US);
        log.info(format("%nMeasure with eight decimal places: %.3f%n", measure));
    }
}
