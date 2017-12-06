/*
 * For CSCI 451: Computational Biology
 * Fall Semester, 2017
 * As this is for an undergrad class, resuse is ill-advised.
 */
package homework5;

import java.util.EmptyStackException;

/**
 *
 * @author Samuel Shissler, Brendan Tracey, and John Trapp
 */
public class PhylogenyPrediction {
    private String dnaStrings[];
    
    /**
     * Method for when you want to load the strings later
     */
    public PhylogenyPrediction(){
        
    }
    
    /**
     * Method for when you have the string right now
     * @param in Array of DNA Strings
     */
    public PhylogenyPrediction(String in[]){
        dnaStrings = in;
    }
    
    public void setDNAStrings(String in[]){
        dnaStrings = in;
    }
    
    public String[] getDNAStrings(){
        return dnaStrings;
    }
    
    public void doTheStuffWithTheThings(){
        //Is array empty
        if(dnaStrings == null){
            throw new EmptyStackException();
        }
    }
    
    /**
     * Prints the tree generated
     * @return Formatted output of tree
     */
    public String printTree(){
        String output = "";
        
        
        return output;
    }
}
