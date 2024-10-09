/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelreservasi;
import java.util.Scanner;

/**
 *
 * @author Fahru
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] ketersediaanKamar = {true, true, true};  // 1 kamar per grade

        Admin admin = new Admin("Fahru080", "123", ketersediaanKamar);
        Customer customer = new Customer("Rizal080", "123", ketersediaanKamar);
        User loggedInUser = null;

        boolean isRunning = true;

        while (isRunning) {
            if (loggedInUser == null) {
                System.out.println("Selamat Datang di Reservasi Fahru's Hotel 27!");
                System.out.println("Silahkan Login Terlebih Dahulu");

                System.out.print("Username: ");
                String username = input.next();

                System.out.print("Password: ");
                String password = input.next();

                if (admin.login(username, password)) {
                    System.out.println("Login berhasil sebagai Admin.");
                    loggedInUser = admin;
                } else if (customer.login(username, password)) {
                    System.out.println("Login berhasil sebagai Customer.");
                    loggedInUser = customer;
                } else {
                    System.out.println("Username atau password salah!");
                    continue;
                }
            }

            if (loggedInUser instanceof Admin) {
                System.out.println("1. Lihat Riwayat Transaksi");
                System.out.println("2. Cek Ketersediaan Kamar");
                int pilihan = input.nextInt();

                if (pilihan == 1) {
                    ((Admin) loggedInUser).lihatRiwayatTransaksi(customer);
                } else if (pilihan == 2) {
                    ((Admin) loggedInUser).cekKetersediaanKamar();
                }
            } else if (loggedInUser instanceof Customer) {
                System.out.println("1. Lanjut Transaksi");
                System.out.println("2. Cek Ketersediaan Kamar");
                int pilihan = input.nextInt();

                if (pilihan == 1) {
                    ((Customer) loggedInUser).transaksi();
                } else if (pilihan == 2) {
                    ((Customer) loggedInUser).cekKetersediaanKamar();
                }
            }

            System.out.println("Apakah Anda ingin keluar dari aplikasi?");
            System.out.println("1. Ya (Keluar)");
            System.out.println("2. Tidak (Lanjutkan)");

            int pilihanKeluar = input.nextInt();
            if (pilihanKeluar == 1) {
                isRunning = false;
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
            } else {
                loggedInUser = null;
            }
        }
    }
}

//Buat login bang
//Admin: Username:"Fahru80", Pass:"123"
//Customer: Username:"Rizal080", Pass:"123"

//Rekomendasi check, pesen pake akun customer
//lanjut jangan keluar dari aplikasi, pilih login lagi terus pake akun admin
