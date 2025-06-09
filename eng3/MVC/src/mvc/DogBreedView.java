
package mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class DogBreedView extends JFrame {
    private JComboBox<String> breedComboBox;
    private JLabel lblName, lblSize, lblCoatLength, lblCoatTexture, lblColor, lblTemperament, lblFunction;
    private JButton btnAdd, btnRemove, btnEdit;

    public DogBreedView() {
        super("Catálogo de Raças de Cães");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Topo - Combobox
        breedComboBox = new JComboBox<>();
        panel.add(breedComboBox, BorderLayout.NORTH);

        // Centro - Detalhes
        JPanel detailsPanel = new JPanel(new GridLayout(7, 1, 5, 5));
        lblName = new JLabel("Nome: ");
        lblSize = new JLabel("Porte: ");
        lblCoatLength = new JLabel("Comprimento da Pelagem: ");
        lblCoatTexture = new JLabel("Textura da Pelagem: ");
        lblColor = new JLabel("Cor: ");
        lblTemperament = new JLabel("Temperamento: ");
        lblFunction = new JLabel("Função: ");

        detailsPanel.add(lblName);
        detailsPanel.add(lblSize);
        detailsPanel.add(lblCoatLength);
        detailsPanel.add(lblCoatTexture);
        detailsPanel.add(lblColor);
        detailsPanel.add(lblTemperament);
        detailsPanel.add(lblFunction);

        panel.add(detailsPanel, BorderLayout.CENTER);

        // Inferior - Botoes
        JPanel buttonPanel = new JPanel(new FlowLayout());
        btnAdd = new JButton("Adicionar");
        btnRemove = new JButton("Excluir");
        btnEdit = new JButton("Editar");
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnRemove);
        buttonPanel.add(btnEdit);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(panel);
    }

    public void setBreedList(List<String> breedNames) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (String name : breedNames) model.addElement(name);
        breedComboBox.setModel(model);
    }

    public void addBreedSelectionListener(ActionListener listener) {
        breedComboBox.addActionListener(listener);
    }

    public void updateBreedDetails(DogBreed breed) {
        lblName.setText("Nome: " + breed.getName());
        lblSize.setText("Porte: " + breed.getSize());
        lblCoatLength.setText("Comprimento da Pelagem: " + breed.getCoatLength());
        lblCoatTexture.setText("Textura da Pelagem: " + breed.getCoatTexture());
        lblColor.setText("Cor: " + breed.getColor());
        lblTemperament.setText("Temperamento: " + breed.getTemperament());
        lblFunction.setText("Função: " + breed.getFunction());
    }

    public String getSelectedBreedName() {
        return (String) breedComboBox.getSelectedItem();
    }

    public void addAddButtonListener(ActionListener listener) {
        btnAdd.addActionListener(listener);
    }

    public void addRemoveButtonListener(ActionListener listener) {
        btnRemove.addActionListener(listener);
    }

    public void addEditButtonListener(ActionListener listener) {
        btnEdit.addActionListener(listener);
    }
    
    // Campo novo
    private JPanel bottomPanel;

    public void addButton(JButton button) {
    if (bottomPanel == null) {
        bottomPanel = new JPanel(new FlowLayout());
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);
    }
    bottomPanel.add(button);
    revalidate();
    repaint();
  }
    
}