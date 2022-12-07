import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class GUI extends JFrame {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JLabel label1;
    private JList list1;
    private JButton button1;
    private JButton button2;
    private JTable table1;

    public static void main(String[] args) {
        GUI testExample = new GUI();
        testExample.setVisible(true);
    }
    public GUI(){
        super("APP");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);


        createTable();

        //II sposób
        createItemComboBox();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data ="wybrano:"+ comboBox1.getItemAt(comboBox1.getSelectedIndex());
                label1.setText(data);
            }
        });
    }
    private void createItemComboBox(){
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{" ","ala","ma","kota"}));
    }

    private  void createTable(){
        Object[][] data = {
                {"film 1 ",2022,9.35, 21658},
                {"film 2 ",1922,5.25, 215665},
                {"film 3 ",2010,10.00, 7758},
                {"film 4 ",1999,4.2, 6320458},
                {"film 5 ",1478,1.2, 421},

        };
        table1.setModel(new DefaultTableModel(
                data,new String[]{"tytuł","rok","ocena","ilość opinii"}
        ));
    }
}
