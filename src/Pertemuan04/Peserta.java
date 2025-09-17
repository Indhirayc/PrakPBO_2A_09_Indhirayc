/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
public class Peserta {
    private int idPeserta;
    private String nama;
    private String email;

    public Peserta(int idPeserta, String nama, String email) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.email = email;
    }

    public void ikutiKursus(Kursus kursus) {
        System.out.println(nama + " mengikuti kursus : " + kursus.getNama());
    }

    public void pilihKonten(Kursus kursus, Konten konten, Pembayaran pembayaran) {
        System.out.println(nama + " memilih konten:");
        konten.tampilkan();
        System.out.println("Instruktur : " + kursus.getInstruktur().getNama());
        pembayaran.prosesBayar();
    }
}
