package model;

/**
 * Kelas Barang merepresentasikan satu entitas barang dalam inventaris.
 * Setiap barang memiliki atribut kode, nama, jumlah, dan harga.
 */
public class Barang {
    private String kode;
    private String nama;
    private int jumlah;
    private double harga;
    private String kategori;
    private String waktuInput;

    // Konstruktor untuk menginisialisasi data barang
    public Barang(String kode, String nama, int jumlah, double harga, String kategori, String waktuInput) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.kategori = kategori;
        this.waktuInput = waktuInput;
    }

    // Getter dan Setter untuk mengakses dan mengubah nilai atribut
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getJumlah() { return jumlah; }
    public double getHarga() { return harga; }

    public void setNama(String nama) { this.nama = nama; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }
    public void setHarga(double harga) { this.harga = harga; }
    
    public String getKategori() { return kategori; }
    public String getWaktuInput() { return waktuInput; }
}