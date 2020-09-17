/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m326.Mahara;

/**
 *
 * @author nicis
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TourGuide guide = new TourGuide();
        
        System.out.println("Information about the trip to the desert:");
        guide.infoDesert();
        
        System.out.println("\n");
        System.out.println("Information about the trip to LA:");
        guide.infoLA();
        
        System.out.println("\n");
        System.out.println("Information about the trip to the Zoo:");
        guide.infoZoo();
        
        int i = 5;
        double d = i;
        System.out.println(d);
        
    }
    
}
