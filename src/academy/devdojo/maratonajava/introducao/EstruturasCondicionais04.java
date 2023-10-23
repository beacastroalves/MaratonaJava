package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor do seu salario?");
        double salario = teclado.nextDouble();

        double salarioAnual = salario * 12;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double salarioImposto = 0;

        if (salarioAnual <= 34712){
            salarioImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 34713 && salarioAnual >= 68507){
            salarioImposto = salarioAnual * segundaFaixa;
        } else {
            salarioImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(salarioImposto);

    }
}
