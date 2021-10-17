// Name: Julia Tawfik
// Description: The Wolf class object is made to 
// define the Wolf critters movment and assign a character 
// for the model. 
import java.util.*;

public class Wolf implements Critter {
   
   private int count;
   private int steps;
   private int lastMove;
         
   public Wolf() {
      this.count = 1;
      this.steps = 1;
      this.lastMove = 1;
   }
   
   // returns the character 'W' everytime Wolf is called on. 
   public char getChar() {
      return 'W';
   }
   
   // should move in a counter clockWise motion 
   // Start at the CENTER 
   // EAST 2, NORTH 2, WEST 2, SOUTH 2, Repeat 
   public int getMove(CritterInfo info) {
     int move = Critter.CENTER;
     if(count > 2){
         count = 1;
         steps++;
         if(steps > 4){
            steps = 1;
         }
      } else if (count <= 2) {
         if (steps == 1){
            move = Critter.WEST;
            lastMove = 1;
         } if (steps == 2) {
            move = Critter.SOUTH;
            lastMove = 2;      
         } if (steps == 3) {
            move = Critter.NORTH;
            lastMove = 3;
         } if (steps == 4) {
            move = Critter.EAST;
            lastMove = 4;
         }
      }
      count++;
      return move;
   }   
}