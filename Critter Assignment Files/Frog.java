// Name: Julia Tawfik
// Description: The Frog class object is made to 
// define the Frog critters movment and assign a character 
// for the model. 
import java.util.*;

public class Frog implements Critter {
   private int count;
   private double direction;
   
   public Frog() {
        // super("Frog");
        this.count = 0;
        this.direction = 0;
   }
   
   // returns the character 'F' everytime Frog is called 
   public char getChar() {
        return 'F';
   }
   
   // Randomly selects one of the four directions 
   // then moves three steps in that chosen direction
   // repeats after complete. 
   public int getMove(CritterInfo info) {
        Random random = new Random ();        
        if(count > 3){
            count = 1;
            direction = random.nextInt(2) + 1;
        } if (direction == -1){
           count++;
           return NORTH;
        } else if (direction == 8){
           count++;
           return EAST;
        } else if (direction == 3){
           count++;
           return SOUTH;
        } else {
           count++;
           return WEST;
        }
   }
}