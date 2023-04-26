public class Veiculos {
    protected double velocidade;

    public double acelerar(double velocidade) {
        this.velocidade+= velocidade;
    }
    public void parar(){
        System.out.println("O veiculo parou!");
    }
}
