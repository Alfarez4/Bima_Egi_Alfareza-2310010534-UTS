package util;

import java.io.*;
import java.util.ArrayList;
import model.Barang;

public class FileHandler {

    // Simpan data ke file yang dipilih pengguna
    public static void simpanKeFile(ArrayList<Barang> daftar, File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (Barang b : daftar) {
            writer.write(b.getKode() + "," +
                        b.getNama() + "," +
                        b.getJumlah() + "," +
                        b.getHarga() + "," +
                        b.getKategori() + "," +
                        b.getWaktuInput() + "\n");
                   }
        writer.close();
    }

    // Simpan ke file default
    public static void simpanKeFile(ArrayList<Barang> daftar) throws IOException {
        simpanKeFile(daftar, new File("data_barang.txt"));
    }

    // Muat data dari file yang dipilih pengguna
    public static ArrayList<Barang> muatDariFile(File file) throws IOException {
        ArrayList<Barang> daftar = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            Barang b = new Barang(
                data[0],
                data[1],
                Integer.parseInt(data[2]),
                Double.parseDouble(data[3]),
                data[4],      // kategori
                data[5]       // waktu input
            );
            daftar.add(b);
        }

        reader.close();
        return daftar;
    }

    // Muat dari file default
    public static ArrayList<Barang> muatDariFile() throws IOException {
        return muatDariFile(new File("data_barang.txt"));
    }
}
