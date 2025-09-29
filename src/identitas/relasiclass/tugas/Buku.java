/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identitas.relasiclass.tugas;

/**
 *
 * @author WINDOWS 11
 */
public class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public String info() {
        String info = "";
        info += "Judul: " + judul + "\n";
        info += "Penulis: " + penulis + "\n";
        info += "Harga: Rp " + harga + "\n";
        return info;
    }
}
