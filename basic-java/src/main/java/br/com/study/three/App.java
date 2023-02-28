package br.com.study.three;

import static java.lang.String.format;
import static java.lang.System.in;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        log.info("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        log.info("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        if((primeiraNota + segundaNota) >= 60){
            log.info(format("NOTA FINAL = %.1f%n", primeiraNota + segundaNota));
        }else{
            log.info(format("NOTA FINAL = %.1f%nREPROVADO", primeiraNota + segundaNota));
        }

        sc.close();
    }
}
