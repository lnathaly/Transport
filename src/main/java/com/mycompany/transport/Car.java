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
public class Car extends PoweredVehicle{
    
 private int tamañoMotor;

    public Car(int tamañoMotor, String combustible, int modeloVehiculo, String marcaVehiculo) {
        super(combustible, modeloVehiculo, marcaVehiculo);
        this.tamañoMotor = tamañoMotor;
    }

 
    public int getTamañoMotor() {
        return tamañoMotor;
    }

    public void setTamañoMotor(int tamañoMotor) {
        this.tamañoMotor = tamañoMotor;
    }

    public Car() {
    }

    

    public void listaCarros() {

        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculos = inicio.ingresarVehiculos();
        System.out.println("Lista de carros que se encuentran ingresados son :");

        for (Vehicle listaCarros : ListaVehiculos) {
            if (listaCarros instanceof Car) {
                Car c;
                c = ((Car) listaCarros);
                System.out.println("Marca: " + c.getMarcaVehiculo()+ " Modelo: " + c.getModeloVehiculo());

            }
        }

    }
 
    @Override
    public void Cantidad() {
        int cantidad=0;
        Inicio inicio = new Inicio();
        ArrayList<Vehicle> ListaVehiculo = inicio.ingresarVehiculos();

        for (Vehicle listaCarros : ListaVehiculo) {
            if (listaCarros instanceof Car) {
                Car c;
                c = ((Car) listaCarros);
                cantidad = cantidad +1;
            }

        }
                System.out.println("Usted tiene en su lista " + cantidad +" carros");

    }
 
 
    
}
