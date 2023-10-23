package academy.devdojo.viradonojiraya;

import java.util.Scanner;

public class AlistamentoMilitar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do candidato: ");
        String nome = teclado.nextLine();

        System.out.println("Qual genero do candidato. Use 1 para Masculino e 2 para Feminino: ");
        String gen = "";
        while (gen.isEmpty()) {
            switch (teclado.nextInt()) {
                case 1:
                    gen = "M";
                    break;
                case 2:
                    gen = "F";
                    break;
                default:
                    System.out.println("O número escolhido é inválido! Digite 1 ou 2;");
            }

        }

        System.out.println("Qual idade do candidato: ");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            if (gen.equals("M")) {
                System.out.println("Alistamento Obrigatório");
            } else {
                System.out.println("A candidata deseja se alistar?");
            }
        } else {
            System.out.println("Alistamento não permitido");
        }
    }
}

