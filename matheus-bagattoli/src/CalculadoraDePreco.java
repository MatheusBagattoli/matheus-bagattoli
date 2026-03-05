import org.w3c.dom.ls.LSOutput;

/**
 * 1)
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.
 *
 * Não há forma de incluir novos cálculos (ex: desconto) sem alterar o metodo.
 *
 * Violação do princípio aberto/fechado.
 *
 * Metodo com responsabilidade rígida e pouco extensível.
 */

public class CalculadoraDePreco {

    private double preco;
    private static final double imposto = 0.10;


    public static double calcular(double preco){
        return preco + (preco * imposto);

    }

    public static void main(String[] args) {
        System.out.println(calcular(100));
    }
}

