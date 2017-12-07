/*
 * For CSCI 451: Computational Biology
 * Fall Semester, 2017
 * As this is for an undergrad class, resuse is ill-advised.
 */
package homework5;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author Samuel Shissler, Brendan Tracey, and John Trapp
 */
public class PhylogenyPrediction {

    private ArrayList<String> dnaStrands;
    private String outputString;

    /**
     * Method for when you want to load the strings later.
     */
    public PhylogenyPrediction() {

    }

    /**
     * Method for when you have the string right now.
     *
     * @param in ArrayList of DNA Strings
     */
    public PhylogenyPrediction(ArrayList<String> in) {
        dnaStrands = in;
    }

    public void setDNAStrings(ArrayList<String> in) {
        dnaStrands = in;
    }

    public ArrayList<String> getDNAStrings() {
        return dnaStrands;
    }

    public void doTheStuffWithTheThings() {
        //Is array empty
        if (dnaStrands == null) {
            throw new EmptyStackException();
        }

        //TODO: Actual assignment goes here.
        //Add to string "outputString" when you want it to be printed.
    }

    /**
     * Returns the generated tree.
     *
     * @return Formatted output of tree
     */
    public String printTree() {
        String output = "";

        return output;
    }

    /**
     * Returns the distance matrix, binary tree "T," and Fitch's algorithm
     * outputs.
     *
     * @return String of data collected
     */
    public String printOutput() {
        return outputString;
    }
}
