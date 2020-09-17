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
public class Desert implements HotelProgram{

    @Override
    public void distance() {
         System.out.println("50km");
    }

    @Override
    public void priceInUSD() {
         System.out.println("$100 per person");
    }
    
}
