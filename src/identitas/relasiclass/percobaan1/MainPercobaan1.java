/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identitas.relasiclass.percobaan1;

/**
 *
 * @author WINDOWS 11
 */
public class MainPercobaan1 {
    public static void main(String[] args) {
        // Objek Processor
        Processor p = new Processor("Intel i5", 3);

        // Objek Laptop dengan Processor
        Laptop L = new Laptop("Thinkpad", p);
        L.info();

        System.out.println();

        // Cara lain pakai setter
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);

        Laptop L1 = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        L1.info();

    }
}