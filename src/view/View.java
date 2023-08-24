package view;

import javax.swing.JOptionPane;

public class View {

    public int readGraphicInt(String message ) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public double readGraphicDouble(String message ) {
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

    public String readGraphicString(String message ) {
        return JOptionPane.showInputDialog(message);
    }

    public void readGraphicMessage(String TamArray) {
        JOptionPane.showMessageDialog(null, TamArray);
    }

}
