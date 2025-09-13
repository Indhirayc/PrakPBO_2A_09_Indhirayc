/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
public class Anggota {
    private String noKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String noKTP, String nama, double limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jumlah + jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(double jumlah) {
        if (jumlah < 0.1 * jumlahPinjaman) {
            System.out.println("Angsuran minimal 10% dari jumlah pinjaman!");
        } else {
            jumlahPinjaman -= jumlah;
            if (jumlahPinjaman < 0) jumlahPinjaman = 0;
        }
    }
}