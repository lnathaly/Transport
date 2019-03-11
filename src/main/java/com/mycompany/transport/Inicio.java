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
public class Inicio {
    
    ArrayList<Vehicle> listaVehiculos =new ArrayList<Vehicle>();
    
    public ArrayList<Vehicle> ingresarVehiculos(){
        
          Bycicle Bicicleta1= new Bycicle(14, 2005, "Gw");
          Bycicle Bicicleta2= new Bycicle(12, 2013, "Scott");
          Bycicle Bicicleta3= new Bycicle(22, 2000, "Lapierre");
          
          SkateBoard skate1 = new SkateBoard(20, 2015, "Powell");
          SkateBoard skate2 = new SkateBoard(19, 2019, "Element");
          SkateBoard skate3 = new SkateBoard(40, 2005, "Blind");
          
          Car carro1= new Car(12,"Gas", 2013, "Ferrari");
          Car carro2 = new Car(20,"Gasolina",2010, "Audi");
          Car carro3 = new Car(10, "Gasolina", 2011, "Porsche");
          
          Jet jet1 = new Jet(4,"Gasolina" ,2010, "Bombardier");
          Jet jet2 = new Jet(3, "Airbus", 2015,"Gasolina");
          Jet jet3 = new Jet(2, "Dassault", 2019,"Gasolina");
          

          
          listaVehiculos.add(Bicicleta1);
          listaVehiculos.add(Bicicleta2);
          listaVehiculos.add(Bicicleta3);
          
          listaVehiculos.add(skate1);
          listaVehiculos.add(skate2);
          listaVehiculos.add(skate3);
          
          listaVehiculos.add(carro1);
          listaVehiculos.add(carro2);
          listaVehiculos.add(carro3);
          
          listaVehiculos.add(jet1);
          listaVehiculos.add(jet2);
          listaVehiculos.add(jet3);

          
          return listaVehiculos;
                
           
}
    
}
