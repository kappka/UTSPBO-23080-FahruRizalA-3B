/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservasi;

/**
 *
 * @author Teti
 */
public class Hotel {
    private boolean[] kamarKosong = new boolean[10];  // 10 slot kamar

    public Hotel() {
        // Inisialisasi semua kamar kosong
        for (int i = 0; i < kamarKosong.length; i++) {
            kamarKosong[i] = true;  // Semua kamar kosong di awal
        }
    }

    // Menampilkan status ketersediaan kamar
    public void cekKamarKosong() {
        System.out.println("------ Daftar Kamar Kosong ------");
        for (int i = 0; i < kamarKosong.length; i++) {
            String status = kamarKosong[i] ? "Kosong" : "Terisi";
            System.out.println("Kamar " + (i + 1) + ": " + status);
        }
    }

    // Method untuk memesan kamar (menjadikan kamar terisi)
    public boolean pesanKamar(int nomorKamar) {
        if (nomorKamar > 0 && nomorKamar <= kamarKosong.length && kamarKosong[nomorKamar - 1]) {
            kamarKosong[nomorKamar - 1] = false;  // Tandai kamar sebagai terisi
            return true;
        }
        return false;
    }

    // Getter status kamar tertentu
    public boolean isKamarKosong(int nomorKamar) {
        if (nomorKamar > 0 && nomorKamar <= kamarKosong.length) {
            return kamarKosong[nomorKamar - 1];
        }
        return false;
    }
}