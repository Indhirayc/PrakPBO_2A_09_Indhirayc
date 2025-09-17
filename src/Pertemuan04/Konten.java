/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan04;

/**
 *
 * @author WINDOWS 11
 */
public class Konten {
    private int idKonten;
    private String jenisKonten;
    private String isi;
    private String levelKesulitan;

    public Konten(int idKonten, String jenisKonten, String isi, String levelKesulitan) {
        this.idKonten = idKonten;
        this.jenisKonten = jenisKonten;
        this.isi = isi;
        this.levelKesulitan = levelKesulitan;
    }

    public int getIdKonten() { 
        return idKonten; 
    }
    
    public String getJenisKonten() { 
        return jenisKonten; 
    }
    
    public String getIsi() { 
        return isi; 
    }
    
    public String getLevelKesulitan() { 
        return levelKesulitan; 
    }

    public void setIsi(String isi) { 
        this.isi = isi; 
    }

    public void tampilkan() {
        System.out.println("Konten: " + jenisKonten + " - " + isi + " (Level " + levelKesulitan + ")");
    }
}
