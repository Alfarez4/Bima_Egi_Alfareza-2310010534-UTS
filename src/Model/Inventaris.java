package model;
import java.util.ArrayList;

/**
 * Kelas Inventaris berfungsi untuk mengelola kumpulan objek Barang.
 * Menyediakan fungsi untuk menambah, mengubah, menghapus,
 * dan mengambil seluruh data barang.
 */
public class Inventaris {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();

    // Menambah barang baru ke daftar
    public void tambahBarang(Barang b) { daftarBarang.add(b); }

    // Menghapus barang berdasarkan index
    public void hapusBarang(int index) { daftarBarang.remove(index); }

    // Mengubah data barang berdasarkan index
    public void ubahBarang(int index, Barang b) { daftarBarang.set(index, b); }

    // Mengambil semua data barang yang tersimpan
    public ArrayList<Barang> getAllBarang() { return daftarBarang; }
}