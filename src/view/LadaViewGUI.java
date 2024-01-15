package view;

import javax.swing.JOptionPane;

public class LadaViewGUI implements View {

    @Override
    public void kiir(String szoveg) {
        JOptionPane.showMessageDialog(null, szoveg, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public int beker(String szoveg) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, szoveg, "?", JOptionPane.QUESTION_MESSAGE, null, null, null).toString());
    }
}
