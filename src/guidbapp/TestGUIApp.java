package guidbapp;

import javax.swing.*;
import java.awt.*;

/*Desktop Application Project
*/

class GUIDbApp{


    JFrame frmMain;
    JPanel pnlCrud;
    JButton btnInsert, btnUpdate, btnDelete, btnSearch, btnClear;
    JButton btnPrev, btnNext, btnFirst, btnLast;
    JLabel lblcid, lblcname;
    JTextField txtcid, txtcname; 
    void createGUI(){
        //First we'll create the main window ie, JFrame
        frmMain = new JFrame();
        
        //Now we'll create lables and textfields
        lblcid = new JLabel();
        lblcid.setText("Customer ID");
        txtcid = new JTextField(5);
        
        lblcname = new JLabel();
        lblcname.setText("Customer Name");
        txtcname = new JTextField(20);
        
        //we need to set the layout or orientation of container before adding the components
        frmMain.setLayout(new FlowLayout());




        //Now we'll add the components into the containers
        frmMain.add(lblcid);
        frmMain.add(txtcid);
        frmMain.add(lblcname);
        frmMain.add(txtcname);
        
        //Decoration of frame
        frmMain.setTitle("CRM Window App Version 1.0");
        frmMain.setSize(700, 500);
        frmMain.setVisible(true);
    }

    void DatabaseOps(){


    }
}

public class TestGUIApp{
    public static void main(String[] args) {
        GUIDbApp guiDbApp = new GUIDbApp();
        guiDbApp.createGUI();
    }
}