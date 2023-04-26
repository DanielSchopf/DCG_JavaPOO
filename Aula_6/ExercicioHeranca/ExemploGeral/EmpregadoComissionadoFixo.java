public class EmpregadoComissionadoFixo extends EmpregadoComissionado {
    private double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public EmpregadoComissionadoFixo(String nome, String sobrenome, double comissao, double vendasBrutas, double salarioFixo) {
        super(nome, sobrenome, comissao, vendasBrutas);
        this.salarioFixo= salarioFixo;
    }
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
