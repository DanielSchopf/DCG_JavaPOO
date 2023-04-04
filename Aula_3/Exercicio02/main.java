package Aula3;

public class Main {
    public static void main(String[] args) {
            Retangulo retangA = new Retangulo();

            retangA.altura = 3;
            retangA.largura = 2;
      
            System.out.println("Area do retangulo: " + retangA.calcular_area(retangA.altura, retangA.largura));
            System.out.println("Perimetro do retangulo: " + retangA.calcular_perimetro(retangA.altura, retangA.largura));
    }
}
