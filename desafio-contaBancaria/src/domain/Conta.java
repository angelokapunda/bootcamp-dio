package domain;

public abstract class Conta implements IConta {

    private static final int VALOR_CONSTANTE = 1;
    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = VALOR_CONSTANTE;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo > valor ) {
            saldo -= valor;
        }else {
            System.out.println("O valor requerido é maior do que o saldo na conta.");
        }
    }
    @Override
    public void imprimirInfosComuns() {
        System.out.printf("Cliente : %s \n ", this.cliente.getNome());
        System.out.printf("Agencia : %d \n ", this.agencia);
        System.out.printf("Numero : %d \n ", this.numero);
        System.out.printf("Saldo : %.2f \n ", this.saldo);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > this.saldo) {
            System.out.println("Não será possível fazer a transferencia , pós o valdo é inferior");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
