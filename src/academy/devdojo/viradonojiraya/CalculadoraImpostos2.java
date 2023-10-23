package academy.devdojo.viradonojiraya;

public class CalculadoraImpostos2 {
    public static void main(String[] args) {
        double salario = 3000;
        double resultado = salario * 0.3;
        System.out.println("30% é: " + resultado);

        resultado = salario * 0.15;
        System.out.println("15% é: " + resultado);

        resultado = salario * 0.05;
        System.out.println("5% é: " + resultado);
    }
}
