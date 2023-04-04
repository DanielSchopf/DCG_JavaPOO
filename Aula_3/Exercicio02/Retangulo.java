package Aula3;

public class Retangulo {
    public double altura, largura;
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcular_area(double x, double y){
        return x*y;
    }
    public double calcular_perimetro(double x, double y){
        return 2*(x+y);
    }
}
