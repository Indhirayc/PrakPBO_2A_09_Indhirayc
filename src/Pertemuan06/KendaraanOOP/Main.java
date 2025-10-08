/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.KendaraanOOP;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing subclass
        Mobil mobil = new Mobil("Toyota", 2022, 4);
        Motor motor = new Motor("Honda", 2023, 150);
        Truk truk = new Truk("Hino", 2020, 5000);

        System.out.println("=== Informasi Mobil ===");
        mobil.info();
        mobil.jalankan();

        System.out.println("\n=== Informasi Motor ===");
        motor.info();
        motor.jalankan();

        System.out.println("\n=== Informasi Truk ===");
        truk.info();
        truk.jalankan();
    }
}