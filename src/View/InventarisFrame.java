package View;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.io.File;
import model.Barang;
import model.Inventaris;
import util.FileHandler;

/**
 * Nama: BIMA EGI ALFAREZA
 * NPM : 2310010534
 * Proyek: UTS PBO - Aplikasi Inventaris Barang
 *
 * InventarisFrame dilengkapi logika CRUD, impor/ekspor,
 * dan integrasi dengan komponen GUI yang dibuat di NetBeans GUI Builder.
 */

public class InventarisFrame extends javax.swing.JFrame {
    
    // Objek model utama inventaris
    private Inventaris inventaris = new Inventaris();

    // Model tabel JTable
    private DefaultTableModel model;

    public InventarisFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Aplikasi Inventaris Barang");

        // Inisialisasi tabel (tidak editable)
        String[] kolom = {"KODE", "NAMA", "JUMLAH", "HARGA", "KATEGORI", "WAKTU"};
        model = new DefaultTableModel(kolom, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { 
                return false; 
            }
        };
        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "-", "PAKAIAN", "PERABOT", "BARANG ELEKTRONIK", "MAKANAN", "MINUMAN", "LAINNYA"
        }));
        cmbKategori.setSelectedIndex(0);
        tblData.setModel(model);

        // Pasang aksi tombol dan listener tabel
        aksiTombol();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlJudul = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        pnlKomponen = new javax.swing.JPanel();
        pnlInput = new javax.swing.JPanel();
        lblKode = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblJumlah = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        lblKategori = new javax.swing.JLabel();
        cmbKategori = new javax.swing.JComboBox<>();
        pnlDataFile = new javax.swing.JPanel();
        btnEkspor = new javax.swing.JButton();
        btnImpor = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        pnlTampil = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        scrlpnlData = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Inventaris Barang");

        pnlJudul.setBackground(new java.awt.Color(0, 102, 153));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(255, 255, 255));
        lblJudul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/boxes.png"))); // NOI18N
        lblJudul.setText("APLIKASI INVENTARIS BARANG");
        pnlJudul.add(lblJudul);

        getContentPane().add(pnlJudul, java.awt.BorderLayout.PAGE_START);

        pnlKomponen.setLayout(new java.awt.BorderLayout());

        pnlInput.setBackground(new java.awt.Color(0, 102, 153));

        lblKode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKode.setForeground(new java.awt.Color(255, 255, 255));
        lblKode.setText("KODE:");

        lblNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNama.setForeground(new java.awt.Color(255, 255, 255));
        lblNama.setText("NAMA BARANG:");

        lblJumlah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJumlah.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlah.setText("JUMLAH:");

        lblHarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHarga.setForeground(new java.awt.Color(255, 255, 255));
        lblHarga.setText("HARGA:");

        lblKategori.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKategori.setForeground(new java.awt.Color(255, 255, 255));
        lblKategori.setText("KATEGORI BARANG:");

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAKAIAN", "PERABOT", "BARANG ELEKTRONIK", "MAKANAN", "MINUMAN", "LAINNYA" }));

        javax.swing.GroupLayout pnlInputLayout = new javax.swing.GroupLayout(pnlInput);
        pnlInput.setLayout(pnlInputLayout);
        pnlInputLayout.setHorizontalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addComponent(lblKategori)
                        .addGap(34, 34, 34)
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama)
                            .addComponent(txtKode)
                            .addComponent(cmbKategori, 0, 165, Short.MAX_VALUE)))
                    .addComponent(lblNama)
                    .addComponent(lblKode, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJumlah)
                    .addComponent(lblHarga))
                .addGap(27, 27, 27)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(txtJumlah))
                .addGap(25, 25, 25))
        );
        pnlInputLayout.setVerticalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKode)
                    .addComponent(lblJumlah)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama)
                    .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHarga)
                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKategori)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlKomponen.add(pnlInput, java.awt.BorderLayout.PAGE_START);

        pnlDataFile.setBackground(new java.awt.Color(0, 102, 153));

        btnEkspor.setBackground(new java.awt.Color(255, 153, 153));
        btnEkspor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEkspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/import-export.png"))); // NOI18N
        btnEkspor.setText("EKSPOR DATA");

        btnImpor.setBackground(new java.awt.Color(153, 255, 153));
        btnImpor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnImpor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/download.png"))); // NOI18N
        btnImpor.setText("IMPOR DATA");

        btnHapus.setBackground(new java.awt.Color(255, 153, 153));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        btnHapus.setText("HAPUS");

        btnKeluar.setBackground(new java.awt.Color(204, 0, 0));
        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/button.png"))); // NOI18N
        btnKeluar.setText("KELUAR");

        btnUbah.setBackground(new java.awt.Color(255, 204, 0));
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editing.png"))); // NOI18N
        btnUbah.setText("UBAH");

        btnTambah.setBackground(new java.awt.Color(0, 255, 51));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus.png"))); // NOI18N
        btnTambah.setText("TAMBAH");

        btnReset.setBackground(new java.awt.Color(255, 255, 0));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reset.png"))); // NOI18N
        btnReset.setText("RESET");

        javax.swing.GroupLayout pnlDataFileLayout = new javax.swing.GroupLayout(pnlDataFile);
        pnlDataFile.setLayout(pnlDataFileLayout);
        pnlDataFileLayout.setHorizontalGroup(
            pnlDataFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataFileLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlDataFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataFileLayout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDataFileLayout.createSequentialGroup()
                        .addComponent(btnImpor)
                        .addGap(18, 18, 18)
                        .addComponent(btnEkspor)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnlDataFileLayout.setVerticalGroup(
            pnlDataFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataFileLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDataFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar)
                    .addComponent(btnUbah)
                    .addComponent(btnTambah)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addGroup(pnlDataFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEkspor)
                    .addComponent(btnImpor))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnlKomponen.add(pnlDataFile, java.awt.BorderLayout.PAGE_END);

        pnlTampil.setLayout(new java.awt.BorderLayout());

        lblData.setBackground(new java.awt.Color(0, 102, 204));
        lblData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData.setText("                                                                            TABEL DATA BARANG");
        pnlTampil.add(lblData, java.awt.BorderLayout.PAGE_START);

        tblData.setBackground(new java.awt.Color(0, 102, 153));
        tblData.setForeground(new java.awt.Color(255, 255, 255));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "KODE", "NAMA", "JUMLAH", "HARGA", "KATEGORI", "WAKTU"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrlpnlData.setViewportView(tblData);

        pnlTampil.add(scrlpnlData, java.awt.BorderLayout.CENTER);

        pnlKomponen.add(pnlTampil, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlKomponen, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Menampilkan seluruh data inventaris ke tabel.
     */
    private void tampilkanData() {
    model.setRowCount(0);
    for (Barang b : inventaris.getAllBarang()) {
        Object[] row = {
            b.getKode(),
            b.getNama(),
            b.getJumlah(),
            b.getHarga(),
            b.getKategori(),
            b.getWaktuInput()
        };
        model.addRow(row);
    }
}

    /**
     * Mengosongkan semua field pada form input.
     */
    private void resetForm() {
        txtKode.setText("");
        txtNama.setText("");
        txtJumlah.setText("");
        txtHarga.setText("");
        tblData.clearSelection();
        cmbKategori.setSelectedIndex(0);
    }

    /**
     * Memasang action listener untuk semua tombol dan listener tabel.
     */
    private void aksiTombol() {

        // Tombol Tambah
        btnTambah.addActionListener(e -> {
            try {
                String kode = txtKode.getText().trim();
                String nama = txtNama.getText().trim();
                int jumlah = Integer.parseInt(txtJumlah.getText().trim());
                double harga = Double.parseDouble(txtHarga.getText().trim());
                String kategori = cmbKategori.getSelectedItem().toString();

                if (kode.isEmpty() || nama.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Kode dan Nama tidak boleh kosong!");
                    return;
                }

                // Cek kategori
                if (kategori.equals("-")) {
                    JOptionPane.showMessageDialog(this, "Silakan pilih kategori barang!");
                    return;
                }

                // Waktu saat barang ditambahkan
                String waktuInput = java.time.LocalDateTime.now()
                        .format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                Barang b = new Barang(kode, nama, jumlah, harga, kategori, waktuInput);
                inventaris.tambahBarang(b);
                tampilkanData();
                resetForm();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Jumlah atau Harga harus berupa angka!");
            }
        });

        // Tombol Ubah
        btnUbah.addActionListener(e -> {
            int row = tblData.getSelectedRow();

            if (row >= 0) {
                try {
                    String kode = txtKode.getText().trim();
                    String nama = txtNama.getText().trim();
                    int jumlah = Integer.parseInt(txtJumlah.getText().trim());
                    double harga = Double.parseDouble(txtHarga.getText().trim());
                    String kategori = cmbKategori.getSelectedItem().toString();

                    // Cek kategori
                    if (kategori.equals("-")) {
                        JOptionPane.showMessageDialog(this, "Silakan pilih kategori barang!");
                        return;
                    }

                    // Waktu input lama – jangan diganti!
                    String waktuInput = model.getValueAt(row, 5).toString();

                    Barang b = new Barang(kode, nama, jumlah, harga, kategori, waktuInput);

                    inventaris.ubahBarang(row, b);
                    tampilkanData();
                    resetForm();

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Jumlah atau Harga harus berupa angka!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin diubah!");
            }
        });

        // Tombol Hapus
        btnHapus.addActionListener(e -> {
            int row = tblData.getSelectedRow();
            if (row >= 0) {
                int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    inventaris.hapusBarang(row);
                    tampilkanData();
                    resetForm();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin dihapus!");
            }
        });

        // Tombol Reset
        btnReset.addActionListener(e -> resetForm());

        // Tombol Keluar
        btnKeluar.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, "Keluar aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // Tombol Ekspor (jButton1)
        btnEkspor.addActionListener(e -> {
            try {
                JFileChooser chooser = new JFileChooser();
                chooser.setDialogTitle("Pilih lokasi untuk menyimpan file");

                int result = chooser.showSaveDialog(this);

                // Jika pengguna menekan Cancel → hentikan proses
                if (result != JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(this, "Ekspor dibatalkan.");
                    return;
                }

                File file = chooser.getSelectedFile();
                if (!file.getName().endsWith(".txt")) {
                    file = new File(file.getAbsolutePath() + ".txt");
                }

                FileHandler.simpanKeFile(inventaris.getAllBarang(), file);

                JOptionPane.showMessageDialog(this, 
                    "Data berhasil diekspor ke:\n" + file.getAbsolutePath());

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan file: " + ex.getMessage());
            }
        });

        // Tombol Impor (jButton2)
        btnImpor.addActionListener(e -> {
            try {
                JFileChooser chooser = new JFileChooser();
                chooser.setDialogTitle("Pilih file untuk diimpor");

                int result = chooser.showOpenDialog(this);

                if (result != JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(this, "Impor dibatalkan.");
                    return;
                }

                File file = chooser.getSelectedFile();

                // Muat data dari file terpilih
                ArrayList<Barang> loaded = FileHandler.muatDariFile(file);

                inventaris.getAllBarang().clear();
                inventaris.getAllBarang().addAll(loaded);

                tampilkanData();

                JOptionPane.showMessageDialog(this, 
                    "Data berhasil diimpor dari:\n" + file.getAbsolutePath());

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Gagal memuat file: " + ex.getMessage());
            }
        });

        // Listener saat memilih baris di tabel -> isi form otomatis
        tblData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int row = tblData.getSelectedRow();
                if (row >= 0) {
                    txtKode.setText(model.getValueAt(row, 0).toString());
                    txtNama.setText(model.getValueAt(row, 1).toString());
                    txtJumlah.setText(model.getValueAt(row, 2).toString());
                    txtHarga.setText(model.getValueAt(row, 3).toString());
                }
            }
        });
    }

    /**
     * main method to run the application
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel (optional) */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            // ignore and continue with default L&F
        }

    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InventarisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarisFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InventarisFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkspor;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImpor;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblNama;
    private javax.swing.JPanel pnlDataFile;
    private javax.swing.JPanel pnlInput;
    private javax.swing.JPanel pnlJudul;
    private javax.swing.JPanel pnlKomponen;
    private javax.swing.JPanel pnlTampil;
    private javax.swing.JScrollPane scrlpnlData;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
