package academy.devdojo.viradonojiraya;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 10000F;
        float resultado = 0.0F;
        String porcentagem = "";
        if (salario <= 4500) {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        } else {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        }

        System.out.println("O valor final em porcentagem de " + porcentagem + " eh de " + resultado);
    }
}
