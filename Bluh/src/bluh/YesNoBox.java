package bluh;

import javax.swing.JOptionPane;

public class YesNoBox {
    
    private String a;
    private String b;
    private String c;
    private String d;
    
    public YesNoBox(String button1, String button2, String message, String title) {
        a = button1;
        b = button2;
        c = message;
        d = title;
        
        Object[] options = {a, b};
        JOptionPane pane = new JOptionPane(c,
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.YES_NO_OPTION,
                null, options, options[0]);
        
        Bluh.dialog(pane, d);
    }
}
