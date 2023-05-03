public class Vinho {
    private String nome;
    private String tipoUva;
    private String tipoVinho;
    private String fabricante;
    private String dataFabricacao;
    private double valor;
    private int safra;

    public Vinho(String nome, String tipoUva, String tipoVinho, String fabricante, String dataFabricacao, double valor, int safra) {
        this.nome= nome;
        this.tipoUva= tipoUva;
        this.tipoVinho= tipoVinho;
        this.fabricante= fabricante;
        this.dataFabricacao= dataFabricacao;
        this.valor= valor;
        this.safra= safra;
    }
    public Vinho(String nome, String tipoUva, String tipoVinho) {
        this(nome, tipoUva, tipoVinho, "", "", 0.0, 0);
    }
    public Vinho() {
        this("", "", "", "", "", 0.0, 0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoUva() {
        return tipoUva;
    }

    public void setTipoUva(String tipoUva) {
        this.tipoUva = tipoUva;
    }

    public String getTipoVinho() {
        return tipoVinho;
    }

    public void setTipoVinho(String tipoVinho) {
        this.tipoVinho = tipoVinho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSafra() {
        return safra;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }

    public String getInfoVinho() {
            return "Nome: " + nome + "\nTipo de uva: " + tipoUva + "\nClassificação: " + tipoVinho + "\nFabricante: " + fabricante + "\nData de fabricação: " + dataFabricacao + "\nValor: " + valor + "\nSafra: " + safra + "\n";

    }

}
