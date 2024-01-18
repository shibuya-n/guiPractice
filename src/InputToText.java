import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class InputToText extends JFrame{
    private static JTextField textfield_obj = new JTextField(16);
    private static JLabel output = new JLabel();

    private static JLabel numOutput = new JLabel();

    public InputToText(){
        super("Get user input");
        Container c =  getContentPane();
        c.setLayout(new FlowLayout());
    }

    private static class Button implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String item = (textfield_obj.getText());
            String toReturn = "";
            int randomInt = (int) (Math.random() * 20) + 1;

            numOutput.setText("Hit " + randomInt + " times");
            for (int i = 0;i < randomInt; i++){
                toReturn += item;
                output.setText(toReturn);
            }

        }
    }

    public static void main (String[] args){
        InputToText window = new InputToText();
        window.setBounds(100, 100, 300, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(textfield_obj);

        JButton button_obj = new JButton("Hit");
        button_obj.addActionListener(new Button());
        window.add(button_obj);

        window.add(output);


        window.add(numOutput);

        window.setVisible(true);
    }
}
