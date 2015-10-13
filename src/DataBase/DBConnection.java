package DataBase;

import java.sql.*;

/**
 * Created by Alexey on 11.10.2015.
 */
public class DBConnection {
    private String JDBC_DRIVER = "org.sqlite.JDBC";
    private String DB_URL = "jdbc:sqlite:employee.db";
    protected Connection connectionSQLite = null;



    public void init(){
        if (connectionSQLite == null){

        }
        try {
            Class.forName(JDBC_DRIVER);
            connectionSQLite = DriverManager.getConnection(DB_URL);
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void finalize(){
        try {
            connectionSQLite.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ResultSet query(String query){
        ResultSet result = null;
        try {
            Statement stmt = connectionSQLite.createStatement();
            result = stmt.executeQuery(query);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }

    public void updateQuery(String query){
        try {
            Statement stmt = connectionSQLite.createStatement();
            stmt.executeUpdate(query);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public  void fillDB() {
        updateQuery("INSERT INTO person(id ,name , surname) values " +
                "(0 ,'Alexey', 'mikheev')," +
                "(1 ,'Elena', 'mikheeva')," +
                "(2 ,'Jack', 'Nikolson')," +
                "(3 ,'Silvester', 'Stallone')," +
                "(4 ,'Arnold', 'Schwarcnegger')");
    }

    public  void createPersonsTable(){
        updateQuery("CREATE TABLE IF NOT EXISTS person(id INTEGER PRIMARY KEY, name text not null , surname text not null, is_present BOOLEAN DEFAULT FALSE, entry_time DATETIME, exit_time DATETIME )");
    }

    public  void cleanPersonsTable(){
        updateQuery("DELETE  FROM person");
    }
}
