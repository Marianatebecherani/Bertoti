
package observer;

public class Cliente implements Assinante {
     private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeLivro) {
        System.out.println(nome + " foi notificado sobre o novo livro: " + nomeLivro);
    }
}
