package academy.devdojo.viradonojiraya;

import java.util.Scanner;

public class UsuariosDoSistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual será o login do usuário?");

        while (true) {
            String nome1 = teclado.nextLine().replace(" ", "");
            if (nome1.isEmpty() || nome1.equals("admin") || nome1.equals("administrador")) {
                System.out.println("Nome inválido! Por favor digite um novo login de usuário");
            } else {
                System.out.println(nome1 + " foi digitado");
                break;
            }


        }
    }
}




