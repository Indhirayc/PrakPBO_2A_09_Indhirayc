/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class Tabungan {
    private String norek;
    private String namaPemilik;
    private double saldo;
    
    public Tabungan(String norek, String namaPemilik, double saldo) {
        this.norek = norek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    public String getNorek() {
        return norek;
    }
    
    public String getNamaPemilik() {
        return namaPemilik;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setNamaPemilik(String namaPemilik){
        this.namaPemilik = namaPemilik;
    }
    
    public void cekSaldo() {
        System.out.println("Saldo tabungan Anda sejumlah : Rp." + saldo);
        System.out.println("-------------------");
    }
    
    public void simpanUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Anda menyimpan uang : Rp." + jumlah);
        System.out.println("Saldo tabungan Anda sejumlah: Rp." + saldo);
        System.out.println("-------------------");
    }
    
    public void ambiluang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Anda menggambil uang sejumlah : Rp." + jumlah);
            
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
        System.out.println("Saldo tabungan Anda sejumlah : Rp. " + saldo  );
        System.out.println("-------------------");
    }
}
