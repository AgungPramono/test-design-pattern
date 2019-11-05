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
public class HewanFactoryDemo {
    
    public static void main(String[] args) {
        Hewan hewanAnjing = HewanFactory.getHewan("anjing");
        hewanAnjing.info();
        System.out.println("\n");
        
        Hewan hewanGajah = HewanFactory.getHewan("gajah");
        hewanGajah.info();
        
        System.out.println("\n");
        Hewan hewanIkan = HewanFactory.getHewan("ikan");
        hewanIkan.info();
    }
}
