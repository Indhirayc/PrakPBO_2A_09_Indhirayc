/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
public class Tabungan {
    private String norek, namaPemilikString;
    private double saldo;
    
    public Tabungan(String nore, String namaPemilik, double  saldo) {
        this.norek = norek;
        this.namaPemilikString = namaPemilik;
        this.saldo = saldo;
    }
    
    private double hitungBunga(double bunga) {
        return saldo * bunga;
    }
    
    private double biayaTransfer(double jumlah) {
        return jumlah * 0.005;
    }
    
    public void cekSaldo() {
        System.out.println("Saldo tabungan Anda Rp. " + saldo);
        System.out.println("---------------------------------");
    }
    
    public void simpanUang(double jumlah) {
        System.out.println("Saldo bertambah Rp. " + saldo);
        saldo -= jumlah;
        System.out.println("Saldo akhir Rp. " + saldo);
        System.out.println("---------------------------------");

    }
    
    public void ambilUang(double jumlah) {
        System.out.println("Saldo berkurang Rp. " + jumlah);
        saldo -= jumlah;
        System.out.println("Saldo akhir Rp. " + saldo);
        System.out.println("---------------------------------");

    }
    
    public void penyesuaianSaldo(double bunga) {
        System.out.println("Saldo awal Rp. " + saldo);
        double tambahan = hitungBunga(bunga);
        System.out.println("Saldo bertambah Rp. " + tambahan);
        saldo += tambahan;
        System.out.println("Saldo akhir Rp. " + saldo);
        System.out.println("---------------------------------");

    }
    
    public void kirimUang(double jumlah) {
        System.out.println("Saldo awal Rp. " + saldo);
        double biaya = biayaTransfer(jumlah);
        System.out.println("Jumlah transfer Rp. " + jumlah);
        System.out.println("Biaya transfer Rp. " + biaya);
        saldo -= (jumlah + biaya);
        System.out.println("Saldo akhir Rp. " + saldo);
        System.out.println("---------------------------------");

    }
}
