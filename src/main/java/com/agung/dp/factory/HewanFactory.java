/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.dp.factory;

/**
 *
 * @author bits
 */
public class HewanFactory {

    public static Hewan getHewan(String jenisHewan) {
        if (jenisHewan.equals("anjing")) {
            Anjing anjing = new Anjing();
            anjing.setMakan("daging");
            anjing.setNama("anjing");
            anjing.setHabitat("darat");
            return anjing;
        } else if (jenisHewan.equals("gajah")) {
            Gajah gajah = new Gajah();
            gajah.setNama("Gajah");
            gajah.setMakan("rumput");
            gajah.setHabitat("darat");
            return gajah;
        } else if (jenisHewan.equals("ikan")) {
            Ikan ikan = new Ikan();
            ikan.setMakan("lumut");
            ikan.setNama("ikan");
            ikan.setHabitat("air");
            return ikan;
        }
        return null;
    }

}
