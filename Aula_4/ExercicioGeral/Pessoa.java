public class Pessoa {

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa empregador;
    public Empresa getEmpregador() {
        return empregador;
    }

    public void setEmpregador(Empresa empregador) {
        this.empregador = empregador;
    }

}
