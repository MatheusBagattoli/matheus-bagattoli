public class PedidoImprimir {

    public void imprimir(Pedido pedido, double total){

        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Email: " + pedido.getCliente().getEmail());
        System.out.println("Produto: " + pedido.getProduto().getNomeProduto());
        System.out.println("Preço Unitário: " + pedido.getProduto().getPreco());
        System.out.println("Quantidade: " + pedido.getQuantidade());
        System.out.println("Total: " + total);

    }

}
