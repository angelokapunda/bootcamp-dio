import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome!");
        String nome = entradaDados.nextLine();

        System.out.println("Por favor, digite o número da Agência Bancária");
        String agenciaBancaria = entradaDados.nextLine();

        System.out.println("Por favor,digite o número de Conta.");
        int numeroConta = entradaDados.nextInt();

        System.out.println("Por favor, digite o Saldo inical da Conta.");
        double saldo = entradaDados.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua Agência é %s, Conta %d e seu Saldo inicial %fR$ já está disponível para saque.",
                nome, agenciaBancaria, numeroConta, saldo);
    }
}