package maintenance.store.views;

import javax.swing.*;

public class MainView extends JFrame{
    public MainView(){
        super();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setContentPane(mainPanel);
        this.pack();
    }
    private JPanel leftPanel;
    private JPanel mainPanel;
    private JPanel rightPanel;
    private JButton closeButton;
    private JButton updateErsaButton;
    private JLabel searchEquipments;
    private JTree equipmentsTree;
    private JLabel idLabel;
    private JLabel locationLabel;
    private JLabel sapNumberLabel;
    private JLabel descriptionLabel;
    private JLabel storageLabel;
    private JTable partsTable;
    private JTextField idSearch;
    private JTextField numberSapSearch;
    private JTextField descriptionSearch;
    private JTextField storageSearch;
    private JTextField locationSearch;
}
