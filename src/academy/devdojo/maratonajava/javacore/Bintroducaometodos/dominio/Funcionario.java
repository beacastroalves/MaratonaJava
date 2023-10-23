package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeInfo() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
                System.out.print(salario + " ");
            }
        imprimeMediaSalarios();
    }

    public void imprimeMediaSalarios() {
        if (salarios == null) {
            return;
        }
        double mediaSalarial = 0;

        for (double salario : salarios) {
            mediaSalarial += salario;
        }
        mediaSalarial /= salarios.length;

        System.out.println("\nA média salarial é de " + mediaSalarial);
    }
}
