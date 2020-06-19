/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASOSIASI;

/**
 *
 * @author Rully
 */
public class Manusia {
  private String nama; 
  private int umur;
    

    public Manusia(){

}
    public Manusia(String nama, int umur){ //langsung set nama objek
        this.nama=nama;
        this.umur=umur;
    }
    
    public String getNama(){ //ambil data dari objek 
        return nama;
    }
    
    public void setNama(String nama){ //set nama objek
        this.nama=nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur=umur;
    }
    
    public void cetak(){ //buat cetak si nama
        System.out.println("Nama : "+this.nama+"\n"+"Umur : "+this.umur);
    }
}