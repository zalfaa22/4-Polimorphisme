/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Fafa
 */
public class AeroPlan extends Vehicle {
    
    @Override
    public void walk(){
        System.out.println("Aeroplan Flying");
    }
    public void fuel(){
        System.out.println("Fuels");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
        
    }
}

