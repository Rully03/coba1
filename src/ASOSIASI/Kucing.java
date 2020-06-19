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
public class Kucing {
  private String jenis;
  private String warna;
    
    
    public Kucing(){
        
} 
    
    public Kucing(String jenis,String warna){
        this.jenis=jenis;
        this.warna=warna;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna){
        this.warna=warna;
    }
    
    public void cetak(){ //buat cetak si nama
        System.out.println("Nama : "+this.jenis+"\n"+"Umur : "+this.warna);
    }
}
