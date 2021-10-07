import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class HelloCodeClub extends JFrame{
    private JButton btnSayHi;

    public HelloCodeClub(){
        super("Code Club");
        setLayout(new FlowLayout()); //By default JFrame uses BorderLayout.
        btnSayHi = new JButton("Say hi");
        btnSayHi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                JOptionPane.showMessageDialog(null, "Hello Code Club!", "Code Club", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(btnSayHi);
        setSize(400,200);
        setLocationRelativeTo(null); //Position the window in the center of the screen.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //If we don't specify this directly the app won't close if we close this window.
        setVisible(true); //By default JFrames are hidden, we have to explicitly set its visibility to true.
    }

    public static void main(String args[]){
        new HelloCodeClub();
    }
}
