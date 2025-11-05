/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10.Tugas;

/**
 *
 * @author WINDOWS 11
 */
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double percent = 0.0;
        if (level == 1) percent = 0.3;
        else if (level == 2) percent = 0.4;
        else if (level == 3) percent = 0.5;
        health += (int)(health * percent);
    }

    @Override
    public void destroyed() {
        double healthDefault = (double)health;
        health -= (healthDefault * 0.01);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\nHealth = " + health + "\nLevel = " + level;
    }
}