/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan02;

/**
 *
 * @author WINDOWS 11
 */
public class Handphone {
    private boolean statusAktif;
    private String statuspanggilan;
    private String statusSMS;
    
    public Handphone() {
        statusAktif = false;
        statuspanggilan = "Menunggu";
        statusSMS = "Menunggu";
    }
    
    public void setStatus(int status) {
        if (status == 0) {
            statusAktif = false;
        } else if (status == 1) {
            statusAktif = true;
        }
    }
    
    public void setStatusPanggilan(int status) {
        switch (status) {
            case 0 -> statuspanggilan = "Menunggu";
            case 1 -> statuspanggilan = "Menerima Panggilan";
            case 2 -> statuspanggilan = "Melakukan Panggilan";
            default -> 
                throw new AssertionError();
        }
    }
    
    public void setStatusSMS(int status) {
        switch (status) {
            case 0 -> statusSMS = "Menunggu";
            case 1 -> statusSMS = "Menerima SMS";
            case 2 -> statusSMS = "Mengirim SMS";
            default ->
                throw new AssertionError();
        }
    }
    
    public void tampilSemuaStatus() {
        System.out.println("Status Aktif : " + (statusAktif ? "On" : "Off"));
        System.out.println("Status Panggilan: " + statuspanggilan);
        System.out.println("Status SMS : " + statusSMS);
    }
}
