package domain;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfosComuns() {
        System.out.println("---------------------------------------Conta Poupança: ------------------------------------------");
        super.imprimirInfosComuns();
    }
}
