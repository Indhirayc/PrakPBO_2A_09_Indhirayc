/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP1;

/**
 *
 * @author WINDOWS 11
 */
public class Anjing extends Hewan{
    public Anjing(String nama) {
        super(nama);
    }
        
    @Override
    void bersuara() {
        System.out.println("Guk guk!");
    }
    
    public void menggonggong() {
        System.out.println("Guk guk!");
    }
}
