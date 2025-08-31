/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan01;

/**
 *
 * @author WINDOWS 11
 */
public class JamTangan {
    private String merek, tipe, alarm;
    private boolean menyala;
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    public void setAlarm(String waktu) {
        this.alarm = waktu;
        System.out.println("Alarm disetel pukul : " + waktu);
    }
    
    public void nyalakan() {
        menyala = true;
        System.out.println("Jam tangan " + merek + " dinyalakan");
    }
    
    public void matikan() {
        menyala = false;
        System.out.println("Jam tangan " + merek + " dimatikan");
    }
    
    public void cetakStatus() {
        System.out.println("Jam tangan : " + merek);
        System.out.println("Tipe :" + tipe);
        System.out.println("Status : " + (menyala ? "Menyala" : "Mati"));
        System.out.println("Alarm : " + alarm);
        System.out.println("----------------------");
    }
}
