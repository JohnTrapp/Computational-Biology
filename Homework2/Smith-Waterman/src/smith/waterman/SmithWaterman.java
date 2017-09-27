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
    private int[][] mat;
    private int score;

    public SmithWaterman() {
        score = 0;
    }

    public SmithWaterman(String sIn, String tIn) {
        s = sIn;
        t = tIn;
        mat = new int[t.length() + 1][s.length() + 1];
        score = 0;
    }

    ////////////////////////////////////////////////////////////////////////////
    //Various get and set methods
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
    //END Various get and set methods
    ////////////////////////////////////////////////////////////////////////////

    //The method that starts it all.
    public void align() {
        fillTable();    //Fill out that table
        printTable();   //Print out that table
        score = traceback();    //donde estas score?
    }

    //Fills out the table using the scoring logic
    private void fillTable() {
        for (int i = 0; i <= t.length(); i++) {
            for (int j = 0; j <= s.length(); j++) {
                if (i == 0 || j == 0) {
                    mat[i][j] = 0;
                } else {
                    if (s.charAt(j - 1) == t.charAt(i - 1)) {
                        mat[i][j] = Math.max(Math.max(mat[i - 1][j] - 1, mat[i][j - 1] - 1), Math.max(mat[i - 1][j - 1] + 2, 0));
                    } else {
                        mat[i][j] = Math.max(Math.max(mat[i - 1][j] - 1, mat[i][j - 1] - 1), Math.max(mat[i - 1][j - 1] - 1, 0));
                    }
                }
            }
        }
    }

    //Follows the path back to get the highest score.
    //Builds the newly aligned strings along the way
    private int traceback() {
        int highi = 0, highj = 0;
        String sTemp = "", tTemp = "";
        for (int i = 0; i <= t.length(); i++) {
            for (int j = 0; j <= s.length(); j++) {
                if (mat[i][j] > mat[highi][highj]) {
                    highi = i;
                    highj = j;
                }
            }
        }
        boolean notZero = true;
        int i = highi;
        int j = highj;
        while (notZero) {
            score += mat[i][j];
            mat[i][j] = -1;
            if (mat[i - 1][j - 1] == 0) {
                tTemp = t.charAt(i - 1) + tTemp;
                sTemp = s.charAt(j - 1) + sTemp;
                notZero = false;
            } else {
                //Diagonal
                if (mat[i - 1][j - 1] == Math.max(Math.max(mat[i][j - 1], mat[i - 1][j]), mat[i - 1][j - 1])) {
                    tTemp = t.charAt(i - 1) + tTemp;
                    sTemp = s.charAt(j - 1) + sTemp;
                    i -= 1;
                    j -= 1;
                } //Up
                else if (mat[i - 1][j] == Math.max(Math.max(mat[i][j - 1], mat[i - 1][j]), mat[i - 1][j - 1])) {
                    tTemp = t.charAt(i - 1) + tTemp;
                    sTemp = "_" + sTemp;
                    i -= 1;
                } //Left
                else {
                    tTemp = "_" + tTemp;
                    sTemp = s.charAt(j - 1) + sTemp;
                    j -= 1;
                }
            }
            //printTable();
            //System.out.println("T: " + tTemp);
            //System.out.println("S: " + sTemp);
        }
        t = tTemp;
        s = sTemp;
        return score;
    }

    private void printTable() {
        for (int i = 0; i <= t.length(); i++) {
            System.out.print("\n");
            for (int j = 0; j <= s.length(); j++) {
                System.out.print(" " + mat[i][j]);
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String output = "";
        output += ("S: " + s + "\n");
        output += ("T: " + t + "\n");
        output += ("Score: " + getScore() + "\n");

        return output;
    }
}
