public class MainPedido {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Matheus", "matheus@gmail.com");
        Produto produto = new Produto("Celular",  3500);

        Pedido pedido = new Pedido(cliente, produto, 1);

        PedidoService service = new PedidoService();
        double total = service.calcularTotal(pedido);

        PedidoImprimir imprimir = new PedidoImprimir();
        imprimir.imprimir(pedido, total);
    }

}
