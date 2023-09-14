import javax.swing.*;

public class Main
{
    private static void createWindow(int width, int height)
    { 
        JFrame frame = new JFrame("Simple GUI");
        JButton button = new JButton("click");
        
        button.setBounds(130,100,100,40);

        frame.add(button);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String arg[])
    {
        createWindow(2000,1000);
    }
}
