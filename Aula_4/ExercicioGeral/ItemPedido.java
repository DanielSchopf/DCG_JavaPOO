public class ItemPedido {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ItemPedido(double valor, String nome) {
        this.valor= valor;
        this.nome= nome;
    }
}
