/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class Peminjaman {
    public String id, namaMember, namaGame;
    public double harga;
    public int lamaSewa;
    
    public double hitungHarga() {
        return lamaSewa * harga;
    }
    
    public void tampilData() {
        System.out.println("Id Member ; " + id);
        System.out.println("Nama Member " + namaMember);
        System.out.println("Nama Game  : " + namaGame);
        System.out.println("Harga : " + harga);
        System.out.println("Lama Sewa : " + lamaSewa);
        System.out.println("Total Harga : " + hitungHarga());
        System.out.println("___________________");
    }
}
