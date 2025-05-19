package observer;

import java.util.ArrayList;
import java.util.List;

public class LojaLivros implements Publicador {
    private List<Assinante> assinantes = new ArrayList<>();

    @Override
    public void adicionarAssinante(Assinante a) {
        assinantes.add(a);
    }

    @Override
    public void removerAssinante(Assinante a) {
        assinantes.remove(a);
    }

    @Override
    public void notificarAssinantes(String nomeLivro) {
        for (Assinante a : assinantes) {
            a.atualizar(nomeLivro);
        }
    }

    public void novoLivro(String nomeLivro) {
        System.out.println("Novo livro disponível: " + nomeLivro);
        notificarAssinantes(nomeLivro);
    }
}
