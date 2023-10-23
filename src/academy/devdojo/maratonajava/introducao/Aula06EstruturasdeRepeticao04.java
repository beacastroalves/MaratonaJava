package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasdeRepeticao04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor total do carro?");
        double valorTotal = teclado.nextDouble();
        for (int parcela = 1; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + "R$ " + valorParcela);
            }
        }
    }

}
