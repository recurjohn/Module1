import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        new Menu().createUI();
    }
    
    //Initialize Swing items
    JFrame frame = new JFrame("Number Systems");
    JPanel panel = new JPanel();
    JButton binToDecButton = new JButton("Bin to Dec");
    JButton binToHexButton = new JButton("Bin to Hex");
    JButton decToBinButton = new JButton("Dec to Bin");
    JButton decToHexButton = new JButton("Dec to Hex");
    JButton hexToBinButton = new JButton("Hex to Bin");
    JButton hexToDecButton = new JButton("Hex to Dec");

    
    //Method to present the UI
    private void createUI() {
        frame.add(panel);
        panel.add(binToDecButton);
        panel.add(binToHexButton);
        panel.add(decToBinButton);
        panel.add(decToHexButton);
        panel.add(hexToDecButton);
        frame.pack();
        
        frame.setVisible(true);
    }
}
