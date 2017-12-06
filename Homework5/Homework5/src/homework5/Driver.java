/*
 * For CSCI 451: Computational Biology
 * Fall Semester, 2017
 * As this is for an undergrad class, resuse is ill-advised.
 */
package homework5;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Samuel Shissler, Brendan Tracey, and John Trapp
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("The Best Implemtation of Homework 5 Ever");
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new TheSuperAwesomeExtendedJPanelOfDoom());

        frame.setVisible(true);
    }
    
}
