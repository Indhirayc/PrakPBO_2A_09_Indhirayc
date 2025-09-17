/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
public class Video extends Konten {
    private int durasi;

    public Video(int idKonten, String isi, String levelKesulitan, int durasi) {
        super(idKonten, "Video", isi, levelKesulitan);
        this.durasi = durasi;
    }

    @Override
    public void tampilkan() {
        System.out.println("Video: " + getIsi() + " (" + durasi + " menit, Level: " + getLevelKesulitan() + ")");
    }
}