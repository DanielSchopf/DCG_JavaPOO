// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Daniel");
        Cliente cliente2= new Cliente("Renan");
        Conta conta1 = new Conta(1, cliente1);
        Conta conta2= new Conta(2, cliente2);
        Agencia agencia1 = new Agencia(10);

        agencia1.addconta(conta1);
        agencia1.addconta(conta2);

        conta2.depositar(85);
        conta1.depositar(100);

        System.out.println(agencia1.getContas(1).getCliente().getNome());
        System.out.println(conta2.getSaldo());
    }
}