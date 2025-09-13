/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin() {
        kontakOn = true;
    }
    
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan() {
        int kecepatanTambahan = 25;
        if (kontakOn == true) {
            if (kecepatan + kecepatanTambahan <= 100) {
                kecepatan += kecepatanTambahan;
            } else {
                System.out.println("Motor sudah berada dalam kecepatan maksimal \n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off \n");
        }
    }
    
    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }
    
    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontrak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
