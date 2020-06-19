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
public class MainKomposisi {
    public static void main(String[] args){
        Dosen ds = new Dosen("Pak uung", "01", new Mahasiswa("Rully","152018077")
                ,new Mata_Kuliah("OOP","IFA-111"));
        ds.cetak();
    }
}