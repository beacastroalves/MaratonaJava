package academy.devdojo.viradonojiraya;

import java.io.*;
import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        try (FileInputStream arquivoStream = new FileInputStream("C:\\Users\\conta\\OneDrive\\Área de Trabalho\\myarquivo.txt")) {
            Scanner teclado = new Scanner(arquivoStream);
            String nome = teclado.nextLine();
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
        } catch (IOException e) {
            System.out.println("Arquivo nao encontrado");
        }
    }
}
