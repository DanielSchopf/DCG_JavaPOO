public class Aviao {
    private String modelo;
    private String fabricante;
    private double capacidadeCarga;
    private double autonomiaVoo;
    private int quantidadeAssentos;

    public Aviao(String modelo){
        this.modelo = modelo;
    }

    public Aviao(String modelo, String fabricante, double capacidadeCarga, double autonomiaVoo, int quantidadeAssentos) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidadeCarga = capacidadeCarga;
        this.autonomiaVoo = autonomiaVoo;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getAutonomiaVoo() {
        return autonomiaVoo;
    }

    public void setAutonomiaVoo(double autonomiaVoo) {
        this.autonomiaVoo = autonomiaVoo;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    public void setQuantidadeAssentos(int quantidadeAssentos) {
        this.quantidadeAssentos = quantidadeAssentos;
    }
}
