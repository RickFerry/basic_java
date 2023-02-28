package br.com.study.two;

import static java.lang.String.format;
import static java.lang.System.in;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        log.info("Qual a largura do terreno: ");
        double largura = sc.nextDouble();

        log.info("Qual o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        
        log.info("Qual o valor do metro quadrado doterreno: ");
        double valorMetro = sc.nextDouble();

        log.info(format("Area do terreno = %.2f%n", largura * comprimento));
        log.info(format("Preço do terreno = %.2f%n", largura * comprimento * valorMetro));

        sc.close();
    }
}
