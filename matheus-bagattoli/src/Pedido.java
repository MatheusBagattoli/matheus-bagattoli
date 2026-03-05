/**
 * 4)
 *
 * Múltiplas responsabilidades na mesma classe.
 *
 * A classe Pedido cuida de:
 *
 * Dados do cliente (nome, email).
 *
 * Dados do produto (nome, preço).
 *
 * Lógica de cálculo (total do pedido).
 *
 * Apresentação (impressão no console).
 *
 * Isso viola o Princípio da Responsabilidade Única (SRP).
 *
 *
 * Os atributos não pertencem todos ao mesmo “conceito”:
 *
 * Cliente ≠ Produto ≠ Pedido.
 *
 * Alterações em cliente ou produto impactam diretamente o pedido.
 *
 *
 * Não é possível reutilizar Cliente ou Produto em outro contexto.
 *
 * Se um cliente fizer vários pedidos, os dados ficam duplicados.
 *
 * Um produto não pode ser compartilhado entre pedidos.
 *
 */

public class Pedido {

    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

