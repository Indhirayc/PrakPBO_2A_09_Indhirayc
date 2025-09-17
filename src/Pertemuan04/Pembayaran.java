/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
public class Pembayaran {
    private int idPembayaran;
    private double jumlah;
    private String tanggal;

    public Pembayaran(int idPembayaran, double jumlah, String tanggal) {
        this.idPembayaran = idPembayaran;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    public void prosesBayar() {
        System.out.println("Pembayaran pada tanggal " + tanggal + " sebesar Rp." + jumlah);
    }
}
