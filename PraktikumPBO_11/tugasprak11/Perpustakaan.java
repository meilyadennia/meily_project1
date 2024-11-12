/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak11;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    // Konstruktor
    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    // Metode untuk menambahkan buku ke perpustakaan
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    // Metode untuk menampilkan informasi semua buku di perpustakaan
    public void tampilkanInfoBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
        }
    }
}