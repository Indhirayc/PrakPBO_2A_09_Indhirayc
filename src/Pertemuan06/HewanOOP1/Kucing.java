/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP1;

/**
 *
 * @author WINDOWS 11
 */
public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
    
    void mengeong() {
        System.out.println("Meong!");
    }
}
