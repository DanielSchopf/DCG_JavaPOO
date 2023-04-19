public class Conta {

    private int numero;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public Conta(int numero, Cliente C) {
        this.numero= numero;
        this.cliente= C;

    }
}
