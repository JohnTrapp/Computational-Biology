/*
 * For CSCI 451: Computational Biology
 * Fall Semester, 2017
 * As this is for an undergrad class, resuse is ill-advised.
 */
package homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author Samuel Shissler, Brendan Tracey, and John Trapp
 */
public class PhylogenyPrediction {

    private ArrayList<String> dnaStrands;
    private String outputString;

    /**
     * Constructor for when you want to load the strings later.
     */
    public PhylogenyPrediction() {
        
    }

    /**
     * Constructor for when you have the string right now.
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
        
        //Do the alignment boogie
        int[][] D = new int[dnaStrands.size()][dnaStrands.size()];
        for(int i=0; i < dnaStrands.size(); i++){
            for(int j = 0; j<dnaStrands.size(); j++){
                SmithWaterman s = new SmithWaterman(dnaStrands.get(i),dnaStrands.get(i));
                s.align();
                D[i][j] = s.getScore();
            }
        }
        
        //Add the pairwise distance matrix to the print buffer
        outputString += "Pairwise Distance Matrix\n\n";
        outputString += Arrays.deepToString(D).replace("], ", "]\n");
        
        
        for(int i=0; i<D.length; i++){
            for(int j=0; j<D.length; j++){
                
            }
        }
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

class Node{
    Node right, left;
    String s;
    public Node(){
        right = null;
        left = null;
        s = "";    
    }
    
    public String getString(){
        return s;
    }
    
    public Node getRight(){
        return right;
    }
    
    public Node getLeft(){
        return left;
    }
    
    public void combine(){
        if(left!=null){
            s += left.s;
        }
        if(right!=null){
            s += right.s;
        }
    }
}