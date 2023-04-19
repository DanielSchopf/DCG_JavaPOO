public class Agencia {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private Conta contas[]= new Conta[100];

    public Conta getContas(int x) {
        return contas[x];
    }

    public Agencia(int numero) {
        this.numero= numero;
    }
    private int cont= 0;
    public boolean addconta(Conta C) {
        this.contas[cont] = C;
        if (cont == 99) {
            return false;
        }
        cont++;

        return true;
    }
}
