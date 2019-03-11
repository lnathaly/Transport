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
public class SkateBoard extends Vehicle{
    
    private int LongitudPatineta;

    public SkateBoard(int LongitudPatineta, int modeloVehiculo, String marcaVehiculo) {
        super(modeloVehiculo, marcaVehiculo);
        this.LongitudPatineta = LongitudPatineta;
    }

    public int getLongitudPatineta() {
        return LongitudPatineta;
    }

    public void setLongitudPatineta(int LongitudPatineta) {
        this.LongitudPatineta = LongitudPatineta;
    }

    public SkateBoard() {
    }
    
    

    public void listaSkateBoard() {

        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculos = inicio.ingresarVehiculos();
        System.out.println("Lista de SkateBoard que se encuentran ingresados son :");

        for (Vehicle listaSkateBoard : ListaVehiculos) {
            if (listaSkateBoard instanceof SkateBoard) {
                SkateBoard s;
                s = ((SkateBoard) listaSkateBoard);
                System.out.println("Marca: " + s.getMarcaVehiculo()+ " Modelo: " + s.getModeloVehiculo()+ "Longitud"+s.getLongitudPatineta());

            }
        }

    }

    @Override
    public void Cantidad() {
        int cantidad =0;
        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculo = inicio.ingresarVehiculos();

        for (Vehicle listaPatinetas : ListaVehiculo) {
            if (listaPatinetas instanceof SkateBoard) {
                SkateBoard s;
                s = ((SkateBoard) listaPatinetas);
               cantidad = cantidad +1;
            }

        }
         System.out.println("Usted tiene en su lista " + cantidad +" patinetas");

    }
    
    
    
}
