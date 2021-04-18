import java.util.Scanner;
public class Exercicios {
    Scanner input = new Scanner(System.in);

    public void exercicio01() {
        // Somar os 3 valores e mostrar o quadrado do resultado
        System.out.println("Exercicio 01: Digite 3 números inteiros...");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int soma = num1 + num2 + num3;
        int quadrado = soma * soma;
        System.out.println("O quadrado da soma dos três números é: " + quadrado);
    }

    public void exercicio02() {
        System.out.println("Exercicio 02: Digite 4 números inteiros...");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        // Multiplicação do primeiro pelo terceiro
        // Soma do segundo pelo quarto
        int multiplicacao = num1 * num3;
        int soma = num2 + num4;
        System.out.println("Multiplicação do primeiro pelo terceiro: " + multiplicacao);
        System.out.println("Soma do segundo pelo quarto: " + soma);
    }

    public void exercicio03() {
        System.out.println("Qual a cotação do dolar hoje: ");
        System.out.print("R$");
        double cotacao = input.nextDouble();
        System.out.println("Quanto você tem em reais: ");
        System.out.print("R$");
        double saldo = input.nextDouble();
        double conversao = saldo / cotacao;
        System.out.println("Você tem U$" + conversao + ", equivalentes em dolares.");
    }

    public void exercicio04() {
        System.out.println("Qual o valor do litro da gasolina hoje: ");
        System.out.print("R$");
        double litroGasolina = input.nextDouble();
        System.out.println("Quanto você deseja abastecer em reais: ");
        System.out.print("R$");
        double valorAbastecer = input.nextDouble();
        double calcLitros = valorAbastecer / litroGasolina;
        System.out.println("Você abastecerá " + calcLitros + " litros de gasolina.");
    }

    public void exercicio05() {
        System.out.println("Digite a temperatura em Celsius: ");
        System.out.print("--> ");
        double tempCelsius = input.nextDouble();
        double tempFahreneit = tempCelsius * 1.8 + 32;
        System.out.println("A temperatura em Fahrenheit é " + tempFahreneit + " Fº");
    }

    public void exercicio06() {
        System.out.println("Digite o valor da altura da lata de óleo em cm: ");
        System.out.print("-->");
        double altura = input.nextDouble();
        System.out.println("Digite o valor do raio da lata de óleo em cm: ");
        System.out.print("-->");
        double raio = input.nextDouble();
        double volume = 3.14 * (raio * raio) * altura;
        System.out.println("O volume dessa lata de óleo é de " + volume + "cm³");
    }

    public void exercicio07() {
        System.out.println("Qual o valor do boleto: ");
        System.out.print("R$");
        double valorBoleto = input.nextDouble();
        System.out.println("Qual a porcentagem de juros: ");
        System.out.print("-->");
        double porcentagemJuros = input.nextDouble();
        System.out.println("Quantos dias de atraso: ");
        System.out.print("-->");
        int diasAtraso = input.nextInt();
        double novoValor = valorBoleto + (valorBoleto * (porcentagemJuros / 100)) * diasAtraso;
        System.out.println("O valor atual do boleto é: R$" + novoValor);
    }

    public void exercicio08() {
        System.out.println("Qual é o seu salário mensal: ");
        System.out.print("R$");
        double salario = input.nextDouble();
        System.out.println("Qual o valor total de suas despesas mensais: ");
        System.out.print("R$");
        double despesas = input.nextDouble();
        double lucroMensal = salario - despesas;
        double anosMilhonario = (1000000 / lucroMensal) / 12;
        System.out.println("Você vai demorar " + anosMilhonario + " anos para ser milhonário...");
    }
}
