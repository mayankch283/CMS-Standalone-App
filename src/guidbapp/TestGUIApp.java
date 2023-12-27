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
        
        //We will create crud panel
        pnlCrud = new JPanel();
        pnlCrud.setBorder(BorderFactory.createTitledBorder("CRUD Panel"));

        //Now we will create crud buttons to be hosted into the crud panel
        btnInsert = new JButton();
        btnInsert.setText("Insert");
        
        btnUpdate = new JButton();
        btnUpdate.setText("Update");

        btnDelete = new JButton();
        btnDelete.setText("Delete");

        btnSearch = new JButton();
        btnSearch.setText("Search");

        btnClear = new JButton();
        btnClear.setText("Clear");


        //Now we'll add crud buttons to the crud panel
        pnlCrud.add(btnInsert);
        pnlCrud.add(btnUpdate);
        pnlCrud.add(btnDelete);
        pnlCrud.add(btnSearch);
        pnlCrud.add(btnClear);

        //Now we'll add the panel into the main frame
        frmMain.add(pnlCrud);

        //Now we'll start the work of Navigation Panel 
        JPanel pnlNavig = new JPanel();
        pnlNavig.setBorder(BorderFactory.createTitledBorder("Navigation Panel"));

        //Now we will create Navigation buttons to be hosted into the Navigation panel
        btnFirst = new JButton();
        btnFirst.setText("First");
        
        btnPrev = new JButton();
        btnPrev.setText("Update");

        btnNext = new JButton();
        btnNext.setText("Delete");

        btnLast = new JButton();
        btnLast.setText("Search");


        //Now we'll add crud buttons to the crud panel
        pnlNavig.add(btnFirst);
        pnlNavig.add(btnLast);
        pnlNavig.add(btnNext);
        pnlNavig.add(btnPrev);

        //Now we'll add the panel into the main frame
        frmMain.add(pnlNavig);







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