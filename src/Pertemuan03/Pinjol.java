/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
public class Pinjol {
    private String idPeminjaman, namaPeminjam;
    private double jumlahPinjaman, bunga, saldoTerhutang;
    
    public Pinjol(String idPeminjaman, String namaPeminjam, double bunga) {
        this.idPeminjaman = idPeminjaman;
        this.namaPeminjam = namaPeminjam;
        this.bunga = bunga;
        this.jumlahPinjaman = 0;
        this.saldoTerhutang = 0;
    }
    private double hitungBungaPinjaman(double jumlah) {
        return jumlah * bunga;
    }
    private double hitungDenda(int hari) {
        return saldoTerhutang * 0.02 * hari;
    }
    public void ajukanPinjaman(double jumlah) {
        double bungaPinjaman = hitungBungaPinjaman(jumlah);
        this.jumlahPinjaman += jumlah;
        this.saldoTerhutang += (jumlah + bungaPinjaman);

        System.out.println("Pinjaman diajukan sebesar Rp. " + jumlah);
        System.out.println("Bunga pinjaman Rp. " + bungaPinjaman);
        System.out.println("Total saldo terhutang saat ini Rp. " + saldoTerhutang);
    }
    public void bayarAngsuran(double jumlah) {
        System.out.println("Membayar angsuran Rp. " + jumlah);
        saldoTerhutang -= jumlah;
        if (saldoTerhutang < 0) saldoTerhutang = 0;
        System.out.println("Sisa saldo terhutang Rp. " + saldoTerhutang);
    }
    public void cekSaldoTerhutang() {
        System.out.println("Total saldo terhutang Rp. " + saldoTerhutang);
    }
    public void penaltiKeterlambatan(int hari) {
        double denda = hitungDenda(hari);
        saldoTerhutang += denda;
        System.out.println("Keterlambatan " + hari + " hari, denda Rp. " + denda);
        System.out.println("Saldo terhutang saat ini Rp. " + saldoTerhutang);
    }
}
