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

public class Calculator {

    public Calculator()
    {
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600, 500);
        frame.setVisible(true);

        GridBagLayout gb = new GridBagLayout();
        frame.setLayout(new GridBagLayout());
        frame.setLayout(gb);
        GridBagConstraints gc = new GridBagConstraints();

        JLabel j1 = new JLabel("Enter 5 numbers: ");
        JLabel j2 = new JLabel("Sum: ");
        JLabel j3 = new JLabel("_____");
        JLabel j4 = new JLabel("Average: ");
        JLabel j5 = new JLabel("_____");
        JLabel j6 = new JLabel("Maximum: ");
        JLabel j7 = new JLabel("_____");
        JLabel j8 = new JLabel("Minimum: ");
        JLabel j9 = new JLabel("_____");

        JTextField textField1 = new JTextField(3);
        JTextField textField2 = new JTextField(3);
        JTextField textField3 = new JTextField(3);
        JTextField textField4 = new JTextField(3);
        JTextField textField5 = new JTextField(3);


        JButton button = new JButton("Calculate");

        gc.insets = new Insets(18, 0, 0, 20);
        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx=0;
        gc.gridy=0;
        frame.add(j1,gc);

        gc.gridx=1;
        gc.gridy=0;
        frame.add(textField1,gc);
        gc.gridx=2;
        gc.gridy=0;
        frame.add(textField2,gc);
        gc.gridx=3;
        gc.gridy=0;
        frame.add(textField3,gc);
        gc.gridx=4;
        gc.gridy=0;
        frame.add(textField4,gc);
        gc.gridx=5;
        gc.gridy=0;
        frame.add(textField5,gc);

        gc.anchor=GridBagConstraints.LINE_START;
        gc.gridx=1;
        gc.gridy=2;
        gc.gridwidth=5;
        gc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(button,gc);


        gc.gridx=0;
        gc.gridy=3;
        j2.setForeground(Color.RED);
        j2.setFont(new Font("Serif",Font.PLAIN,18));
        frame.add(j2,gc);

        gc.gridx=1;
        gc.gridy=3;
        frame.add(j3,gc);


        gc.gridx=0;
        gc.gridy=4;
        j4.setForeground(Color.RED);
        j4.setFont(new Font("Serif",Font.PLAIN,18));
        frame.add(j4,gc);

        gc.gridx=1;
        gc.gridy=4;
        frame.add(j5,gc);

        gc.gridx=0;
        gc.gridy=5;
        j6.setForeground(Color.RED);
        j6.setFont(new Font("Serif",Font.PLAIN,18));
        frame.add(j6,gc);

        gc.gridx=1;
        gc.gridy=5;
        frame.add(j7,gc);

        gc.gridx=0;
        gc.gridy=6;
        j8.setForeground(Color.RED);
        j8.setFont(new Font("Serif",Font.PLAIN,18));
        frame.add(j8,gc);

        gc.gridx=1;
        gc.gridy=6;
        frame.add(j9,gc);


        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c, d, f, sum;
                double average;
                a = Integer.parseInt(textField1.getText()) ;
                b = Integer.parseInt(textField2.getText());
                c = Integer.parseInt(textField3.getText());
                d = Integer.parseInt(textField4.getText());
                f = Integer.parseInt(textField5.getText());
                sum = a + b + c + d + f;
                j3.setText(String.valueOf(sum));

                average = sum/5.00;
                j5.setText(String.valueOf(String.format("%.02f", average)));

                int arr[] = {a, b, c, d, f};
                int maxValue = Integer.MIN_VALUE;

                for(int i = 0;i < arr.length; ++i){
                    maxValue = Math.max(maxValue, arr[i]);
                }
                j7.setText(String.valueOf(maxValue));

                int minValue = Integer.MAX_VALUE;

                for(int i = 0;i < arr.length; ++i){
                    minValue = Math.min(minValue, arr[i]);
                }
                j9.setText(String.valueOf(minValue));
            }
        });
    }


    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        new Calculator();
                    }
                });

    }
}