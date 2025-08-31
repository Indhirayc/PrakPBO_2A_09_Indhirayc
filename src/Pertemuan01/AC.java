/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan01;

/**
 *
 * @author WINDOWS 11
 */
public class AC {
    private String merek;
    private int suhu;
    private boolean menyala;
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    
    public void nyalakan() {
        menyala = true;
        System.out.println("AC " + merek + " dinyalakan");
    }
    
    public void matikan() {
        menyala = false;
        System.out.println("AC " + merek + " dimatikan");
    }
    
    public void aturSuhu(int suhuBaru) {
        this.suhu = suhuBaru;
        System.out.println("Suhu : " + suhu + " derajat celcius");
    }
    
    public void cetakStatus() {
        System.out.println("Merek AC : " + merek);
        System.out.println("Suhu : " + suhu);
        System.out.println("Status : " + (menyala ? "Menyala" : "Mati"));
        System.out.println("----------------------");
    }
}
