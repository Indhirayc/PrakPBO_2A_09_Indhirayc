/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
public class Perbankan {
    public static void main(String[] args) {
        Tabungan tab1 = new Tabungan("12345", "Tovin", 5000000);
        
        tab1.cekSaldo();
        tab1.simpanUang(200000);
        tab1.ambilUang(1000000);
        tab1.penyesuaianSaldo(0.05);
        tab1.kirimUang(200000);
    }
}
