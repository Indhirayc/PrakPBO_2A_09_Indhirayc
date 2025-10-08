/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07.Overriding;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();      // Referensi Manusia, objek Dosen
        Manusia m2 = new Mahasiswa();  // Referensi Manusia, objek Mahasiswa

        m1.makan();   // Akan panggil method dari class Dosen
        m2.makan();   // Akan panggil method dari class Mahasiswa

        m1.bernafas();
        m2.bernafas();

        // Cast untuk akses method khusus
        ((Dosen)m1).lembur();
        ((Mahasiswa)m2).tidur();
    }
}