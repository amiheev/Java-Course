package KPP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexey on 14.10.2015.
 */
public class CreateJFrame {

    //frame
    JFrame frame = new JFrame("CheckPoint");

    //table
    EmployeeTableModel etm = new EmployeeTableModel();
    JTable employees = new JTable(etm);
    JScrollPane  employeesScroolPane = new JScrollPane(employees);



    //buttons, fields

    JTextField cardId = new JTextField();
    JButton enter = new JButton("ВОЙТИ");
    JButton exit = new JButton("ВЫЙТИ");





    public void setFrameParam(){
        frame.setSize(new Dimension(600,400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.add(employeesScroolPane, new GridBagConstraints(0,0,2,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1,1,1,1), 0,0));

        frame.add(cardId, new GridBagConstraints(1,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0,0));

        frame.add(enter, new GridBagConstraints(1,2,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0,0));

        frame.add(exit, new GridBagConstraints(1,3,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0,0));

        enter.addActionListener(new InputButtonActionListener());

        exit.addActionListener(new ExitButtonActionListener());

        frame.setVisible(true);

        frame.pack();

    }

    public void JScroolPaneSetSize(){
        employeesScroolPane.setPreferredSize(new Dimension(400, 400));
    }

    /*@Override
    public void run() {
        while (true){
            try {
                DataTable dataTable = new DataTable();
                etm.addData(dataTable.connect);
                Thread.sleep(10000);
                employees.repaint();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }*/
}

class InputButtonActionListener extends DataTable implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        DataTable dataTable = new DataTable();
        CreateJFrame jFrame = new CreateJFrame();
        dataTable.createJFrame.etm.checkIn(connect, createJFrame.cardId.getText());
        dataTable.createJFrame.frame.repaint();


    }
}

class ExitButtonActionListener extends DataTable implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        DataTable dataTable = new DataTable();
        CreateJFrame jFrame = new CreateJFrame();
        dataTable.createJFrame.etm.checkOut(connect, createJFrame.cardId.getText());
        dataTable.createJFrame.frame.repaint();

    }
}

