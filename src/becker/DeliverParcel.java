package becker;

import becker.robots.*;

public class DeliverParcel
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
      Wall w1 = new Wall(prague, 1, 1, Direction.NORTH);
      Wall w2 = new Wall(prague, 1, 1, Direction.WEST);
      Wall w3 = new Wall(prague, 1, 2, Direction.NORTH);
      Wall w4 = new Wall(prague, 1, 2, Direction.EAST);
      Wall w5 = new Wall(prague, 2, 1, Direction.SOUTH);
      Wall w6 = new Wall(prague, 2, 1, Direction.WEST);
      Wall w7 = new Wall(prague, 2, 2, Direction.SOUTH);
      Wall w8 = new Wall(prague, 2, 2, Direction.EAST);
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
    
      // Direct the robot to the final situation
      karel.turnLeft();
      karel.turnLeft();
      karel.move();
      for (int i = 0; i < 3; i = i + 1){
          girarDerecha(karel);
          for (int j = 0; j < 3; j = j + 1){
              karel.move();
          }
      }
      girarDerecha(karel);
      karel.move();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      System.out.println(karel.countThingsInBackpack());
   }
}
