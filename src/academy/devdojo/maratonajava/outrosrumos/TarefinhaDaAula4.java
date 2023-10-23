package academy.devdojo.maratonajava.outrosrumos;

import java.util.Scanner;

public class TarefinhaDaAula4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Quantos elementros quer que sejam exibidos?");
        int qtd = teclado.nextInt();
        int vrpedido = qtd - nums.length;
        int vrnpedido = nums.length - qtd;

        for (int i = 0; i < vrpedido; i++) {

            System.out.println("Elementos pedidos pelo utilizador");
        }

        for (int i = 0; i < vrpedido; i++) {
            System.out.println("Elementos não pedidos pelo utilizador");
        }
    }
}