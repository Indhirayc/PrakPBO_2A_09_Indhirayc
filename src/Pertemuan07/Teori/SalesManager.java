/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07.Teori;

/**
 *
 * @author WINDOWS 11
 */
public class SalesManager extends Manajer {
    private String departemen;

    public SalesManager(String nama, String departemen, int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    // Override method naikkanGaji()
    public void naikkanGaji() {
        gaji += 1000000;
    }

    // Override method cetakStatus()
    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }
}
