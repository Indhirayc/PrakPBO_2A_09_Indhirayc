/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class Bank {
    public static void main(String[] args) {
        Tabungan tb1 = new Tabungan("12345", "Anisa", 100000);
        
        tb1.cekSaldo();
        tb1.simpanUang(700000);
        tb1.ambiluang(200000);
        tb1.ambiluang(700000);
        
        System.out.println("Nama Pemilik : " + tb1.getNamaPemilik());
        System.out.println("Nomor Rekening : " + tb1.getNorek());
        tb1.cekSaldo();
    }
}
