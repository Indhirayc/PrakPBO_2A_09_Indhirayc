/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hp1 = new Handphone();
        
        hp1.setStatus(1);
        hp1.setStatusPanggilan(1);
        hp1.setStatusSMS(2);
        hp1.tampilSemuaStatus();
    }
}
