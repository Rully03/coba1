/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AGREGASI;

/**
 *
 * @author Rully
 */
public class Dosen {
  private String nama_ds; 
  private String nip;
  private Mahasiswa mhs;
    

    public Dosen(){

}
    public Dosen(String nama_ds, String nip){ //langsung set nama objek
        this.nama_ds=nama_ds;
        this.nip=nip;
        
    }
    
    public String getNama(){ //ambil data dari objek 
        return nama_ds;
    }
    
    public void setNama(String nama_ds){ //set nama objek
        this.nama_ds=nama_ds;
    }
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip=nip;
    }   
    
    public Mahasiswa getMahasiswa(){
        return mhs;
    }
    
    public void setMahasiswa(Mahasiswa mhs){
        this.mhs=mhs;
    }
    
    public void cetak(){ //buat cetak si nama
        System.out.println("Nama : "+this.nama_ds+"\n"+"nip : "+this.nip+"\n"+"Mahasiswa"+"\n"+this.mhs.cetak());
    }
}
