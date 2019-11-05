/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.dp.factory;

import lombok.Data;

/**
 *
 * @author bits
 */

@Data
public class Anjing implements Hewan{
    
    private String nama;
    private String makan;
    private String habitat;

    @Override
    public void info() {
       System.out.println("Nama "+getNama());
        System.out.println("Makan "+getMakan());
        System.out.println("habitat "+getHabitat());
    }

    
    
}
