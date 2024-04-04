/* 

 * Crie o projeto ContaBanco que receberá dados via terminal
 * Dentro do projeto, crie a classe ContaTerminal.
 * java para realizar toda a codificação do nosso programa.
 * Permita que os dados sejam inseridos via terminal sendo que 
 * o usuário receberá a mensagem de qual informação será solicitada
 */


import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {

    public String NomeCliente,Agencia;
    Int Numero;
    float Saldo;

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, por favor digite seu nome: ");
        String NomeCliente = scanner.next();


        System.out.println("Digite sua Agencia: ");
        String Agencia = scanner.next();

        System.out.println("Digite número da Conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double Saldo = scanner.nextDouble();

        System.out.println(" Olá "+ NomeCliente +", Seja bem vindo(a)");
        System.out.println("Obrigado por criar uma conta em nosso banco, sua Agência é: " + Agencia);
        System.out.println("O número da sua conta é: "+ Numero);
        System.out.println("Seu saldo atual é: " + Saldo + " E já está disponivel para saque.");
        
    }
}
