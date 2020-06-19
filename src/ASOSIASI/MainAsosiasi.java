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
public class MainAsosiasi {
    
   public static void main(String[] args){
       
       Manusia mns=new Manusia("Rully",20);//konstraktor
       Kucing kcg=new Kucing();// ketika kurungnya kosong maka lanjut ke bawah
       
       kcg.setJenis("Persia");
       kcg.setWarna("Kuning");//gunakan geter&seter
       
       mns.cetak();
       kcg.cetak();
   } 
}
