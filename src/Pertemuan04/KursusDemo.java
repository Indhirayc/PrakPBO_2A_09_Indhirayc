/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
public class KursusDemo {
    public static void main(String[] args) {
        // Instruktur
        Instruktur instruktur1 = new Instruktur(1, "Andi", "Pemrograman");

        // Kursus
        Kursus kursus1 = new Kursus(1, "Java Dasar", "Belajar dasar-dasar Java", instruktur1);

        // Konten
        Konten video1 = new Video(101, "Intro Java", "Mudah", 15);
        Konten artikel1 = new Artikel(102, "Sejarah Java", "Sedang", "Andi");
        Konten kuis1 = new Kuis(103, "Tes Pemahaman Bab 1", "Sulit", 5);

        kursus1.tambahKonten(video1);
        kursus1.tambahKonten(artikel1);
        kursus1.tambahKonten(kuis1);

        // Peserta
        Peserta peserta1 = new Peserta(1, "Budi", "budi@email.com");

        // Pembayaran
        Pembayaran bayar1 = new Pembayaran(201, 50000, "17-09-2025");

        // Flow
        peserta1.ikutiKursus(kursus1);
        peserta1.pilihKonten(kursus1, video1, bayar1);
    }
}
