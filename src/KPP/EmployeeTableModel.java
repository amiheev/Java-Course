package KPP;

import DataBase.DBConnection;

import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Alexey on 12.10.2015.
 */
public class EmployeeTableModel extends AbstractTableModel {

    private int columnCount = 6;
    private ArrayList<String[]> dataArrayList;

    public EmployeeTableModel() {
        dataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }

    public void addData(String[] row) {
        String[] rowTable = new String[getColumnCount()];
        rowTable = row;
        dataArrayList.add(rowTable);
    }

    public void updateData(String[] row, String id) {
        String[] rowTable = row;
        for (int i = 0; i < 6; i++) {
            if (id.equals(getValueAt(0, i))) {

            }
        }
    }


    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }

    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "id";
            case 1:
                return "name";
            case 2:
                return "surname";
            case 3:
                return "isPresent";
            case 4:
                return "entry_time";
            case 5:
                return "exit_time";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }


    public void addData(DBConnection connect) {

        ResultSet resultSet = connect.query("SELECT * FROM person");
        try {
            while (resultSet.next()) {
                String[] row = {
                        resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("is_present"),
                        resultSet.getString("entry_time"),
                        resultSet.getString("exit_time")
                };
                addData(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void checkIn(DBConnection connection, String index) {
        dataArrayList.clear();
        connection.updateQuery("UPDATE person SET is_present = 'true' where id =" + index);
        connection.updateQuery("UPDATE person SET entry_time = datetime('now','localtime') where id=" + index);
        ResultSet resultSet = connection.query("SELECT * FROM person");
        try {
            while (resultSet.next()) {
                String[] row = {
                        resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("is_present"),
                        resultSet.getString("entry_time"),
                        resultSet.getString("exit_time")
                };
                addData(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void checkOut(DBConnection connection, String index) {
        if (Integer.parseInt(index) >=0 && Integer.parseInt(index) <= 4){
            ResultSet resultCheck = connection.query("SELECT is_present FROM person where id =" + index);
            try {
                String bool = resultCheck.getString("is_present");
                if (bool.compareToIgnoreCase("true") == 0) {
                    dataArrayList.clear();
                    connection.updateQuery("UPDATE  person SET is_present = 'false' where id =" + index);
                    connection.updateQuery("UPDATE person SET exit_time = datetime('now','localtime') where id=" + index);
                    ResultSet resultSet = connection.query("SELECT * FROM person");
                    while (resultSet.next()) {
                        String[] row = {
                                resultSet.getString("id"),
                                resultSet.getString("name"),
                                resultSet.getString("surname"),
                                resultSet.getString("is_present"),
                                resultSet.getString("entry_time"),
                                resultSet.getString("exit_time")
                        };
                        addData(row);
                    }
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }


    }

}



