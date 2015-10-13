package KPP;

import DataBase.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexey on 12.10.2015.
 */
public class DataTable {
    static JTable employees;
    static DBConnection connect = new DBConnection();
    public static void main(String[] args){
        connect.init();
        connect.createPersonsTable();
        connect.cleanPersonsTable();
        connect.fillDB();
        createDataTable();
    }
    public static void createDataTable(){
        JFrame frame = new JFrame("CheckPoint");
        frame.setSize(new Dimension(600,400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JTextField cardId = new JTextField();
        JButton input = new JButton("input");


        input.addActionListener(new InputButtonActionListener());


        // JTable
        EmployeeTableModel etm = new EmployeeTableModel();
        employees = new JTable(etm);



        JScrollPane  employeesScroolPane = new JScrollPane(employees);
        employeesScroolPane.setPreferredSize(new Dimension(400, 400));

        etm.addData(connect);
        etm.checkIn(connect, "2");


        frame.add(employeesScroolPane, new GridBagConstraints(0,0,2,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1,1,1,1), 0,0));

        frame.add(cardId, new GridBagConstraints(0,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0,0));

        frame.add(input, new GridBagConstraints(1,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1,1,1,1), 0,0));

        frame.setVisible(true);
        frame.pack();

    }
}

class InputButtonActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
