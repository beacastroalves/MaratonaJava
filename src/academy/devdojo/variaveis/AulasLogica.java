package academy.devdojo.variaveis;

import java.util.Scanner;

public class AulasLogica {
//    public static void main(String[] args) {
//        int primeiraIdade = 30;
//        int segundaIdade = 28;
//        int diferencaDeIdades = primeiraIdade - segundaIdade;
//        System.out.println("A diferença entre idades é: " + diferencaDeIdades);
//    }

//    public static void main(String[] args) {
//        float salario = 2500.00F;
//        float porcentagem = 0.3F;
//        float porcentagemDoSalario = salario * porcentagem;
//        System.out.println(porcentagemDoSalario);
//    }

//    public static void main(String[] args) {
//        int peso = 90;
//        int resultado = peso * 35;
//        System.out.println("Você deverá beber " + resultado +"ml de água");

    //    public static void main(String[] args) {
//        double salario = 5000;
//        double resultado = salario * 0.3;
//        System.out.println("30% eh: " + resultado);
//        resultado = salario * 0.15;
//        System.out.println("15% eh: " + resultado);
//        resultado = salario * 0.05;
//        System.out.println("5% eh: " + resultado);
//    }
//    public static void main(String[] args) {
//        int idade = 18;
//        if (idade >= 18) {
//            System.out.println("Adulto");
//        } else {
//            System.out.println("Ainda não é adulto");
//        }
//    }
//    public static void main(String[] args) {
//        float salario = 5000.50F;
//        float resultado;
//        if (salario > 4500){
//            resultado = salario * 0.3F;
//            System.out.println("30% do salario eh: "+ resultado);
//        } else {
//            resultado = salario * 0.15F;
//            System.out.println("15% do salario eh: " + resultado);
//        }
//    }

    //    public static void main(String[] args) {
//        int numero = 20;
//        if (numero % 2 == 0 ){
//            System.out.println("O numero é par" );
//        } else {
//            System.out.println("O numero é impar");
//        }
//    }
//    public static void main(String[] args) {
//        double salario = 8000D;
//        if (salario <= 1903.98) {
//            System.out.println("ISENTO");
//        } else if (salario >= 1903.99 && salario <= 2826.65) {
//            System.out.println("Pagar 7.5%. O valor é 142,80");
//        } else if (salario >= 2826.66 && salario <= 3751.05) {
//            System.out.println("Pagar 15%. O valor é 354,80");
//        } else if (salario >= 3751.06 && salario < 4664.68) {
//            System.out.println("Pagar 22.5%. O valor é 636,13");
//        } else {
//            System.out.println("Pagar 27.5%. O valor é 869,36");
//        }

//    public static void main(String[] args) {
//        String nome = "Bia";
//        int idade = 17;
//        if (idade <= 10) {
//            System.out.println(nome + " participará da categoria infantil");
//        } else if (idade >= 11 && idade <= 15) {
//            System.out.println(nome + " participará da categoria Juvenil");
//        } else if (idade >= 16 && idade <= 19) {
//            System.out.println(nome + " participará da categoria Pré Adulto");
//        } else {
//            System.out.println(nome + " participará da categoria Adulto");
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite seu nome: ");
//        String nome = teclado.next();
//        System.out.println("Digite sua idade: ");
//        int idade = teclado.nextInt();
//        System.out.println("O nome digitado foi: " + nome);
//        System.out.println("A idade digitada foi: " + idade);
//    }

    //    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o nome do aluno: ");
//        String nome = teclado.next();
//        System.out.println("Digite a idade do aluno: ");
//        int idade = teclado.nextInt();
//        if (idade <= 10) {
//            System.out.println(nome + " tem " + idade + " anos e participará da categoria infantil");
//        } else if (idade >= 11 && idade <= 15) {
//            System.out.println(nome + " tem " + idade + " anos e participará da categoria Juvenil");
//        } else if (idade >= 16 && idade <= 19) {
//            System.out.println(nome + " tem " + idade + " anos e participará da categoria Pré Adulto");
//        } else {
//            System.out.println(nome + " tem " + idade + " anos e participará da categoria Adulto");
//
//        }
//    }
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite seu login:");
//        String usuario = teclado.next();
//        if (usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("administrador")) {
//            System.out.println("Usuario invalido!");
//        } else
//            System.out.println(usuario + " cadastrado com sucesso!");
//    }
//
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite seu nome: ");
//        String nome = teclado.next();
//        System.out.println("Digite sua idade: ");
//        int idade = teclado.nextInt();
//        System.out.println("Digite o sexo, sendo M para Masculino e F para Feminino: ");
//        String sexo = teclado.next();
//        if ((sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") && idade < 18) {
////            System.out.println("Alistamento não permitido" );
//        } else if (idade >= 18 && sexo.equalsIgnoreCase("M") ) {
//            System.out.println("Alistamento Obrigatório");
//        } else if (idade >= 18 && sexo.equalsIgnoreCase("F")) {
//            System.out.println("Você quer se alistar?");
//        }
//    }

//    public static void main(String[] args) {
//        char sexo = 'F';
//        int idade = 15;
//
//        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
//            System.out.println("Alistamento não permitido");
//        } else if (sexo == 'M' && idade >= 18) {
//            System.out.println("Alistamento Obrigatório");
//        } else if (sexo == 'F' && idade >= 18) {
//            System.out.println("Deseja se alistar?");
//        }
//    }


    //    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o dia: ");
//        int dia = teclado.nextInt();
//        if (dia == 1) {
//            System.out.println("Segunda-feira");
//        } else if (dia == 2) {
//            System.out.println("Terça-feira");
//        } else if (dia == 3) {
//            System.out.println("Quarta-feira");
//        } else if (dia == 4) {
//            System.out.println("Quinta-feira");
//        } else if (dia == 5) {
//            System.out.println("Sexta-feira");
//        } else if (dia == 6) {
//            System.out.println("Sabado");
//        } else if (dia == 7) {
//            System.out.println("Domingo");
//        } else {
//            System.out.println("Dia invalido");
//        }
//    }
//
//    public static void main(String[] args) {
//        int dia = 9;
//        switch (dia) {
//            case 1:
//                System.out.println("Segunda");
//                break;
//            case 2:
//                System.out.println("Terça");
//                break;
//            case 3:
//                System.out.println("Quarta");
//                break;
//            case 4:
//                System.out.println("Quinta");
//                break;
//            case 5:
//                System.out.println("Sexta");
//                break;
//            case 6:
//                System.out.println("Sabadao");
//                break;
//            case 7:
//                System.out.println("Domingao");
//                break;
//            default:
//                System.out.println("Dia invalido");
//                break;
//        }
//        System.out.println("Fim do programa!");
//    }
    //   public static void main(String[] args) {
    //   Scanner teclado = new Scanner(System.in);
    //   System.out.println("Digite a conta desejada, sendo 1 para Conta Poupança, 2 para Corrente e 3 de Investimento: ");
    //   int conta = teclado.nextInt();
    //   System.out.println("Conta escolhida foi: ");
    //   switch (conta) {
    //       case 1:
    //           System.out.println("Conta Poupança 0.05%");
    //           break;
    //       case 2:
    //           System.out.println("Conta Corrente 0.02%");
    //           break;
    //       case 3:
    //           System.out.println("Conta de Investimento 0.1%");
    //           break;
    //       default:
    //           System.out.println("Conta inválida");
    //           break;
    //   }
    //  System.out.println("Fim do programa!");
    //}

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o valor desejado");
//        int valorFinal = teclado.nextInt();
//        int i = 0;
//        while (i <= valorFinal) {
//            if (i % 2 != 0) {
//                System.out.println("i= " + i);
//            }
//            i = ++i;
//        }
//    }


//    public static void main(String[] args) {
//        int opcao = 0;
//        Scanner teclado = new Scanner(System.in);
//        while (opcao != 3) {
//            System.out.println("1. Calcular imposto");
//            System.out.println("2. Depositar salário");
//            System.out.println("3. Sair");
//            System.out.println("Digite sua opção: ");
//
//            opcao = teclado.nextInt();
//        }
//        System.out.println("Programa encerrado");
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        final String loginCorreto = "teste";
//        final String senhaCorreta = "master";
//
//        while (true) {
//            System.out.println("Digite o Login");
//            String login = teclado.nextLine();
//            System.out.println("Digite a Senha");
//            String senha = teclado.nextLine();
//            if (loginCorreto.equals(login) && senhaCorreta.equals(senha)) {
//                System.out.println("Acesso Concedido");
//                break;
//            }
//            System.out.println("Acesso Negado");
//        }
//        System.out.println("PROGRAMA ENCERRADO!");
//    }


//    public static void main(String[] args) {
//        for (int i = 15;  i <= 200; i++) {
//            System.out.println(i*i);
//
//        }

//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Fazendo a tabuada de divisao do do numero: " + i);
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o raio: ");
//        float r = teclado.nextFloat();
//        double p = 3.14;
//        double a = p * (r*r);
//        System.out.println("o valor da area é: "+ a);
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Quantas horas trabalhadas?");
//        int ht = teclado.nextInt();
//        float vh = 16.55F;
//        float sb = (ht * vh);
//        float pd = 8;
//        float td = ((pd/100)  * sb);
//        float sl = (sb - td);
//        System.out.println("O salario base é o valor " + sb + " e o salario liquido é de " + sl);
//    }

    //    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Quantos graus em Fahrenheit?");
//        float f = teclado.nextFloat();
//        float c = ((f-32)*5)/9;
//        System.out.println("Em Fahrenheit será: " + f + " e em Celcius será: " + c);
//    }
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Quantos graus em Celsius?");
//        float c = teclado.nextFloat();
//        float f = ((c * 1.8F) + 32);
//        System.out.println("Em Fahrenheit será: " + f + " e em Celcius será: " + c);
//    }
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Quanto é a altura da lata?");
//        float a = teclado.nextFloat();
//        System.out.println("Qual o diametro da lata?");
//        float d = teclado.nextFloat();
//        float r = d / 2;
//        float p = 3.14F;
//        float v = p * (r * r) * a;
//        System.out.println("O volume é " + v);

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("A viagem sera de quantos KM?");
//        float d = teclado.nextFloat();
//        float lt = d / 12;
//        System.out.println("Precisará de " + lt + "L de combustivel para essa viagem");
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Qual é o x?");
//        int x = teclado.nextInt();
//        System.out.println("O valor escolhido para x foi " + x);
//        System.out.println("Qual é o y?");
//        int y = teclado.nextInt();
//        System.out.println("O valor escolhido para y foi " + y);
//        int z = x;
//        int w = y;
//        y = z;
//        x = w;
//        System.out.println("O valor invertido será. Para x: " + x + " e para y: " + y);
//    }

    //    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Quantos dias em atraso?");
//        int dias = teclado.nextInt();
//        System.out.println("Qual valor da prestação?");
//        float vp = teclado.nextFloat();
//        float tx = 3F;
//        float a = (vp * (tx / 100) * dias);
//        float va = vp + a;
//        System.out.println("O valor da prestação era: " + vp);
//        System.out.println("O valor do acrescimo é de " + a);
//        System.out.println("O valor da prestação atrasada será: " + va);
//    }
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite a largura");
//        float l = teclado.nextFloat();
//        System.out.println("Digite o comprimento");
//        float c = teclado.nextFloat();
//        System.out.println("Digite a altura");
//        float a = teclado.nextFloat();
//        float v = c * l * a;
//        System.out.println("O volume da caixa é de: " + v + "cm³");
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite um numero inteiro");
//        int n = teclado.nextInt();
//        double a = (int) Math.pow(n, 2);
//        double b = (int) Math.pow(n, 3);
//        double c = (int) Math.pow(n, 10);
//        System.out.println("O numero n ao quadrado é: " + a);
//        System.out.println("O numero n ao cubo é: " + b);
//        System.out.println("O numero n ao decima é: " + c);
//        System.out.println("A soma deles é: " + (a + b + c));
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Qual valor em Dolar?");
//        float r = teclado.nextFloat();
//        float d = 5.32F;
//        float valorConvertido = r * d;
//        System.out.println("O valor em Real  é: " + valorConvertido);
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Informe seu salario atual:");
//        float sb = teclado.nextFloat();
//        System.out.println("Qual será o percentual de reajuste?");
//        float pr = teclado.nextFloat();
//        float ns = sb + (sb * pr) / 100;
//        System.out.println("O valor do seu salario reajustado é de " + ns);
//    }
//
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o primeiro numero:");
//        int x = teclado.nextInt();
//        System.out.println("Digite o segundo numero:");
//        int y = teclado.nextInt();
//        int a = x + y;
//        int s = x - y;
//        int m = x * y;
//        float d = x / y;
//        System.out.println("A soma de " + x + " e " + y + " é " + a);
//        System.out.println("A subtração de " + x + " e " + y + " é " + s);
//        System.out.println("A multiplicação de " + x + " e " + y + " é " + m);
//        System.out.println("A divisão de " + x + " e " + y + " é " + d);
//    }

//        public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite a distancia percorrida ");
//        float d = teclado.nextFloat();
//        System.out.println("Digite o tempo percorrido ");
//        float t = teclado.nextFloat();
//        float v = (d * 1000) / (t * 60);
//            System.out.println("A velocidade do projetil foi de " + v);
//    }

//    public static void main(String[] args) {
//    Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o raio da esfera:");
//        double r = teclado.nextDouble();
//        double p = 3.14;
//        double v = (4 * p * Math.pow(r,3)) / 3 ;
//        System.out.println("Digite a densidade da esfera:");
//        double d = teclado.nextDouble();
//        double m = (v * d)/1000;
//        System.out.println("O volume da esfera é: " + v + " e a sua massa é: " + m );
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o valor em centimetros: ");
//        double cm = teclado.nextDouble();
//        double ft = cm * 30.48;
//        System.out.println("O valor de " + cm + "convertido para pés é de "+ ft);
//    }

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Escreva um numero inteiro:");
//        int n = teclado.nextInt();
//        int at = n - 1;
//        int sc = n + 1;
//        System.out.println("O antecessor do numero " + n + " é " + at + " e seu sucessor é " + sc);
//    }
//


    //    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite a nota do 1º bimestre:");
//        int n1 = teclado.nextInt();
//        System.out.println("Digite a nota do 2º bimestre:");
//        int n2 = teclado.nextInt();
//        System.out.println("Digite a nota do 3º bimestre:");
//        int n3 = teclado.nextInt();
//        System.out.println("Digite a nota do 4º bimestre:");
//        int n4 = teclado.nextInt();
//        int m = (n1 + n2 + n3 + n4) / 4;
//        int mf = m;
//        if (mf > 0 && mf < 50) {
//            System.out.println("A media do aluno é de: " + mf + " e está Reprovado");
//        } else if (mf == 50) {
//            System.out.println("A media do aluno é de " + m + " e está de Recuperação");
//        } else {
//            System.out.println("A media do aluno é de " + m + " e está Aprovado");
//        }
//    }
//    public static void main(String[] args) {
//    Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite um numero:");
//        int n = teclado.nextInt();
//        int m = n * 2;
//        if (m >= 30){
//            System.out.println("O numero " + n +" x2 é " + m);
//        }
//    }


    //    public static void main(String[] args) {
//        int[][] arrayMulti1 = new int[3][3];
//        arrayMulti1[0][0] = 22;
//        arrayMulti1[0][1] = 11;
//        arrayMulti1[0][2] = 4;
//        arrayMulti1[1][0] = 44;
//        arrayMulti1[1][1] = 55;
//        arrayMulti1[1][2] = 9;
//        arrayMulti1[2][0] = 2;
//        arrayMulti1[2][1] = 5;
//        arrayMulti1[2][2] = 21;
//        int resultado = 1;
//        for (int i = 0; i < arrayMulti1.length; i++) {
//            for (int j = 0; j < arrayMulti1[i].length; j++) {
//                if (i == j) {
//                    resultado = resultado * arrayMulti1[i][j];
//                }
//            }
//        }
//        System.out.println(resultado);
//    }
//}

//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite um numero:");
//        int a = teclado.nextInt();
//        if (a > 0 && a < 9) {
//            System.out.println("Dentro do valor permitido");
//        } else {
//            System.out.println("Fora do valor permitido");
//        }
//    }

//        }
//        for (int i = 0; i < arrayMulti1.length; i++) {
//            for (int j = 0; j < arrayMulti1[i].length; j++) {
//                for (int k = 0 < arrayMulti1[j].length; k++) {
//                System.out.println("[" + i + "][" + j + "]="+ arrayMulti1[i][j]);
//        for (int k = 0 < arrayMulti1[j].length; k++) {
//            for (int l = 0; l < arrayMulti1[k].length; l++)
//        [" + k + "][" + l + "]"

    //    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a, maior = 0, menor = 0;
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Insira um valor:");
//            a = in.nextInt();
//            if (i == 0) {
//                maior = a;
//                menor = a;
//            }
//            if (a > maior) {
//                maior = a;
//            }
//            if (a < menor) {
//                menor = a;
//            }
////        }
//        System.out.print("Maior: " + maior + ". Menor: " + menor);
//    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1 para somar, 2 para diminuir, 3 para multiplicar e 4 para dividir");
        int a = teclado.nextInt();

       // switch (
      //          case 1 (somar)
      //  )
    }
}










