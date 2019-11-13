/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.dp.bp;

import lombok.Data;
import lombok.Getter;

/**
 *
 * @author bits
 */
public class HouseBuilderDemo {

    public static void main(String[] args) {
        House house1 = HouseDirectorBuilder.getHouseType(HouseDirectorBuilder.SEDERHANA);
        house1.info();

        House house2 = HouseDirectorBuilder.getHouseType(HouseDirectorBuilder.BIASA);
        house2.info();

        House house3 = HouseDirectorBuilder.getHouseType(HouseDirectorBuilder.MEWAH);
        house3.info();
    }
}

@Data
class House {

    private Integer kamar;
    private Integer lantai;
    private Boolean kolamRenang = false;
    private Boolean halaman = false;
    private HouseDirector houseDirector;

    public House(HouseDirector houseDirector) {
        this.lantai = houseDirector.getLantai();
        this.kamar = houseDirector.getKamar();
        this.kolamRenang = houseDirector.getKolamRenang();
        this.halaman = houseDirector.getHalaman();
    }

    public void info() {
        System.out.println("========================================");
        System.out.println("Jumlah Kamar " + kamar);
        System.out.println("Jumlah Lantai  " + lantai);
        if (halaman) {
            System.out.println("Ada Halaman " + "ADA");
        } else {
            System.out.println("Ada Halaman " + "TIDAK");
        }

        if (kolamRenang) {
            System.out.println("Ada Kolam Renang " + "ADA");
        } else {
            System.out.println("Ada Kolam Renang " + "TIDAK");
        }
        System.out.println("========================================");
    }

}

@Getter
class HouseDirector {

    private Integer lantai = 1;
    private Integer kamar;
    private Boolean kolamRenang = false;
    private Boolean halaman = false;

    public HouseDirector(Integer kamar, Integer lantai) {
        this.kamar = kamar;
        this.lantai = lantai;
    }

    public HouseDirector kolamRenang(Boolean kolamRenang) {
        this.kolamRenang = kolamRenang;
        return this;
    }

    public HouseDirector halaman(Boolean halaman) {
        this.halaman = halaman;
        return this;
    }

    public House build() {
        return new House(this);
    }

}

class HouseDirectorBuilder {

    static String SEDERHANA = "SEDERHANA", BIASA = "BIASA", MEWAH = "MEWAH";

    public static House getHouseType(String type) {
        switch (type) {
            case "SEDERHANA":
                return new HouseDirector(1, 1).build();
            case "BIASA":
                return new HouseDirector(20, 20).halaman(Boolean.TRUE).build();
            case "MEWAH":
                return new HouseDirector(20, 20).halaman(Boolean.TRUE).kolamRenang(Boolean.TRUE).build();
            default:
                return new HouseDirector(1, 1).build();
        }
    }

}
