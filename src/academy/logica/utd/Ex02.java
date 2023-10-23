package academy.logica.utd;

/*  Mp = [(N1 x P1) + (N2 x P2) + (N3 x P3) + ... (Nx x Px)] ÷ (P1 + P2 + P3 + ... Px)
    Mp é a média ponderada (o resultado que você quer descobrir)
    N é cada valor do conjunto
    P é o peso correspondente de cada valor do conjunto.
*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int p1 = 4, p2 = 5, p3 = 6;


        System.out.println("Digite a nota 1");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a nota 2");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a nota 3");
        double nota3 = teclado.nextDouble();

        double mediaPonderada = ((nota1 * p1 + nota2 * p2 + nota3 * p3) / (p1 + p2 + p3));

        String resultado = mediaPonderada > 6 ? "Aprovado" : "Reprovado";

        System.out.println(resultado + " nota: " + mediaPonderada);
    }
}
