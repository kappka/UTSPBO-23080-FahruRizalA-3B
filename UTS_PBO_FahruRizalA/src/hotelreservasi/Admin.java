/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservasi;

/**
 *
 * @author Fahru
 */
public class Admin implements User {
    private String username;
    private String password;
    private boolean[] ketersediaanKamar;

    public Admin(String username, String password, boolean[] ketersediaanKamar) {
        this.username = username;
        this.password = password;
        this.ketersediaanKamar = ketersediaanKamar;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void lihatRiwayatTransaksi(Customer customer) {
        System.out.println("--------- Riwayat Transaksi Pemesanan ---------");

        if (customer.getNamaPemesan().equals("-") && customer.getNoHp().equals("-")) {
            System.out.println("Belum ada transaksi yang dilakukan oleh customer.");
        } else {
            System.out.println("Nama Pemesan: " + customer.getNamaPemesan());
            System.out.println("Nomor Handphone: " + customer.getNoHp());
            Reservation reservasi = customer.getReservation();
            if (reservasi != null) {
                System.out.println("Tanggal Check-In: " + reservasi.getTanggalCheckIn());
                System.out.println("Grade Kamar: " + reservasi.getGradeKamar());
                System.out.println("Tipe Kasur: " + reservasi.getTipeKasur());
                System.out.println("Sarapan: " + (reservasi.getSarapan() == 1 ? "Ya" : "Tidak"));
                System.out.println("Total Harga: Rp " + reservasi.getTotalHarga());
            } else {
                System.out.println("Belum ada reservasi yang dilakukan.");
            }
        }
    }

    // Metode untuk mengecek ketersediaan kamar
    public void cekKetersediaanKamar() {
        System.out.println("------ Cek Ketersediaan Kamar ------");
        System.out.println("Kamar Grade A: " + (ketersediaanKamar[0] ? "Tersedia" : "Terisi"));
        System.out.println("Kamar Grade B: " + (ketersediaanKamar[1] ? "Tersedia" : "Terisi"));
        System.out.println("Kamar Grade C: " + (ketersediaanKamar[2] ? "Tersedia" : "Terisi"));
    }
}