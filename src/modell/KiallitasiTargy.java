/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.time.LocalDate;

/**
 *
 * @author Laptop
 */
public abstract class KiallitasiTargy {
    private static LocalDate datum;
    private static String keszito;
    private static String cim;
    
    public KiallitasiTargy(LocalDate datum, String keszito, String cim){
        this.datum = datum;
        this.keszito = cim;
        this.cim = cim;
    }

    public static LocalDate getDatum() {
        return datum;
    }

    public static String getKeszito() {
        return keszito;
    }

    public static String getCim() {
        return cim;
    }
}
