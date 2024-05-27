package domain;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfosComuns() {
        System.out.println("-----------------------------------------Conta Corrente: -------------------------------------");
        super.imprimirInfosComuns();
    }
}
