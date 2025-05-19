
package observer;

public class Main {
    public static void main(String[] args) {
        LojaLivros loja = new LojaLivros();

        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        loja.adicionarAssinante(cliente1);
        loja.adicionarAssinante(cliente2);

        loja.novoLivro("Java para Iniciantes");
        loja.novoLivro("Padrões de Projeto em Java");

        loja.removerAssinante(cliente1);

        loja.novoLivro("Estruturas de Dados Avançadas");
    }
}
