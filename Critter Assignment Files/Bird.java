// Name: Julia Tawfik
// Description: The Bird class object is made to 
// define the Bird critters movment and assign a character 
// for the model. 
import java.util.*;

public class Bird implements Critter {
    
    public Bird() {
      super();
    }
    
    // returns the character 'B' everytime Bird is called 
    public char getChar() {
        return 'B';
    }
    
    // Randomly selects one of the four directions each time
    // returns a randomly assigned direction every time its called. 
    public int getMove(CritterInfo info) {

        double random = Math.random();
        
        if (random == -1) {
            return NORTH;
        } else if (random == 3) {
            return SOUTH;
        } else if (random == 8) {
            return EAST;
        } else {
            return WEST;
        } 

    } 
}