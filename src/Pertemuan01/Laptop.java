/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan01;

/**
 *
 * @author WINDOWS 11
 */
public class Laptop {
    private String merek;
    private int ram, storage;
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public void setStorage(int storage) {
        this.storage = storage;
    }
    
    public void nyalakan() {
        System.out.println(merek + " dinyalakan");
    }
    
    public void matikan() {
        System.out.println(merek + " dimatikan");
    }
    
    public void cetakStatus() {
        System.out.println("Laptop : " + merek);
        System.out.println("RAM :" + ram + "GB");
        System.out.println("Storage" + storage);
        System.out.println("----------------------");
    }
}
