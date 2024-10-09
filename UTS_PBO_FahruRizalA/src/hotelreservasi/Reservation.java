/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservasi;

/**
 *
 * @author Fahru
 */
public class Reservation {
    private String namaPemesan;
    private String noHp;
    private int gradeKamar;
    private int tipeKasur;
    private int sarapan;
    private int totalHarga;
    private String tanggalCheckIn;

    // Constructor untuk menerima semua data, tanpa tanggal Check-Out
    public Reservation(String namaPemesan, String noHp, int gradeKamar, int tipeKasur, int sarapan, String tanggalCheckIn) {
        this.namaPemesan = namaPemesan;
        this.noHp = noHp;
        this.gradeKamar = gradeKamar;
        this.tipeKasur = tipeKasur;
        this.sarapan = sarapan;
        this.tanggalCheckIn = tanggalCheckIn;
    }

    // Menghitung total harga berdasarkan pilihan customer
    public void hitungTotal() {
        switch (gradeKamar) {
            case 1: totalHarga += 700000; break;
            case 2: totalHarga += 625000; break;
            case 3: totalHarga += 500000; break;
        }

        switch (tipeKasur) {
            case 1: totalHarga += 0; break;
            case 2: totalHarga += 100000; break;
            case 3: totalHarga += 150000; break;
            case 4: totalHarga += 200000; break;
        }

        if (sarapan == 1) {
            totalHarga += 75000;
        }
    }

    // Menampilkan detail pesanan
    public void detailPesanan() {
        System.out.println(" --------- Detail Pesanan ---------");
        System.out.println("Atas Nama: " + namaPemesan);
        System.out.println("No. Handphone: " + noHp);
        System.out.println("Tanggal Check-In: " + tanggalCheckIn);
        System.out.println("Grade Kamar: " + (gradeKamar == 1 ? "A" : gradeKamar == 2 ? "B" : "C"));
        System.out.println("Tipe Kasur: " + (tipeKasur == 1 ? "Single" : tipeKasur == 2 ? "Twin" : tipeKasur == 3 ? "Queen" : "King"));
        System.out.println("Sarapan Pagi: " + (sarapan == 1 ? "Ya" : "Tidak"));
        System.out.println("Total Harga: Rp " + totalHarga );
        System.out.println("Selamat beristirahat, ketenangan anda ketenangan kami juga!");
    }

    // Getter nama pemesan
    public String getNamaPemesan() {
        return namaPemesan;
    }

    // Getter no hp
    public String getNoHp() {
        return noHp;
    }

    // Getter grade kamar
    public String getGradeKamar() {
        return (gradeKamar == 1 ? "A" : gradeKamar == 2 ? "B" : "C");
    }

    // Getter tipe kasur
    public String getTipeKasur() {
        return (tipeKasur == 1 ? "Single" : tipeKasur == 2 ? "Twin" : tipeKasur == 3 ? "Queen" : "King");
    }

    // Getter sarapan
    public int getSarapan() {
        return sarapan;
    }

    // Getter total harga
    public int getTotalHarga() {
        return totalHarga;
    }

    // Getter tanggal Check-In
    public String getTanggalCheckIn() {
        return tanggalCheckIn;
    }
}