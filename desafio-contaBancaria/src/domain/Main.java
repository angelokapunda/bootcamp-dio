package domain;


public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Angelo dos Santos");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Isabele Sousa");


        Conta contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.depositar(100);

        Conta contaPoupanca = new ContaCorrente(cliente2);
        contaPoupanca.depositar(100);

        contaPoupanca.sacar(200);

        contaCorrente.transferir(150, contaPoupanca);


        contaCorrente.imprimirInfosComuns();
        contaPoupanca.imprimirInfosComuns();
    }
}