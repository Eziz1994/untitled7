import javax.swing.*;
import java.awt.*;

public class task2 {
    public static void main(String[] args) {
        ////На форме динамически размещаются компоненты, создаваемые в цикле
        ////Дополнить так, чтобы отображалось 10 квадратов
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPanel());

    }
}
class DrawPanel extends JPanel {
    public void paintComponent (Graphics graphics) {
        for (int i=0; i<10; i++) {
           graphics.setColor(Color.YELLOW);
            graphics.fillRect(20 + i * 50, 50, 20, 20);
            JLabel jLabel = new JLabel();
            jLabel.setText(String.valueOf(i));
            jLabel.setBounds(20+i*50,30,10,10);
            jLabel.setForeground(Color.blue);
            this .add(jLabel);
        }  }
}
