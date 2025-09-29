/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identitas.relasiclass.percobaan4;

/**
 *
 * @author WINDOWS 11
 */
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);

        gerbong.setPenumpang(p1, 1);
        System.out.println(gerbong.info());

        Penumpang budi = new Penumpang("67890", "Budi");
        gerbong.setPenumpang(budi, 1); 
        System.out.println(gerbong.info());
    }
}