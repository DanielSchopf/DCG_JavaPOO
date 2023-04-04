public class Main {
    public static void main(String[] args) {
            Conta contaDaniel = new Conta();
            contaDaniel.setTitular("Daniel Schopf");
            Conta contaInacio = new Conta();
            contaInacio.setTitular("Inacio Cmamargo Buemo");
            Retangulo retanguloA= new Retangulo();

            retanguloA.altura = 3;
            retanguloA.largura = 2;
              

            contaDaniel.setSaldo(150);
            contaInacio.setSaldo(50);
            contaInacio.deposito(50);

            System.out.println("Saldo: R$ " + contaDaniel.getSaldo() + "\nTitular: " + contaDaniel.getTitular());
            

            contaDaniel.transfer(30, contaInacio);

            System.out.println("Saldo novo do " + contaInacio.getTitular() + " " + contaInacio.getSaldo());
    }
}
