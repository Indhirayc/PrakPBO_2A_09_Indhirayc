/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan01;

/**
 *
 * @author WINDOWS 11
 */
public class BarangDemo {
    public static void main(String[] args) {
        
        Laptop lp1 = new Laptop();
        LaptopGaming lp2 = new LaptopGaming();
        JamTangan jt1 = new JamTangan();
        AC ac1 = new AC();
        
        lp1.setMerek("Asus");
        lp1.setRam(12);
        lp1.setStorage(512);
        lp1.nyalakan();
        lp1.cetakStatus();
        lp1.matikan();
        
        lp2.setMerek("MSI Gaming");
        lp2.setRam(16);
        lp2.setStorage(1024);
        lp2.setGpu("NVDIA RTX 3060");
        lp2.setRgbKeyboard(true);
        lp2.nyalakan();
        lp2.performaMode("Power full");
        lp2.overclock(10);
        lp2.cetakStatus();
        lp2.matikan();
        
        jt1.setMerek("Casio");
        jt1.setTipe("Digital");
        jt1.nyalakan();
        jt1.setAlarm("07:00");
        jt1.cetakStatus();
        jt1.matikan();
        
        ac1.setMerek("Panasonic");
        ac1.setSuhu(19);
        ac1.nyalakan();
        ac1.aturSuhu(16);
        ac1.cetakStatus();
        ac1.matikan();
    }
}
