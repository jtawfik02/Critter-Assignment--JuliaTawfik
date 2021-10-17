// Name: Julia Tawfik
// Description: The Turtle class object is made to 
// define the Turtle critters movment and assign a character 
// for the model. 
import java.util.*;

public class Turtle implements Critter {

   private int count;
   private int steps;
   private int lastMove;
      
   public Turtle() {
      this.count = 1;
      this.steps = 1;
      this.lastMove = 1;
   }

   // returns the character 'T' everytime Turtle is called on. 
   public char getChar() {
      return 'T';
   }
   
   // Should move in a clockwise
   // each direction stay for 5 steps and then move
   // South 5, west 5, north 5, east 5, repeat
   public int getMove(CritterInfo info) {
     int move = Critter.CENTER;
     if(count > 5){
         count = 1;
         steps++;
         if(steps > 4){
            steps = 1;
         }
      } else if (count <= 5) {
         if (steps == 1){
            move = Critter.NORTH;
            lastMove = 1;
         } if (steps == 2) {
            move = Critter.EAST;
            lastMove = 2;      
         } if (steps == 3) {
            move = Critter.SOUTH;
            lastMove = 3;
         } if (steps == 4) {
            move = Critter.WEST;
            lastMove = 4;
         }
      }
      count++;
      return move;
   }

}