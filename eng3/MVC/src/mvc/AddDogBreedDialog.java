
package mvc;

// AddDogBreedDialog.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddDogBreedDialog extends JDialog {
    private JTextField txtName;
    private JComboBox<String> cmbSize;
    private JComboBox<String> cmbCoatLength;
    private JComboBox<String> cmbCoatTexture;
    private JTextField txtColor;
    private JTextField txtTemperament;
    private JTextField txtFunction;
    private JButton btnSave;
    private JButton btnCancel;

    public AddDogBreedDialog(JFrame parent) {
        super(parent, "Adicionar Nova Raça", true);
        setSize(400, 400);
        setLocationRelativeTo(parent);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(9, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtName = new JTextField();
        cmbSize = new JComboBox<>(new String[] {"Mini", "Pequeno", "Médio", "Grande", "Gigante"});
        cmbCoatLength = new JComboBox<>(new String[] {"Sem pelo", "Raso", "Curto", "Semilongo", "Longo"});
        cmbCoatTexture = new JComboBox<>(new String[] {"Duro", "Heterogêneo", "Liso", "Sedoso", "Lanoso"});
        txtColor = new JTextField();
        txtTemperament = new JTextField();
        txtFunction = new JTextField();
        btnSave = new JButton("Salvar");
        btnCancel = new JButton("Cancelar");

        panel.add(new JLabel("Nome:"));
        panel.add(txtName);
        panel.add(new JLabel("Porte:"));
        panel.add(cmbSize);
        panel.add(new JLabel("Comprimento da Pelagem:"));
        panel.add(cmbCoatLength);
        panel.add(new JLabel("Textura da Pelagem:"));
        panel.add(cmbCoatTexture);
        panel.add(new JLabel("Cor:"));
        panel.add(txtColor);
        panel.add(new JLabel("Temperamento:"));
        panel.add(txtTemperament);
        panel.add(new JLabel("Função:"));
        panel.add(txtFunction);
        panel.add(btnSave);
        panel.add(btnCancel);

        setContentPane(panel);

        btnCancel.addActionListener(e -> dispose());
    }

    public void addSaveListener(ActionListener listener) {
        btnSave.addActionListener(listener);
    }

    public DogBreed getNewBreed() {
        return new DogBreed(
            txtName.getText(),
            (String) cmbSize.getSelectedItem(),
            (String) cmbCoatLength.getSelectedItem(),
            (String) cmbCoatTexture.getSelectedItem(),
            txtColor.getText(),
            txtTemperament.getText(),
            txtFunction.getText()
        );
    }
}
