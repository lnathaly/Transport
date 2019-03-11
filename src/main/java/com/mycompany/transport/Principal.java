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
public class Principal {
    public static void main(String[] args) {
     
       
      Bycicle bicicleta= new Bycicle();
      bicicleta.listaBicicletas();
      bicicleta.Cantidad();
           
      
      Car carro = new Car();
      carro.listaCarros();
      carro.Cantidad();
      
      Jet jet = new Jet();
      jet.imprimirListaJet();
      jet.Cantidad();
      
      SkateBoard patineta = new SkateBoard();
      patineta.listaSkateBoard();
      patineta.Cantidad();
      
      Vehicle vehiculos = new Vehicle() {};
      vehiculos.MayorCant();
     
  

    }
    
}
