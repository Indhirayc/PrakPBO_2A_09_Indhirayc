/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan01;

/**
 *
 * @author WINDOWS 11
 */
public class Sepeda {
 private String merek;
    private int kecepatan;
    private int gear;
    
    public void setMerek(String newValue) {
        merek = newValue;
    }
    
    public void gantiGear(int newValue) {
        gear = newValue;
    }
    
    public void tambahKecepatan(int increment) {
        kecepatan += increment;
    }
    
    public void rem (int decrement) {
        kecepatan -= decrement;
    }
    
    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Kecepatan :" + kecepatan);
        System.out.println("Gear : " + gear);
    }
}

