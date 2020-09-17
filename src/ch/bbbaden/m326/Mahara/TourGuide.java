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
public class TourGuide {
    private HotelProgram zoo;
    private HotelProgram desert;
    private HotelProgram la;
    
    public TourGuide(){
        zoo = new Zoo();
        desert = new Desert();
        la = new LA();
    }
    
    public void infoZoo(){
        zoo.distance();
        zoo.priceInUSD();
    }
    
    public void infoDesert(){
        desert.distance();
        desert.priceInUSD();
    }
    
    public void infoLA(){
        la.distance();
        la.priceInUSD();
    }
}
