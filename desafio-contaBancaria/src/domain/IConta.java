package domain;

public interface IConta {

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta conta);
    void imprimirInfosComuns();

}
