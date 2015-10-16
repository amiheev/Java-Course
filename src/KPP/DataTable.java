package KPP;

import DataBase.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexey on 12.10.2015.
 */
public class DataTable{

    static DBConnection connect = new DBConnection();
    static CreateJFrame createJFrame = new CreateJFrame();
    public static void main(String[] args){
        connect.init();
        connect.createPersonsTable();
        connect.cleanPersonsTable();
        connect.fillDB();
        createJFrame.setFrameParam();
        createJFrame.JScroolPaneSetSize();
        createJFrame.etm.addData(connect);
    }
}



