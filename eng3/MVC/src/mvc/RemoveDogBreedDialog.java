
package mvc;

// RemoveDogBreedDialog.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class RemoveDogBreedDialog extends JDialog {
    private JList<String> breedList;
    private JButton btnRemove;
    private JButton btnCancel;

    public RemoveDogBreedDialog(JFrame parent, List<String> breeds) {
        super(parent, "Remover Raças", true);
        setSize(300, 400);
        setLocationRelativeTo(parent);

        breedList = new JList<>(new DefaultListModel<>());
        breedList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        for (String breed : breeds) {
            ((DefaultListModel<String>) breedList.getModel()).addElement(breed);
        }

        JScrollPane scrollPane = new JScrollPane(breedList);
        btnRemove = new JButton("Excluir");
        btnCancel = new JButton("Cancelar");

        JPanel btnPanel = new JPanel();
        btnPanel.add(btnRemove);
        btnPanel.add(btnCancel);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(btnPanel, BorderLayout.SOUTH);

        btnCancel.addActionListener(e -> dispose());
    }

    public void addRemoveListener(ActionListener listener) {
        btnRemove.addActionListener(listener);
    }

    public List<String> getSelectedBreeds() {
        return breedList.getSelectedValuesList();
    }
}
