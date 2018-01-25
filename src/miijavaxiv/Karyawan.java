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
public class Karyawan {
    private String id;
    protected String nama;
    public String alamat;
    static int jumlah;
    
    Karyawan(){
        System.out.println("ctor karyawan");
    }
    
    public Karyawan(String id,String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }
    /**
     * method ini untuk mengajukan cuti
     * @param hari jumlah hari yang diajukan
     */
    int mengajukancuti(int hari){
        return hari = 18;
    }
     void mengajukancuti(Karyawan karyawan){
        karyawan.setId("22");
    }
     
    static void mengajukankerja(){
        
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("k001", "alexis", "klaten");
        System.out.println(karyawan1);
        
    }
    
}
