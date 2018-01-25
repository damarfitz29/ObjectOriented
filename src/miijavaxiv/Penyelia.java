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
public class Penyelia extends Karyawan{
    //constructor
    public Penyelia() {
        System.out.println("ctor Penyelia");
    }
    
    public Penyelia(String id,String nama,String alamat) {
        //super(id,nama,alamat);
        System.out.println("ctor Penyelia");
    }
    
    
    public int methodC(){
        return 0;
    }

    
    @Override
    public String getAlamat() {
        return "Klaten"; //To change body of generated methods, choose Tools | Templates.
    }
    //ovveride untuk menimpa, overload = nama sama tipe beda
    @Override
    public String toString() {
        //string builder = penampung string
        StringBuilder builder = new StringBuilder();
        builder.append("Nama : ");
        builder.append(nama);
        builder.append(", Alamat : ");
        builder.append(alamat);
        
        return builder.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void main(String[] args) {
        Penyelia penyelia = new Penyelia();
        penyelia.setAlamat("Jogja");
        
        
        System.out.println(penyelia.getAlamat());
        
        Penyelia penyelia1 = penyelia;
        penyelia1.setAlamat("Semarang");
        System.out.println(penyelia.hashCode());
        System.out.println(penyelia1.hashCode());
    }
}
