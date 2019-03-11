/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transport;

/**
 *
 * @author Laura
 */
public abstract class PoweredVehicle extends Vehicle{

    private String combustible;

    public PoweredVehicle(String combustible, int modeloVehiculo, String marcaVehiculo) {
        super(modeloVehiculo, marcaVehiculo);
        this.combustible = combustible;
    } 

    public PoweredVehicle() {
    }

    
    
}
