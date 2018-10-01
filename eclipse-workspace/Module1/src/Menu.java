import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu implements ActionListener{
    public static void main(String[] args) {
        new Menu().createUI();
    }
    
    //Initialize Swing items
    JFrame frame = new JFrame("Number Systems");
    JPanel panel = new JPanel();
    JButton binToDec = new JButton("Bin to Dec");
    JButton binToHex = new JButton("Bin to Hex");
    JButton decToBin = new JButton("Dec to Bin");
    JButton decToHex = new JButton("Dec to Hex");
    JButton hexToBin = new JButton("Hex to Bin");
    JButton hexToDec = new JButton("Hex to Dec");

    
    //Method to present the UI
    private void createUI() {
        frame.add(panel);
        panel.add(binToDec);
        panel.add(binToHex);
        panel.add(decToBin);
        panel.add(decToHex);
        panel.add(hexToBin);
        panel.add(hexToDec);
        frame.pack();
        
        frame.setVisible(true);
        
        binToDec.addActionListener(this);
    }

    //Leads buttons to a prompt
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == binToDec) {
            JOptionPane.showMessageDialog(null, "Yeet");
        }
        if(event.getSource() == binToHex) {
            JOptionPane.showMessageDialog(null, "Yeet");
        }
        if(event.getSource() == decToBin) {
            JOptionPane.showMessageDialog(null, "Yeet");
        }
        if(event.getSource() == decToHex) {
            JOptionPane.showMessageDialog(null, "Yeet");
        }
        if(event.getSource() == hexToBin) {
            JOptionPane.showMessageDialog(null, "Yeet");
        }
        if(event.getSource() == hexToDec) {
            JOptionPane.showMessageDialog(null, "Yeet");
        }
        
    }
}
