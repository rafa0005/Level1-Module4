package _05_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
        // Welcome the user. Give them a hint for the secret location.
    	JOptionPane.showMessageDialog(null, "Hello there!");
    	JOptionPane.showMessageDialog(null, "I am the x of a multiple of 12 and 18, and the y of a multiple of 24 and 5");
    }
}
