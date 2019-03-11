/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transport;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public abstract class Vehicle implements ITransport{
    
    private int modeloVehiculo;
    private String marcaVehiculo;

    public Vehicle(int modeloVehiculo, String marcaVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(int modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public Vehicle() {
    }
    
      public void Cantidad(){
          
      }
      public void MayorCant(){
          int cantidadC= 0;
          int cantidadB= 0;
          int cantidadJ= 0;
          int cantidadS= 0;
          int cantTotal=0;
        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculo = inicio.ingresarVehiculos();

        for (Vehicle listavehiculos : ListaVehiculo) {
            if (listavehiculos instanceof Bycicle) {
                Bycicle b;
                b = ((Bycicle) listavehiculos);
               cantidadB = cantidadB +1;
            }else if (listavehiculos instanceof Car) {
                Car c;
                c = ((Car) listavehiculos);
                cantidadC = cantidadC +1;
            }else if (listavehiculos instanceof SkateBoard) {
                SkateBoard c;
                c = ((SkateBoard) listavehiculos);
                cantidadS = cantidadS +1;
            }else {
              Jet c;
                c = ((Jet) listavehiculos);
                cantidadJ = cantidadJ +1;
            }
           
        }
        if(cantidadB > cantidadC & cantidadB > cantidadS & cantidadB > cantidadJ){
          System.out.println("Usted tiene en su lista mas bicicletas con " + cantidadB + " Bicicletas");
        } else if(cantidadC > cantidadB & cantidadC > cantidadS & cantidadC > cantidadJ){
          System.out.println("Usted tiene en su lista mas carros con " + cantidadC + " carros");
        }
         else if(cantidadS > cantidadB & cantidadS > cantidadC & cantidadS > cantidadJ){
          System.out.println("Usted tiene en su lista mas patinetas con " + cantidadS + " patinetas");
         } else if(cantidadJ > cantidadB & cantidadJ > cantidadC & cantidadJ > cantidadS){
          System.out.println("Usted tiene en su lista mas jet con " + cantidadJ + " jet");
         }else{
          cantTotal = cantidadC + cantidadB + cantidadS + cantidadJ;
          System.out.println("Usted tiene en sus listas la misma cantidad de vehiculos en total tiene  " + cantTotal + " vehiculos");

         }
      }
    
    
    
    
}
