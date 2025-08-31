/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan01;

/**
 *
 * @author WINDOWS 11
 */
public class LaptopGaming extends Laptop{
    private String gpu;
    private boolean rgbKeyboard;
    
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    
    public void setRgbKeyboard(boolean rgbKeyboard) {
        this.rgbKeyboard = rgbKeyboard;
    }
    
    public void performaMode(String mode){
        System.out.println("Performa Mode : " + mode);
    }
    public void overclock(int persen) {
        System.out.println("GPU dioverclock sebesar : " + persen + "%");
    }
    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("GPU :" + gpu);
        System.out.println("Keyboard RGB :" + (rgbKeyboard ? "Aktif" : "Tidak") );
        System.out.println("----------------------");
    }
}
