/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pj1 = new Peminjaman();
        Peminjaman pj2 = new Peminjaman();

        
        pj1.id = "001";
        pj1.namaMember = "Tovin";
        pj1.namaGame = "Need For Speed";
        pj1.lamaSewa = 2;
        pj1.harga = 6000;
        pj1.tampilData();

        
        pj2.id = "002";
        pj2.namaMember = "Indhira";
        pj2.namaGame = "Untitled Goose Game ";
        pj2.lamaSewa = 3;
        pj2.harga = 5000;
        pj2.tampilData();
    }
}
