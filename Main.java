import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.io.IOException;


public class Main extends JFrame{
    private JTextField BarCode;
    private JButton enterButton;
    private JPanel Display1;
    private JButton clearButton;
    private JLabel Display;

    public  Main(){
        setContentPane(Display1);
        setTitle("Welcome");
        setSize(640,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BCno= BarCode.getText();
                String key = "";
                String value = "";
                String filePath = "C:\\Users\\patel\\Desktop\\Trial\\Product_Price.txt";
                HashMap<String, String> map = new HashMap<String, String>();
                String line = "";
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader(filePath));
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                while (true) {
                    try {
                        if (!((line = reader.readLine()) != null)) break;
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    String[] parts = line.split(":", 2);
                    if (parts.length >= 2) {
                        key = parts[0];
                        value = parts[1];
                        map.put(key, value);
                    } else {
                    }
                    String store = map.get((BCno));
                    Display.setText("<html><b>Product ["+store+"] Added <br> <br>" +
                            "<i>Please click the clear button <br>to clear BarCode field</i></html>");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarCode.setText("");
                Display.setText("<html><i>You can now enter the BarCode for<br> the next PRODUCT you'd like to add</i>");
            }
        });
    }

    public static void main(String[] args) throws FileNotFoundException {
        Main demo = new Main();

    }
}


