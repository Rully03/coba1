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
public class Mahasiswa {
  private String nama; 
  private String nrp;
    

    public Mahasiswa(){

}
    public Mahasiswa(String nama, String nrp){ //langsung set nama objek
        this.nama=nama;
        this.nrp=nrp;
    }
    
    public String getNama(){ //ambil data dari objek 
        return nama;
    }
    
    public void setNama(String nama){ //set nama objek
        this.nama=nama;
    }
    
    public String getNrp(){
        return nrp;
    }
    
    public void setNrp(String nrp){
        this.nrp=nrp;
    }
    
    public String cetak(){ //buat cetak si nama
        return ("Nama : "+this.nama+"\n"+"Umur : "+this.nrp);
    }
}