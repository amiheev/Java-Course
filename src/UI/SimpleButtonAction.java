package UI;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class SimpleButtonAction extends JApplet {

    private JButton additionBtn = new JButton("SUM");

    private JTextField txtField1 = new JTextField(3);

    private JTextField txtField2 = new JTextField(3);

    private JLabel answer = new JLabel();

    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ev) {

            try {

            } catch (NumberFormatException e) {

            }

            int t1, t2;

            t1 = Integer.parseInt(txtField1.getText());

            t2 = Integer.parseInt(txtField2.getText());

            answer.setText("answer: " + (t1 + t2));

            showStatus("Successfull!");

            showStatus("input error");
        }
    }

    public void init() {

        Container c = getContentPane();

        setLayout(new FlowLayout());

        c.add(txtField1);

        c.add(txtField2);

        additionBtn.addActionListener(new ButtonListener());

        c.add(additionBtn);

        c.add(answer);

    }
}