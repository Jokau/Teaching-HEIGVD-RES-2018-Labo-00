/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 * @author Jokau
 */
public class Trumpet implements IInstrument {
   private int soundVolume = 100;  
      
   public Trumpet() {}
           
   @Override
   public String play() {
      return "pouet";
   }

   @Override
   public int getSoundVolume() {
      return soundVolume;
   }

   @Override
   public String getColor() {
      return "golden";
   }
   
}
