package ConsultaContaApp;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        ConsultaContaGUI gui = new ConsultaContaGUI();
        
        JFrame frame = new JFrame("Consulta Conta App");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(gui);
        frame.setVisible(true);
    }
}

