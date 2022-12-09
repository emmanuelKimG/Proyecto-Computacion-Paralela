import javax.print.attribute.standard.OrientationRequested;
import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
         JPanel panel1 = new JPanel();
         JFrame frame =  new JFrame();
         JTextArea textArea = new JTextArea();
         JButton button = new JButton();
         JTextPane text = new JTextPane();


         Runnable thread = new Runnable() {
             @Override
             public void run() {
                 System.out.println("Hola mubd");
             }
         };

         panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
         frame.setLayout(new FlowLayout());
         Thread hilo = new Thread(thread);
         hilo.start();

         panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         frame.setSize(200,200);
         button.setSize(50,50);


         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         button.setAlignmentX(Component.BOTTOM_ALIGNMENT);
         panel1.add(textArea);
         panel1.add(button);
         frame.add(text);
         frame.add(panel1);
         frame.setVisible(true);
    }

}
