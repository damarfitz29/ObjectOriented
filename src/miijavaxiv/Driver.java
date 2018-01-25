/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;
/**
 *
 * @author WINDOWS 10
 */
public class Driver {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
            karyawan.setId("K001");
            karyawan.setNama("Damar");
            karyawan.setAlamat("Klaten");
            //pangkat
            System.out.println(Math.pow(2, 64));
            
            System.out.println(40+Math.random()*60);
            int hari = 21;
            hari = karyawan.mengajukancuti(hari);
            System.out.println(hari);
            karyawan.mengajukancuti(karyawan);
            System.out.println(karyawan.getId());
            Karyawan k1 = new Karyawan();
                k1.setNama("Alex");
            Karyawan k2 = k1;
                k2.setNama("Joker");
            System.out.println(k1.getNama());
            
            k1.jumlah = 50;
            Karyawan k3 = new Karyawan();
            System.out.println(k3.jumlah);
            Karyawan.jumlah = 100;
            System.out.println(k1.jumlah);
            
            
    }
}
