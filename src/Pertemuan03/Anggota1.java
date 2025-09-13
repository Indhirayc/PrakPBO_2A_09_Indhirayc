/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
public class Anggota1 {
    private String nama, alamat;
    private float simpanan;

    public Anggota1(String nama, String alamat, float simpanan) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = simpanan;
    }
    
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public float getSimpanan() {
        return simpanan;
    }
    
    public void setor(float uang) {
        simpanan += uang;
    }
    
    public void pinjam(float uang) {
        simpanan -= uang;
    }
}
