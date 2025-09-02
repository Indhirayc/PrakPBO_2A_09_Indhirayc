/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class Barang {
    public String namaBrg, jenisBrg;
    public int stock;
    
    public void tampilBarang() {
        System.out.println("Nama Barang : " + namaBrg);
        System.out.println("jenis Barang : + " + jenisBrg);
        System.out.println("Stock : " + stock);
    }
    
    public int tambahStock(int brgMasuk) {
        int stockbaru = brgMasuk + stock;
        return stockbaru;
    }
}
