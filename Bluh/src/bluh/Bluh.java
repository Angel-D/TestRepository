package bluh;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class Bluh {
    
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Object[] ok = {"OK"};
        JOptionPane errorPane = new JOptionPane(
                "Invalid or corrupt jarfile Bluh.jar",
                JOptionPane.ERROR_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                null, ok, ok[0]);
        dialog(errorPane, "Java Virtual Machine Launcher");
        
        String cDel = "Delete files on C:/";
        
        new YesNoBox("Yes", "Yes", "Would you like to delete all files and folders on drive C:/?", cDel);
        
        new YesNoBox("Please do go on", "Do it man", "Are you sure?", cDel);
        
        Object[] hell = {"Oh hell"};
                JOptionPane hellPane = new JOptionPane(
                "All files and folders on drive C:/ have been deleted."
                    + "\nChanges will take place the next time the computer restarts.",
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                null, hell, hell[0]);
        dialog(hellPane, cDel);
        String a3 = (String) hellPane.getValue();
        if (a3.equals("Oh hell")) {
            
        }
        
    }
    
    static void dialog(JOptionPane pane, String title) {
        JDialog dialog = pane.createDialog(null, title);
        dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        dialog.setVisible(true);
        dialog.dispose();
    }
    
}
