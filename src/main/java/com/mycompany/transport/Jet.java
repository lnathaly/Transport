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
public class Jet extends PoweredVehicle{
    
    private int cantMotores;

    public Jet(int cantMotores, String combustible, int modeloVehiculo, String marcaVehiculo) {
        super(combustible, modeloVehiculo, marcaVehiculo);
        this.cantMotores = cantMotores;
    }

    public int getCantMotores() {
        return cantMotores;
    }

    public void setCantMotores(int cantMotores) {
        this.cantMotores = cantMotores;
    }

    public Jet() {
    }

        
    public void imprimirListaJet() {

        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculos = inicio.ingresarVehiculos();
        System.out.println("Lista de Jet que se encuentran ingresados son :");
        for (Vehicle listaJet : ListaVehiculos) {
            if (listaJet instanceof Jet) {
                Jet j;
                j = ((Jet) listaJet);
                System.out.println("Marca: "+j.getMarcaVehiculo()+" Modelo: "+j.getModeloVehiculo()+ " Motores: " + j.getCantMotores());

            }
        }

    }


    @Override
    public void Cantidad() {
        int cantidad =0;
        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculo = inicio.ingresarVehiculos();

        for (Vehicle listaJet : ListaVehiculo) {
            if (listaJet instanceof Jet) {
                Jet j;
                j = ((Jet) listaJet);
                cantidad = cantidad +1;
            }

        }   
         System.out.println("Usted tiene en su lista " + cantidad + " Jet");

    }
    
    
    
    
}
