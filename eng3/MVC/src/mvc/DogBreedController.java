
package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import javax.swing.*;

public class DogBreedController {
    private List<DogBreed> breedList;
    private DogBreedView view;
    private Map<String, DogBreed> breedMap; // Mapeia nome → objeto DogBreed

    public DogBreedController(List<DogBreed> breedList, DogBreedView view) {
        this.breedList = breedList;
        this.view = view;

        // Constrói o mapa a partir da lista
        breedMap = breedList.stream()
                .collect(Collectors.toMap(DogBreed::getName, breed -> breed));

        // Preenche a view com nomes de raças
        view.setBreedList(breedList.stream()
                                 .map(DogBreed::getName)
                                 .collect(Collectors.toList()));

        // Registra o listener para seleção
        view.addBreedSelectionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedName = view.getSelectedBreedName();
                if (selectedName != null) {
                    DogBreed breed = breedMap.get(selectedName);
                    view.updateBreedDetails(breed);
                }
            }
        });

        // Exibe detalhes da primeira raça inicialmente
        if (!breedList.isEmpty()) {
            DogBreed first = breedList.get(0);
            view.updateBreedDetails(first);
        }
        
        // Adicione botão "Adicionar" à view
        private JButton btnAdd;

        public DogBreedController(List<DogBreed> breedList, DogBreedView view) {
        this.breedList = new ArrayList<>(breedList); // Permite edição
        this.view = view;

        breedMap = breedList.stream()
            .collect(Collectors.toMap(DogBreed::getName, breed -> breed));

        view.setBreedList(getBreedNames());
        view.addBreedSelectionListener(e -> {
        String selectedName = view.getSelectedBreedName();
        if (selectedName != null && breedMap.containsKey(selectedName)) {
            view.updateBreedDetails(breedMap.get(selectedName));
        }
    });

        if (!breedList.isEmpty()) {
            view.updateBreedDetails(breedList.get(0));
        }

        // Adiciona botão de adicionar
        this.btnAdd = new JButton("Adicionar Raça");
        view.addButton(btnAdd); // ⬅️ método novo que criamos na View (mostrarei abaixo)
        btnAdd.addActionListener(e -> openAddBreedDialog());
        }

        // Cria lista de nomes atualizada
        private List<String> getBreedNames() {
    return breedList.stream()
            .map(DogBreed::getName)
            .collect(Collectors.toList());
}

        // Método que abre a janela de adicionar e adiciona à lista
        private void openAddBreedDialog() {
    AddDogBreedDialog dialog = new AddDogBreedDialog(view);
    dialog.addSaveListener(e -> {
        DogBreed newBreed = dialog.getNewBreed();
        if (newBreed.getName().trim().isEmpty()) {
            JOptionPane.showMessageDialog(dialog, "Nome da raça não pode estar vazio.");
            return;
        }
        breedList.add(newBreed);
        breedMap.put(newBreed.getName(), newBreed);
        view.setBreedList(getBreedNames());
        view.updateBreedDetails(newBreed);
        dialog.dispose();
            });
            dialog.setVisible(true);
            }

                private JButton btnRemove;

        public DogBreedController(List<DogBreed> breedList, DogBreedView view) {
            // ... (código existente)

            // Botão "Remover"
            btnRemove = new JButton("Remover Raças");
            view.addButton(btnRemove);
            btnRemove.addActionListener(e -> openRemoveBreedDialog());
        }

        private void openRemoveBreedDialog() {
            RemoveDogBreedDialog dialog = new RemoveDogBreedDialog(view, getBreedNames());
            dialog.addRemoveListener(e -> {
                List<String> selected = dialog.getSelectedBreeds();
                if (!selected.isEmpty()) {
                    for (String name : selected) {
                        breedMap.remove(name);
                        breedList.removeIf(b -> b.getName().equals(name));
                    }
                    view.setBreedList(getBreedNames());
                    if (!breedList.isEmpty()) {
                        view.updateBreedDetails(breedList.get(0));
                    } else {
                        view.updateBreedDetails(new DogBreed("", "", "", "", "", "", ""));
                    }
                }
                dialog.dispose();
            });
            dialog.setVisible(true);
        }

  }
}
