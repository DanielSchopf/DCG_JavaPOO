public class EmpregadoComissionado {
    protected double vendasBrutas;

    protected double comissao;

    protected String nome;

    protected String sobrenome;

    EmpregadoComissionado(String nome, String sobrenome, double comissao, double vendasBrutas) {
        this.nome= nome;
        this.sobrenome= sobrenome;
        this.comissao= comissao;
        this.vendasBrutas= vendasBrutas;
    }
    public double calculaSalario() {
        return 0;
    }


    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
