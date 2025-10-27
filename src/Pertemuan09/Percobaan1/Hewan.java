/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan09.Percobaan1;

/**
 *
 * @author WINDOWS 11
 */
public abstract class Hewan {
    private int umur;
    protected Hewan() {
        this.umur = 0;
    }
    
    public void bertambahUmur() {
        this.umur += 1;
        System.out.println("Umur hewan sekarang: " + umur);
    }
    
    public abstract void bergerak();
}
