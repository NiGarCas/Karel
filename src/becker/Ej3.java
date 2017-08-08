package becker;

import becker.robots.*;

public class Ej3
{
   public static void girarDerecha(Robot karel){
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
   }
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      for (int y = 1; y < 7; y = y + 1){
          for (int x = 1; x < 6; x = x + 1){
              new Thing(prague, y, x);
          }       
      }
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,50);
    
      // Direct the robot to the final situation
      for (int i = 5; i > 0; i = i - 1){
          int j;
          for (int z = 2; z > 0; z = z - 1){
              j = i;
          while (j > 0){
                    karel.move();
                    karel.pickThing();
                    j = j - 1;
                }
          
          girarDerecha(karel);
          }
          
      }
      karel.turnLeft();
      System.out.println(karel.countThingsInBackpack());
   }
}
