import javax.swing.*;
import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setLayout(new FlowLayout());
        frame.add(new Controller());
    }
}
