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
public class Zoo implements HotelProgram{

    @Override
    public void distance() {
        System.out.println("1km");
    }

    @Override
    public void priceInUSD() {
        System.out.println("Adults (12 years+): $58.00\nChildren(4-11): $48.00\nToddler(0-3): $0");
    }
    
}
