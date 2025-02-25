import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyEvents extends JFrame implements KeyListener {

    private JTextField textField;
    private JLabel label;

    public KeyEvents() {
        setTitle("Key Event Question");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        getContentPane().setBackground(Color.PINK);

        textField = new JTextField(20);
        textField.addKeyListener(this); 

        label = new JLabel("Press any key...");

        add(textField);
        add(label);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        label.setText("Key Typed: " + keyChar);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        label.setText("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    public void keyReleased(KeyEvent e) {
        char keyChar = e.getKeyChar();
        label.setText("Key Released: " + keyChar);
    }

    public static void main(String[] args) {
        new KeyEvents();
    }
}
