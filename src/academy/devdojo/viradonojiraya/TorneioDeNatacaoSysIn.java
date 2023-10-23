package academy.devdojo.viradonojiraya;

import java.util.Scanner;

public class TorneioDeNatacaoSysIn {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual nome do participante?");
        String nome = teclado.nextLine();

        System.out.println("Qual idade do participante?");
        int idade = teclado.nextInt();

        String categoria = "Adulto";

        if (idade <= 10) {
            categoria = "Infantil";
        } else if (idade <= 15) {
            categoria = "Juvenil";
        } else if (idade <= 19) {
            categoria = "Pré-Adulto";
        }

        System.out.println(nome + " tem " + idade + " anos e participará da categoria " + categoria);
    }
}

