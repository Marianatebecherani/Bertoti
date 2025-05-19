package observer;

public interface Publicador {
    void adicionarAssinante(Assinante a);
    void removerAssinante(Assinante a);
    void notificarAssinantes(String nomeLivro);
}

