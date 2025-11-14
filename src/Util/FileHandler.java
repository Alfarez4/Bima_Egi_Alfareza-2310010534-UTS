package util;
import java.io.*;
import java.util.*;
import model.Barang;

/**
 * Kelas FileHandler bertanggung jawab untuk menyimpan dan memuat
 * data barang dari dan ke dalam file eksternal (.txt).
 * Hal ini untuk memenuhi fitur tantangan +20 poin (Ekspor & Impor Data).
 */
public class FileHandler {

    // Menyimpan daftar barang ke dalam file teks
    public static void simpanKeFile(ArrayList<Barang> daftar) throws IOException {
        FileWriter writer = new FileWriter("data_barang.txt");
        for (Barang b : daftar) {
            writer.write(b.getKode() + "," + b.getNama() + "," + b.getJumlah() + "," + b.getHarga() + "\n");
        }
        writer.close();
    }

    // Membaca data barang dari file teks dan mengubahnya menjadi objek Barang
    public static ArrayList<Barang> muatDariFile() throws IOException {
        ArrayList<Barang> daftar = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("data_barang.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            Barang b = new Barang(data[0], data[1],
                    Integer.parseInt(data[2]), Double.parseDouble(data[3]));
            daftar.add(b);
        }
        reader.close();
        return daftar;
    }
}