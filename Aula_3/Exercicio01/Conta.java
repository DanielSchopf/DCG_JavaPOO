package Aula3;
public class Conta {
    private double saldo;

    public String titular;
    public void saque(double valor){
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente! ");
        } else{
            this.saldo = this.saldo - valor;
        }
    }
    public void deposito(double valor){
        this.saldo = saldo + valor;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void transfer(double valor, Conta conta2) {
        this.saque(valor);
        conta2.setSaldo(conta2.getSaldo() + valor);
    }
}
