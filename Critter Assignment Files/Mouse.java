// Name: Julia Tawfik
// Description: The Mouse class object is made to 
// define the Mouse critters movment and assign a character 
// for the model. 
import java.util.*;

public class Mouse implements Critter {

   private int count;
   
   public Mouse() {
      this.count = 0;
   }
   
   // returns the character 'M' everytime Mouse is called on. 
   public char getChar() {
      return 'M';
   }
   
   // Moves the critter in a zigzag motion 
   // West 1, north 1, repeat (zig zag to the NW)
   // Returns direction. 
   public int getMove(CritterInfo info) {
       if (this.count == 0) {
         this.count = 1;
         return WEST;
       }
       if (this.count == 1) {
         this.count = 0;
         return NORTH;
       }
       return 0;
   }


}