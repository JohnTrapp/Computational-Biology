/*
 * Created by Samuel Shissler, John Trapp, and Brendan Tracey for
 * Montana State University's class on Computational Biology (CSCI 451)
 * For the fall 2017 semester.
 * As this is a undergrad course, usage elsware is ill-advised.
 */
package smith.waterman;

/**
 *
 * @author John Trapp, Brendan Tracey, and Samuel Shissler
 */
public class SmithWaterman {

    private String s, t;
    private int score;

    public SmithWaterman() {

    }

    public SmithWaterman(String sIn, String tIn) {
        s = sIn;
        t = tIn;
    }

    public String getS() {
        return s;
    }

    public String getT() {
        return t;
    }

    public void setS(String sIn) {
        s = sIn;
    }

    public void setT(String tIn) {
        t = tIn;
    }

    public int getScore() {
        return score;
    }

    private void setScore(int scoreIn) {
        score = scoreIn;
    }

    public void sort() {
        //Start the sort
    }

    ////////////////////////////////////////////////////////////////////////////
    //The actual sort methods
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        String output = "";
        //Add alignment
        output += getScore();

        return output;
    }
}
