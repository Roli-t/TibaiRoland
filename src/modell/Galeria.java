/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Laptop
 */
public class Galeria {
    private ArrayList<KiallitasiTargy> targyak;

    public Galeria(){

    }

    
    
 public void feltolt(){
    LocalDate myObj = LocalDate.now();
    
    targyak.add(new KiallitasiTargy(myObj,"Valaki","Valami") {});
    
}
 
 public void kiir(){
     targyak.forEach((targy) -> {
         System.out.println(targy);
        });
 }
}
