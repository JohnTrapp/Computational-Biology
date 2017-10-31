/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fm.index;

/**
 *
 * @author Brendan
 */
public class FMIndex {

    public FMIndex(){
        
    }
    public static void main(String[] args) {
        FMIndex thing = new FMIndex();
        //thing.run(['a','b','r','a','c','a','d','a','b','r','a']);
    }
    public void run(char[] input){
        int a = 0;
        String[] result = new String[10];
        for (int x = 0; x < 26; x++){ //go through the alphabet in lexigraphic order
            for (int y = 0; y < 20; y++){ //find all the characters 
                if (input[y] == (char)x){
                    for (int z = y; z < 20; z++){
                        result[a] += input[z];
                    }
                    for (int z = 0; z < y; z++){
                        result[a] += input[z];
                    }
                }
            }
        }
    }
    // the string in the final position is the BW transformed string
    
}
