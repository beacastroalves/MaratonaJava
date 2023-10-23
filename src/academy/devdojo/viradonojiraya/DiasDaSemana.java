package academy.devdojo.viradonojiraya;

import java.util.Scanner;

public class DiasDaSemana {
    public static void validarNumero(int numero) {
        if (numero < 1 || numero > 7) {
            System.out.println("Número Inválido. Tente novamente.");
            System.exit(-1);
        }

        System.out.println("Essa linha é dentro do validarNumero");

        switch (numero) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7");
        int diaDigitado = teclado.nextInt();

        validarNumero(diaDigitado);
        System.out.println("Essa linha foi executada");


    }
}
