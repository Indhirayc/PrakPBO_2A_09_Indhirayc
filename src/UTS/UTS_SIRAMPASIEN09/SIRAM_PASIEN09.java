/**
 *
 * @author WINDOWS 11
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.UTS_SIRAMPASIEN09;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author WINDOWS 11
 */
public class SIRAM_PASIEN09 {
    private static List<Dokter09> daftarDokter09 = new ArrayList<>();
    private static List<Pasien09> daftarPasien09 = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n=== MENU PROGRAM SIRAM PASIEN 09 ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Update Data Pasien");
            System.out.println("3. Tampilkan Daftar Pasien");
            System.out.println("4. Tambah Dokter");
            System.out.println("5. Update Data Dokter");
            System.out.println("6. Tampilkan Daftar Dokter");
            System.out.println("7. Tambah Riwayat Pemeriksaan");
            System.out.println("8. Tampilkan Riwayat Pemeriksaan Pasien");
            System.out.println("9. Selesai");
            System.out.print("Pilih Menu Nomor: ");
            pilih = Integer.parseInt(sc.nextLine());
            switch (pilih) {
                case 1 -> tambahPasien();
                case 2 -> updatePasien();
                case 3 -> tampilPasien();
                case 4 -> tambahDokter();
                case 5 -> updateDokter();
                case 6 -> tampilDokter();
                case 7 -> tambahPemeriksaan();
                case 8 -> tampilRekam();
                case 9 -> System.out.println("Program selesai!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 9);
    }

    private static void tambahPasien() {
        try {
            System.out.print("ID Pasien: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            boolean jk = sc.nextLine().equalsIgnoreCase("L");
            System.out.print("Alamat: ");
            String alamat = sc.nextLine();
            System.out.print("No Telp: ");
            String telp = sc.nextLine();
            Pasien09 p = new Pasien09(id, nama, jk, alamat, telp);
            daftarPasien09.add(p);
            System.out.println("Pasien berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
        }
    }

    private static void tampilPasien() {
        System.out.println("\n=== DAFTAR PASIEN ===");
        for (Pasien09 p : daftarPasien09) {
            System.out.println(p);
        }
    }

    private static void updatePasien() {
        System.out.print("Masukkan ID Pasien: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Pasien09 p : daftarPasien09) {
            if (p.getId09() == id) {
                System.out.print("Alamat baru: ");
                p.setAlamat09(sc.nextLine());
                System.out.print("No Telp baru: ");
                p.setNoTelp09(sc.nextLine());
                System.out.println("Data pasien diperbarui!");
                return;
            }
        }
        System.out.println("Pasien tidak ditemukan!");
    }

    private static void tambahDokter() {
        try {
            System.out.print("ID Dokter: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            boolean jk = sc.nextLine().equalsIgnoreCase("L");
            System.out.print("Alamat: ");
            String alamat = sc.nextLine();
            System.out.print("No Telp: ");
            String telp = sc.nextLine();
            System.out.print("Spesialisasi: ");
            String sp = sc.nextLine();
            daftarDokter09.add(new Dokter09(id, nama, jk, alamat, telp, sp));
            System.out.println("Dokter berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
        }
    }

    private static void tampilDokter() {
        System.out.println("\n=== DAFTAR DOKTER ===");
        for (Dokter09 d : daftarDokter09) {
            System.out.println(d);
        }
    }

    private static void updateDokter() {
        System.out.print("Masukkan ID Dokter: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Dokter09 d : daftarDokter09) {
            if (d.getId09() == id) {
                System.out.print("Spesialisasi baru: ");
                d = new Dokter09(id, d.getNama09(), d.isJenisKelamin09(), d.getAlamat09(), d.getNoTelp09(), sc.nextLine());
                System.out.println("Data dokter diperbarui!");
                return;
            }
        }
        System.out.println("Dokter tidak ditemukan!");
    }

    private static void tambahPemeriksaan() {
        try {
            System.out.print("Masukkan ID Pasien: ");
            int idP = Integer.parseInt(sc.nextLine());
            Pasien09 pasien = daftarPasien09.stream().filter(p -> p.getId09() == idP).findFirst().orElse(null);
            if (pasien == null) {
                System.out.println("Pasien tidak ditemukan!");
                return;
            }

            System.out.print("Masukkan ID Dokter: ");
            int idD = Integer.parseInt(sc.nextLine());
            Dokter09 dokter = daftarDokter09.stream().filter(d -> d.getId09() == idD).findFirst().orElse(null);
            if (dokter == null) {
                System.out.println("Dokter tidak ditemukan!");
                return;
            }

            System.out.print("ID Pemeriksaan: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Tanggal (dd/MM/yyyy): ");
            Date tanggal = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
            System.out.print("Keluhan: ");
            String keluhan = sc.nextLine();
            System.out.print("Diagnosa: ");
            String diagnosa = sc.nextLine();
            System.out.print("Tindakan: ");
            String tindakan = sc.nextLine();
            System.out.print("Obat: ");
            String obat = sc.nextLine();

            Pemeriksaan09 periksa = new Pemeriksaan09(id, tanggal, keluhan, diagnosa, tindakan, obat, dokter);
            if (pasien.getRekamMedik09() == null) {
                pasien.setRekamMedik09(new RekamMedik09(idP, pasien));
            }
            pasien.getRekamMedik09().tambahPemeriksaan09(periksa);
            System.out.println("Pemeriksaan berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
        }
    }

    private static void tampilRekam() {
        System.out.print("Masukkan ID Pasien: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Pasien09 p : daftarPasien09) {
            if (p.getId09() == id && p.getRekamMedik09() != null) {
                System.out.println("\n=== REKAM MEDIK PASIEN ===");
                for (Pemeriksaan09 pr : p.getRekamMedik09().getDaftarPemeriksaan09()) {
                    System.out.println(pr);
                }
                return;
            }
        }
        System.out.println("Pasien belum memiliki rekam medik!");
    }
}