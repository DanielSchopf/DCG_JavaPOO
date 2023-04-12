public class Main {
    public static void main(String[] args) {
        /*
        Pessoa daniel= new Pessoa();
        daniel.setNome("Daniel Schopf");
        Empresa ufsm= new Empresa();
        ufsm.setNome("Universidade Federal de Santa Maria");
        daniel.setEmpregador(ufsm);
        System.out.println(daniel.getNome() + "é funcionario na empresa: " + daniel.getEmpregador().getNome());
        */
        Pedido pedidoDaniel = new Pedido();
        pedidoDaniel.setCodigoPedido("12345");
        pedidoDaniel.adicionaItem(new ItemPedido(1 , "Coca-Cola 2lt"));
        pedidoDaniel.adicionaItem(new ItemPedido(6 , "Xis"));
        System.out.println(pedidoDaniel.toString());
    }
}