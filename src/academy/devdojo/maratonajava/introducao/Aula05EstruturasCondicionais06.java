package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7 se é dia util ou final de semana
        Scanner teclado = new Scanner(System.in);
        int dia = 0;
        while(dia <= 0 || dia > 7) {
            System.out.println("Digite um dia de 1 a 7");
            dia = teclado.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Domingo, fim de semana");
                    break;
                case 2:
                    System.out.println("Segunda, dia útil");
                    break;
                case 3:
                    System.out.println("Terça, dia útil");
                    break;
                case 4:
                    System.out.println("Quarta, dia útil");
                    break;
                case 5:
                    System.out.println("Quinta, dia útil");
                    break;
                case 6:
                    System.out.println("Sexta, dia útil");
                    break;
                case 7:
                    System.out.println("Sábado, fim de semana");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}
