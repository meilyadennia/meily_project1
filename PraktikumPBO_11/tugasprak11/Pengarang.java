/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak11;

/**
 *
 * @author ASUS
 */
class Pengarang {
    private String namaPengarang;

    // Konstruktor
    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    // Metode untuk menampilkan informasi pengarang
    public void infoPengarang() {
        System.out.println("Nama Pengarang: " + namaPengarang);
    }
}