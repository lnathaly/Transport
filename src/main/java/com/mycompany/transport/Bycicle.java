/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transport;

import static com.oracle.nio.BufferSecrets.instance;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Bycicle extends Vehicle {
    
    private int engranajes;

    public Bycicle(int engranajes, int modeloVehiculo, String marcaVehiculo) {
        super(modeloVehiculo, marcaVehiculo);
        this.engranajes = engranajes;
    }

    public int getEngranajes() {
        return engranajes;
    }

    public void setEngranajes(int engranajes) {
        this.engranajes = engranajes;
    }

    public Bycicle() {
        super();
        engranajes = 0;
    }

     public void listaBicicletas() {

        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculos = inicio.ingresarVehiculos();
        System.out.println("Lista de bicicletas que se encuentran ingresados son :");

        for (Vehicle listaBicicleta : ListaVehiculos) {
            if (listaBicicleta instanceof Bycicle) {
                Bycicle b;
                b = ((Bycicle) listaBicicleta);
                System.out.println("Marca: " + b.getMarcaVehiculo()+ " Modelo: " + b.getModeloVehiculo()+ " Engranaje: " + b.getEngranajes());

            }
        }

    }
     
     
    @Override
    public void Cantidad() {
        int cantidad= 0;
        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculo = inicio.ingresarVehiculos();

        for (Vehicle listaBicicletas : ListaVehiculo) {
            if (listaBicicletas instanceof Bycicle) {
                Bycicle b;
                b = ((Bycicle) listaBicicletas);
               cantidad = cantidad +1;
            }

        }
       System.out.println("Usted tiene en su lista " + cantidad + " biciletas");

    }  
    
    
    
}
