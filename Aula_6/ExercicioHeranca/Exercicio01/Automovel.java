public class Automovel extends Veiculos {
    private double litros;

    private double velocidade;

    public Automovel(double velocidade) {
        this.velocidade= velocidade;
    }

    public void mudarOleo(double litros){
        System.out.println("Trocou " + litros + " de óleo");
    }
}
