/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.UTS_SIRAMPASIEN09;

/**
 *
 * @author WINDOWS 11
 */
public class Orang09 {
    private String nama09;
    private boolean jenisKelamin09; // true = laki-laki, false = perempuan
    private String alamat09;
    private String noTelp09;

    public Orang09(String nama09, boolean jenisKelamin09, String alamat09, String noTelp09) {
        this.nama09 = nama09;
        this.jenisKelamin09 = jenisKelamin09;
        this.alamat09 = alamat09;
        this.noTelp09 = noTelp09;
    }

    // Overloading constructor
    public Orang09(String nama09) {
        this(nama09, true, "Belum diisi", "Belum diisi");
    }

    // Getter & Setter
    public String getNama09() { return nama09; }
    public void setNama09(String nama09) { this.nama09 = nama09; }

    public boolean isJenisKelamin09() { return jenisKelamin09; }
    public void setJenisKelamin09(boolean jenisKelamin09) { this.jenisKelamin09 = jenisKelamin09; }

    public String getAlamat09() { return alamat09; }
    public void setAlamat09(String alamat09) { this.alamat09 = alamat09; }

    public String getNoTelp09() { return noTelp09; }
    public void setNoTelp09(String noTelp09) { this.noTelp09 = noTelp09; }

    @Override
    public String toString() {
        return "Nama: " + nama09 + 
               "\nJenis Kelamin: " + (jenisKelamin09 ? "Laki-laki" : "Perempuan") +
               "\nAlamat: " + alamat09 + 
               "\nNo.Telp: " + noTelp09;
    }
}