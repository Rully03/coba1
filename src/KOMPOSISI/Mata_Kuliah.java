/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KOMPOSISI;

/**
 *
 * @author Rully
 */
public class Mata_Kuliah {
    private String nama;
    private String kode;
    

    public Mata_Kuliah(){

}
    public Mata_Kuliah(String nama, String kode){ //langsung set nama objek
        this.nama=nama;
        this.kode=kode;
    }
    
    public String getNama(){ //ambil data dari objek 
        return nama;
    }
    
    public void setNama(String nama){ //set nama objek
        this.nama=nama;
    }
    
    public String getKode(){
        return kode;
    }
    
    public void setKode(String kode){
        this.kode=kode;
    }
    
    public String cetak(){ //buat cetak nama dan kode
        return ("Nama : "+this.nama+"\n"+"Umur : "+this.kode);
    }
}