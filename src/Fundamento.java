import java.util.Scanner; // Importando Scanner para fazer entrada de dados

public class Fundamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Instanciando a classe Scanner

        System.out.println("Hello, world!");
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Olá, " + nome + ". Quantos anos você tem?");
        int idade = input.nextInt();
        System.out.println("Legal você tem " + idade + " anos!");
    }
}
