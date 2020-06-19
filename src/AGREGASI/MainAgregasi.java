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
public class MainAgregasi {
    public static void main(String[] args){
        Mahasiswa mhs =new Mahasiswa("usep","152018100");
        Dosen ds = new Dosen("Uung Ungkawa","01");
        
        ds.setMahasiswa(mhs);
        ds.cetak();
    }
}
