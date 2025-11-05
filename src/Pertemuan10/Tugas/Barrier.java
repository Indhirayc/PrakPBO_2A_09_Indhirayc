/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10.Tugas;

/**
 *
 * @author WINDOWS 11
 */
public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        double strengthDefault = (double)strength;
        strength -= (strengthDefault * 0.05);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}