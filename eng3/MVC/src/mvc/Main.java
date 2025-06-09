
package mvc;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cria lista de raças com suas características
        List<DogBreed> breeds = Arrays.asList(
            new DogBreed(
                "Golden Retriever",
                "Grande",
                "Longo",
                "Sedoso",
                "Dourado",
                "Amigável",
                "Caça / Guia / Família"
            ),
            new DogBreed(
                "Spitz",
                "Pequeno",
                "Longo",
                "Liso",
                "Branco",
                "Alerta",
                "Guarda / Companhia"
            ),
            new DogBreed(
                "Fila Brasileiro",
                "Grande",
                "Curto",
                "Liso",
                "Fulvo",
                "Corajoso",
                "Guarda / Proteção"
            ),
            new DogBreed(
                "Mastiff Napolitano",
                "Gigante",
                "Curto",
                "Liso",
                "Cinza",
                "Protetor",
                "Guarda / Proteção"
            ),
            new DogBreed(
                "Rodesian",
                "Grande",
                "Curto",
                "Liso",
                "Vermelho",
                "Determinado",
                "Caça"
            )
        );

        // Cria a View (GUI)
        SwingUtilities.invokeLater(() -> {
            DogBreedView view = new DogBreedView();
            view.setVisible(true);

            // Cria o Controller, passando a lista de raças e a view
            new DogBreedController(breeds, view);
        });
    }
}
