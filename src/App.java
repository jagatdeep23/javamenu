
import view.Mainframe;

import javax.swing.*;

/**
 * Created by jc277043 on 18/05/15.
 */
public class App {
    private  static Mainframe mainframe;
    static {
        mainframe=new Mainframe();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater((new Runnable() {
            @Override
            public void run() {
                mainframe.setVisible(true);
            }
        }));

    }
}
