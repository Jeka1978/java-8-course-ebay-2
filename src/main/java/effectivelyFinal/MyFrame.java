package effectivelyFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        JButton button = new JButton("click me");
        add(button);

//        button.addActionListener(e -> button=null);
    }
}
