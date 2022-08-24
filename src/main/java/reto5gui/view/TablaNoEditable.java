package reto5gui.view;

import javax.swing.JTable;

public class TablaNoEditable extends JTable{

    public TablaNoEditable(Object[][] arg0, Object[] arg1){
        super(arg0, arg1);
    }

    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
}
