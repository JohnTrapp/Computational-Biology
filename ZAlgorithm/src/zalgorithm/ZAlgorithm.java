/*
 * Created by John Trapp and Brendan Tracey for
 * Montana State University's class on Computational Biology (CSCI 451)
 * For the fall 2017 semester.
 * As this is a undergrad course, usage elsware is ill-advised.
 */
package zalgorithm;

/**
 *
 * @author Brendan Tracey and John Trapp
 */
public class ZAlgorithm {

    public ZAlgorithm() {
    }
//create a Z array for a pattern and text

    private void getZarr(String str, int z[]) {
        int n = str.length();
        int l = 0, r = 0, k; // set l, k, and r to zero
        for (int i = 1; i < n; ++i) {// loop through the array
            if (i > r) {//use naive method to directly match pattern until a mismatch is found, then adjust r and l
                l = i;
                r = i;
                while (r < n && str.charAt(r - l) == str.charAt(r)) {//cycle through for matches and adjust when a match is found
                    r++;
                }
                z[i] = r - l;//enter the z value of the initial spot in the original string
                r--;
            } else// in the event where a known pattern is already detected we can use previous information to reduce the number of comparisons
            {
                k = (i - l);//k matches an already known pattern so we do not need to update l or r values, only update the z value at that spot

                if (z[k] < r - i + 1) {
                    z[i] = z[k];
                } else {
                    l = i;
                    while (r < n && str.charAt(r - l) == str.charAt(r)) {//cycle through for matches and adjust when a match is found
                        r++;
                    }
                    z[i] = r - l;//enter the z value of the initial spot in the original string
                    r--;
                }
            }
        }
    }

    public String search(String text, String pattern) {
        //create concatenated string
        String combined = pattern + "$" + text;
        int l = combined.length();

        int z[] = new int[l];

        getZarr(combined, z);

        String output = "";
        for (int i = 0; i < l; i++) {
            if (z[i] == pattern.length()) {
                output += "A match was found at " + (i - pattern.length() - 1) + "\n";
            }
        }

        return output;

    }
}
