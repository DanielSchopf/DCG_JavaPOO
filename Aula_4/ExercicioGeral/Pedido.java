public class Pedido {
    private String codigoPedido;

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    private int contador= 0;
    private ItemPedido[] itensPedido= new ItemPedido[100];

    public void adicionaItem(ItemPedido item) {
        itensPedido[contador]= item;
        contador++;
    }
    public String toString() {
        String aux = "";
        for(int i= 0; i<contador; i++) {
            aux = aux + "Item: " + this.itensPedido[i].getNome() + "\n";
        }
        return "Pedido no. " + this.codigoPedido + "\n" + "Itens:\n" + aux;
    }
}
