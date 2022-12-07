//import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class swing {

    public swing()
    {
        JFrame frame = new JFrame("Jlabel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 350);
        frame.setVisible(true);

        GridBagLayout gb = new GridBagLayout();
        frame.setLayout(new GridBagLayout());
        frame.setLayout(gb);
        GridBagConstraints gc = new GridBagConstraints();

        JLabel j1 = new JLabel("Enter number 1: ");
        JLabel j2 = new JLabel("Enter number 2: ");
        JLabel j3 = new JLabel("Result is: ");
        JLabel j4 = new JLabel("_");

        JTextField textField1 = new JTextField(15);
        JTextField textField2 = new JTextField(15);

        JButton button = new JButton("Add");

        gc.insets = new Insets(18, 0, 0, 20);
        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx=0;
        gc.gridy=0;
        frame.add(j1,gc);
        gc.gridx=1;
        gc.gridy=0;
        frame.add(textField1,gc);

        gc.insets = new Insets(18, 0, 0, 20);//top left bottom right
        gc.gridx=0;
        gc.gridy=1;
        frame.add(j2,gc);
        gc.gridx=1;
        gc.gridy=1;
        frame.add(textField2,gc);
        gc.anchor=GridBagConstraints.LINE_START;
        gc.gridx=0;
        gc.gridy=2;
        gc.gridwidth=2;
        gc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(button,gc);

        gc.anchor=GridBagConstraints.LINE_END;
        gc.gridx=0;
        gc.gridy=3;
        j3.setForeground(Color.RED);
        j3.setFont(new Font("Serif",Font.PLAIN,18));
        frame.add(j3,gc);
        gc.anchor=GridBagConstraints.LINE_START;
        gc.gridx=1;
        gc.gridy=3;
        frame.add(j4,gc);


        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,result;
                a = Integer.parseInt(textField1.getText()) ;
                b = Integer.parseInt(textField2.getText());
                result = a+b ;
                j4.setText(String.valueOf(result));


            }
        });
    }


    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        new swing();
                    }
                });

    }
}