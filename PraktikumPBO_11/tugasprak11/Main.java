/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pengarang
        Pengarang pengarang1 = new Pengarang("Pramoedya Ananta Toer");
        Pengarang pengarang2 = new Pengarang("Leila S. Chudori");

        // Membuat objek Buku dengan agregasi pengarang
        Buku buku1 = new Buku("Bumi Manusia", pengarang1);
        Buku buku2 = new Buku("Laut Bercerita", pengarang2);

        // Membuat objek Perpustakaan dan menambahkan buku
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan semua buku di perpustakaan
        perpustakaan.tampilkanInfoBuku();
    }
}