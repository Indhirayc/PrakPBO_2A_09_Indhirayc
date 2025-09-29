/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identitas.relasiclass.tugas;

/**
 *
 * @author WINDOWS 11
 */
public class Anggota {
    private String id;
    private String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "ID Anggota: " + id + "\n";
        info += "Nama Anggota: " + nama + "\n";
        return info;
    }
}