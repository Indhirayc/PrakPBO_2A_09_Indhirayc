/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP2;

/**
 *
 * @author WINDOWS 11
 */
public class Kucing extends Hewan{
    String ras;
    
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
        System.out.println("Konstruktor Kucing dipanggil");
    }
    
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Ras  : " + ras);
    }
}
