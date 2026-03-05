public class PedidoService {

    public double calcularTotal(Pedido pedido){
        return pedido.getProduto().getPreco() * pedido.getQuantidade();
    }
}
