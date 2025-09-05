/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class Lingkaran {
    public double r;
    
    public double hitungLuas() {
        return Math.PI * r * r;
    }
    
    public double hitungKeliling() {
        return Math.PI * 2 * r;
    }
    
    public void tampilData() {
        System.out.println("Jari - jari : " + r);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}
