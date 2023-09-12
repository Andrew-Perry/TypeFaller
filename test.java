import java.awt.*; 
import javax.swing.*;

public class test
{
    private static void createWindow(int width, int height)
    { 
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER); 
        textLabel.setPreferredSize(new Dimension(width, height));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String arg[])
    {
        createWindow(2000,1000);
    }
}