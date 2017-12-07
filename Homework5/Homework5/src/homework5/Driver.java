/*
 * For CSCI 451: Computational Biology
 * Fall Semester, 2017
 * As this is for an undergrad class, resuse is ill-advised.
 */
package homework5;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Samuel Shissler, Brendan Tracey, and John Trapp
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }

        JFrame frame = new JFrame("The Best Implemtation of Homework 5 Ever");
        frame.setSize(1000, 950);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new TheSuperAwesomeExtendedJPanelOfDoom());

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
