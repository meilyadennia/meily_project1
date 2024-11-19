/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak12;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenuPerpustakaan {
    // Nama file untuk penyimpanan data dalam format teks
    private static final String TEXT_FILE = "buku.txt";
    // Nama file untuk penyimpanan data dalam format serialisasi
    private static final String SERIAL_FILE = "buku.ser";
    // List untuk menyimpan objek Buku
    private static List<Buku> bukuList = new ArrayList<>();
    
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tampilkan menu utama
        while (true) {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan Buku ke File Teks");
            System.out.println("3. Simpan Buku ke File Serialisasi");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (dalam angka): ");
            int menu = scanner.nextInt(); // Membaca input menu dari pengguna
            scanner.nextLine();
            
            switch (menu) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanFileTeks();
                case 3 -> simpanFileSerial();
                case 4 -> tampilkanBuku();
                case 5 -> {
                    System.out.println("Keluar dari sistem perpustakaan.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
    
    // Membuat method untuk menambahkan buku ke sistem
    private static void tambahBuku(Scanner scanner) {
        System.out.println("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.println("Masukkan nama pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.println("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        
        bukuList.add(new Buku(judul, pengarang, tahunTerbit));
        System.out.println("Buku berhasil ditambahkan ke sistem.");
    }
    
    // Method untuk menyimpan file dalam format .txt
    private static void simpanFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan file teks.");
            e.printStackTrace();
        }
    }
    
    // Method untuk menyimpan file dalam format .ser
    private static void simpanFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Buku berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan file serial.");
            e.printStackTrace();
        }
    }
    
    // Method untuk menampilkan daftar buku
    private static void tampilkanBuku() {
        System.out.println("\nDaftar Buku ");
        for (Buku buku : bukuList) {
            buku.informasi();
        }
    }
}
