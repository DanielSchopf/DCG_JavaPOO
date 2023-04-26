public class Gerente {
    private String senha;

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private int nroFuncionariosGerenciados;

    public void autentica(String senha) {
        if(this.senha.equals(senha)) {
            System.out.println("Senha OK!");
        } else {
            System.out.println("Senha Incorreta!");
        }
    }

    public double getBonificacao() {
        return this.salario * 0.20;
    }
}
