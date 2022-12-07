import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

    private JLabel LabelKurs;
    private JTree tree1;
    private JLabel NameKurs;
    private JTextField textKursu;
    private JTextField textCena;
    private JButton opłaćKursButton;
    private JButton wyjścieButton;

    public static void main(String[] args) {
        GUI app= new GUI();
        app.setVisible(true);
    }

    private JPanel JPanel1;

    public GUI(){
        super("KURSY");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        tree1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree1.getSelectionPath().getLastPathComponent();
                String nazwaKursu = root.getUserObject().toString();
                textKursu.setText(nazwaKursu);
                if(nazwaKursu == "C++") textCena.setText("2500");
                if(nazwaKursu == "C#") textCena.setText("1800");
                if(nazwaKursu == "JAVA") textCena.setText("3000");
                if(nazwaKursu == "Python") textCena.setText("5000");
                if(nazwaKursu == "ASP.NET") textCena.setText("2125");
                if(nazwaKursu == "Adobe Photoshop") textCena.setText("1500");
                if(nazwaKursu == "CorelDRAW") textCena.setText("7250");
                if(nazwaKursu == "Adobe InDesign") textCena.setText("3200");
                if(nazwaKursu == "AutoCAD") textCena.setText("6000");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy");
        //poziom 1
        DefaultMutableTreeNode KProgramowanie= new DefaultMutableTreeNode("Programowanie");
        DefaultMutableTreeNode PK1= new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode PK2= new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode PK3= new DefaultMutableTreeNode("JAVA");
        DefaultMutableTreeNode PK4= new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode PK5= new DefaultMutableTreeNode("ASP.NET");
        KProgramowanie.add(PK1);
        KProgramowanie.add(PK2);
        KProgramowanie.add(PK3);
        KProgramowanie.add(PK4);
        KProgramowanie.add(PK5);
        //poziom 2
        DefaultMutableTreeNode PGrafika = new DefaultMutableTreeNode("Grafika Komputerowa");
        DefaultMutableTreeNode PP1= new DefaultMutableTreeNode("Adobe Photoshop");
        DefaultMutableTreeNode PP2= new DefaultMutableTreeNode("CorelDRAW");
        DefaultMutableTreeNode PP3= new DefaultMutableTreeNode("Adobe InDesign");
        DefaultMutableTreeNode PP4= new DefaultMutableTreeNode("AutoCAD");
        PGrafika.add(PP1);
        PGrafika.add(PP2);
        PGrafika.add(PP3);
        PGrafika.add(PP4);
        //dodanie do root
        root.add(KProgramowanie);
        root.add(PGrafika);
        //utworzenei tree i wstawienie mojego tree
        DefaultTreeModel myModel = new DefaultTreeModel(root);

        tree1 = new JTree(myModel);
    }
}
