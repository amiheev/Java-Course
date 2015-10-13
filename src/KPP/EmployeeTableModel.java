package KPP;

import DataBase.DBConnection;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Alexey on 12.10.2015.
 */
public class EmployeeTableModel extends AbstractTableModel {

    private int columnCount = 6;
    private ArrayList<String[]> dataArrayList;
    public EmployeeTableModel (){
        dataArrayList = new ArrayList<String[]>();
        for (int i = 0; i < dataArrayList.size(); i++){
            dataArrayList.add(new String[getColumnCount()]);
        }
    }

    public void addData(String[] row) {
        String[] rowTable = new String[getColumnCount()];
        rowTable = row;
        dataArrayList.add(rowTable );
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
    public String getColumnName (int columnIndex){
        switch (columnIndex){
            case 0 : return "id";
            case 1 : return "name";
            case 2 : return "surname";
            case 3 : return "isPresent";
            case 4 : return "entry_time";
            case 5 : return "exit_time";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }

    public void addData(DBConnection connect){
        ResultSet resultSet = connect.query("SELECT * FROM person");
        try {
            while (resultSet.next()){
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
        }catch (SQLException e){
            e.printStackTrace();
        }
    }



    public void checkIn(DBConnection connection, String index) {
        connection.updateQuery("UPDATE person SET is_present = 'true' where id =" + index);
        connection.updateQuery("UPDATE person SET entry_time = datetime('now','localtime') where id=" + index);
        ResultSet resultSet = connection.query("SELECT * FROM person");
        try {
            while (resultSet.next()){
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
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

    /*public static void printEmployeeNow() {
        ResultSet rs = dbConnection.query("SELECT * FROM person");
        try {
            int index = 0;
            while (rs.next()) {
                System.out.println(String.format("%d %s %s status in office = %b время входа: %s  время выхода %s", emp.get(index).getId(), emp.get(index).getName(),
                        emp.get(index).getSurname(), emp.get(index).getPresent(), emp.get(index).getEntry_time(), emp.get(index).getExit_time()));
                index++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }*/


        /*}catch (IndexOutOfBoundsException e) {
            System.err.println("Карта не действительна");
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            printEmployeeNow();
        }*/



    /*public static void checkOut(int index){
        try {
            if (emp.get(index).getPresent() == true){
                System.out.println("EXIT SUCCESSFULLY");
                emp.get(index).setPresent(false);
                dbConnection.updateQuery("UPDATE  person SET present = 0 where id =" + index);
                dbConnection.updateQuery("UPDATE person SET exit_time = datetime('now','localtime') where id=" + index);
                ResultSet rs = dbConnection.query("SELECT exit_time from person where id =" + index);
                emp.get(index).setExit_time(rs.getString("exit_time"));
            }else {
                System.err.println("Ошибка!!!");
                System.out.println("Вы уже вышли из здания");
            }
        }catch (IndexOutOfBoundsException e) {
            System.err.println("Карта не действительна");

        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            printEmployeeNow();
        }

    }*/

