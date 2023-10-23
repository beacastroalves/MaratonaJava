package academy.logica.utd;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual valor do produto?");
        double valor = scan.nextDouble();
        double aVista = valor - (valor *0.1);
        double parcelado03 = valor, parcela03 = valor/3;
        double parcelado10 = valor + (valor * 0.05), parcela10 = parcelado10/10;

        System.out.println("À vista: " + aVista + " 1 parcela: " + aVista);
        System.out.printf("Parcelado em 3: %.2f 3 parcelas: %.2f \n", parcelado03, parcela03);
        System.out.println("Parcelado em 10: " + parcelado10 + " 10 parcelas: " + parcela10);
    }
}
