package id.pajerosportdakar.carsale;
import java.io.File;   
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddCarFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddCarFrame
     */
    public AddCarFrame(ArrayList<Car> carList, String username) {
        this.carList = carList;
        this.username = username;
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        panelFormulir = new javax.swing.JPanel();
        lbMerek = new javax.swing.JLabel();
        tfMerek = new javax.swing.JTextField();
        lbModel = new javax.swing.JLabel();
        tfModel = new javax.swing.JTextField();
        lbTahunModel = new javax.swing.JLabel();
        tfTahunModel = new javax.swing.JTextField();
        lbOdometer = new javax.swing.JLabel();
        cbOdometer = new javax.swing.JComboBox<>();
        lbLokasi = new javax.swing.JLabel();
        tfLokasi = new javax.swing.JTextField();
        cbJenisBBM = new javax.swing.JComboBox<>();
        lbJenisBBM = new javax.swing.JLabel();
        lbTransmisi = new javax.swing.JLabel();
        cbTransmisi = new javax.swing.JComboBox<>();
        tfKubikasi = new javax.swing.JTextField();
        lbKubikasi = new javax.swing.JLabel();
        lbSatuanCC = new javax.swing.JLabel();
        lbHarga = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        lbRupiah = new javax.swing.JLabel();
        lbNoTel = new javax.swing.JLabel();
        tfNoTel = new javax.swing.JTextField(getNomorPenjual(username));
        lbKodeTel = new javax.swing.JLabel();
        chbUseCurrentTel = new javax.swing.JCheckBox();
        lbWarna = new javax.swing.JLabel();
        tfWarna = new javax.swing.JTextField();
        tfImagePath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDeskripsi = new javax.swing.JTextArea();
        tbTambahMbl = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbAddPict = new javax.swing.JButton();
        tbRemovePict = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tambah Mobil Baru");
        setSize(new java.awt.Dimension(600, 630));

        lbHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbHeader.setText("Tambah Mobil");
        lbHeader.setAutoscrolls(true);
        lbHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panelFormulir.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbMerek.setText("Merek");

        tfMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMerekActionPerformed(evt);
            }
        });

        lbModel.setText("Model");

        tfModel.setMaximumSize(new java.awt.Dimension(68, 26));

        lbTahunModel.setText("Tahun Model");

        tfTahunModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTahunModelActionPerformed(evt);
            }
        });

        lbOdometer.setText("Odometer");

        cbOdometer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< 5.000 km", "5.001 - 10.000 km", "10.001 - 20.000 km", "20.001 - 40.000 km", "40.001 - 80.000 km", "80.000 - 100.000 km", "100.000 - 200.000 km", "> 200.000 km" }));
        cbOdometer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOdometerActionPerformed(evt);
            }
        });

        lbLokasi.setText("Lokasi");

        tfLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLokasiActionPerformed(evt);
            }
        });

        cbJenisBBM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bensin", "Diesel", "Hybrid", "Listrik" }));

        lbJenisBBM.setText("Jenis BBM");

        lbTransmisi.setText("Transmisi");

        cbTransmisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual (MT)", "Matic (AT)" }));
        cbTransmisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTransmisiActionPerformed(evt);
            }
        });

        tfKubikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKubikasiActionPerformed(evt);
            }
        });

        lbKubikasi.setText("Kubikasi Mesin");

        lbSatuanCC.setText("cc");

        lbHarga.setText("Harga");

        tfHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHargaActionPerformed(evt);
            }
        });

        lbRupiah.setText("Rp");

        lbNoTel.setText("Nomor Telepon (untuk CP)");

        tfNoTel.setEditable(false);
        tfNoTel.setToolTipText("tidak usah menuliskan angka nol");
        tfNoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNoTelActionPerformed(evt);
            }
        });

        lbKodeTel.setText("+62");

        chbUseCurrentTel.setSelected(true);
        chbUseCurrentTel.setText("Gunakan Nomor Saya");
        chbUseCurrentTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbUseCurrentTelActionPerformed(evt);
            }
        });

        lbWarna.setText("Warna");

        tfImagePath.setEditable(false);
        tfImagePath.setText("-");

        jLabel1.setText("Lokasi File Gambar");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbImage.setText("(gambar)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );

        jLabel2.setText("Deskripsi");

        taDeskripsi.setColumns(20);
        taDeskripsi.setRows(5);
        jScrollPane1.setViewportView(taDeskripsi);

        javax.swing.GroupLayout panelFormulirLayout = new javax.swing.GroupLayout(panelFormulir);
        panelFormulir.setLayout(panelFormulirLayout);
        panelFormulirLayout.setHorizontalGroup(
            panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormulirLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfMerek, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelFormulirLayout.createSequentialGroup()
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTahunModel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTahunModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbOdometer, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOdometer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfLokasi)
                    .addComponent(lbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFormulirLayout.createSequentialGroup()
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbJenisBBM, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJenisBBM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTransmisi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTransmisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFormulirLayout.createSequentialGroup()
                        .addComponent(lbRupiah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfHarga))
                    .addGroup(panelFormulirLayout.createSequentialGroup()
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormulirLayout.createSequentialGroup()
                                .addComponent(tfKubikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSatuanCC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbKubikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormulirLayout.createSequentialGroup()
                        .addComponent(lbKodeTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNoTel))
                    .addComponent(chbUseCurrentTel)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        panelFormulirLayout.setVerticalGroup(
            panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormulirLayout.createSequentialGroup()
                .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormulirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbMerek)
                        .addGap(10, 10, 10)
                        .addComponent(tfMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbModel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTahunModel)
                            .addComponent(lbOdometer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTahunModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOdometer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLokasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJenisBBM)
                            .addComponent(lbTransmisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbJenisBBM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTransmisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKubikasi)
                            .addComponent(lbWarna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfKubikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSatuanCC)
                            .addComponent(tfWarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbHarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRupiah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNoTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKodeTel)
                            .addComponent(tfNoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbUseCurrentTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormulirLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        tbTambahMbl.setText("Tambah");
        tbTambahMbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahMblActionPerformed(evt);
            }
        });

        tbBatal.setText("Batal");
        tbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBatalActionPerformed(evt);
            }
        });

        tbAddPict.setText("Tambah Gambar");
        tbAddPict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAddPictActionPerformed(evt);
            }
        });

        tbRemovePict.setText("Hapus Gambar");
        tbRemovePict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbRemovePictActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFormulir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tbAddPict)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbRemovePict, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbTambahMbl)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(lbHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFormulir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbTambahMbl)
                    .addComponent(tbBatal)
                    .addComponent(tbAddPict)
                    .addComponent(tbRemovePict))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMerekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMerekActionPerformed

    private void tbTambahMblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahMblActionPerformed
        // TODO add your handling code here:
        String merek = tfMerek.getText();  
        String model = tfModel.getText();  
        String tahun = tfTahunModel.getText();  
        String harga = tfHarga.getText();  
        String odometer = (String) cbOdometer.getSelectedItem();
        String jenisBBM = (String) cbJenisBBM.getSelectedItem();
        String jenisGearbox = (String) cbTransmisi.getSelectedItem();
        String kubikasi = tfKubikasi.getText();
        String warna = tfWarna.getText();
        String lokasi = tfLokasi.getText();
        String nomorPenjual = tfNoTel.getText();
        String namaPenjual = username;
        String deskripsi = taDeskripsi.getText();
        String imagePath = tfImagePath.getText();
        
        int a = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menanbahkan mobil ini?\nSetelah anda klik Yes, anda tidak dapat mengubahnya kembali!", "Konfirmasi Penambahan", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (a == JOptionPane.YES_OPTION) {
            if (merek.isEmpty() || model.isEmpty() || tahun.isEmpty() || harga.isEmpty() || kubikasi.isEmpty() || warna.isEmpty() || lokasi.isEmpty() || nomorPenjual.isEmpty() || namaPenjual.isEmpty() || deskripsi.isEmpty() || imagePath.matches("-")) {
                JOptionPane.showMessageDialog(this, "Tidak dapat menambahkan mobil. \nData kosong atau tidak sah. Mohon periksa kembali data yang anda masukkan.", "Galat", JOptionPane.ERROR_MESSAGE);
            return;
            }      
            
            Car newCar = new Car(merek, model, tahun, harga, deskripsi, odometer, jenisBBM, jenisGearbox, kubikasi, warna, lokasi, nomorPenjual, namaPenjual, imagePath);
            carList.add(newCar);
            JOptionPane.showMessageDialog(this, "Mobil berhasil ditambahkan", "Tambah Mobil", JOptionPane.INFORMATION_MESSAGE);
            Main.saveCarData();
            new MainFrame(username, Main.carList).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_tbTambahMblActionPerformed
        
    private void cbOdometerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOdometerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOdometerActionPerformed

    private void tbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBatalActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin membatalkan? \nData yang anda masukkan akan hilang!", "Konfirmasi Batal", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (a == JOptionPane.YES_OPTION) {
            new MainFrame(username, Main.carList).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_tbBatalActionPerformed

    private void tfTahunModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTahunModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTahunModelActionPerformed

    private void tfLokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLokasiActionPerformed

    private void tbAddPictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAddPictActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih Gambar");
        fileChooser.setCurrentDirectory(new File("C:\\Users\\DarkLighs\\Pictures"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("image", ".png",".jpg", ".jpeg", ".webp");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION) {
            String imagePath = fileChooser.getSelectedFile().getAbsolutePath();
            tfImagePath.setText(imagePath);
            System.out.println("Gambar berhasil ditambahkan! \nJalur: " + imagePath);
            
            lbImage.setText("");
            ImageIcon imageIco = new ImageIcon(imagePath);
            Image image = imageIco.getImage().getScaledInstance(370, 260, Image.SCALE_SMOOTH);
            lbImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_tbAddPictActionPerformed
    
    private void tfKubikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKubikasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKubikasiActionPerformed

    private void tfHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHargaActionPerformed

    private void tbRemovePictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbRemovePictActionPerformed
        // TODO add your handling code here:
        lbImage.setIcon(null); // Menghapus gambar dari JLabel  
        tfImagePath.setText("-");
        JOptionPane.showMessageDialog(this, "Gambar dihapus.", "Form", JOptionPane.INFORMATION_MESSAGE); // Menampilkan pesan ke pengguna   
    }//GEN-LAST:event_tbRemovePictActionPerformed

    private void tfNoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNoTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNoTelActionPerformed

    private void chbUseCurrentTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbUseCurrentTelActionPerformed
        // TODO add your handling code here:
        if (!chbUseCurrentTel.isSelected()) {
            tfNoTel.setEditable(true);
        } else {
            tfNoTel.setEditable(false);
            tfNoTel.setText(getNomorPenjual(username));
        }
    }//GEN-LAST:event_chbUseCurrentTelActionPerformed

    private void cbTransmisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTransmisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTransmisiActionPerformed
    
    private String getNomorPenjual(String username) {  
        for (User user : Main.userList) {  
            if (user.getUsername().equals(username)) {  
                return user.getPhone();  
            }  
        }  
        return "";  
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbJenisBBM;
    private javax.swing.JComboBox<String> cbOdometer;
    private javax.swing.JComboBox<String> cbTransmisi;
    private javax.swing.JCheckBox chbUseCurrentTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbJenisBBM;
    private javax.swing.JLabel lbKodeTel;
    private javax.swing.JLabel lbKubikasi;
    private javax.swing.JLabel lbLokasi;
    private javax.swing.JLabel lbMerek;
    private javax.swing.JLabel lbModel;
    private javax.swing.JLabel lbNoTel;
    private javax.swing.JLabel lbOdometer;
    private javax.swing.JLabel lbRupiah;
    private javax.swing.JLabel lbSatuanCC;
    private javax.swing.JLabel lbTahunModel;
    private javax.swing.JLabel lbTransmisi;
    private javax.swing.JLabel lbWarna;
    private javax.swing.JPanel panelFormulir;
    private javax.swing.JTextArea taDeskripsi;
    private javax.swing.JButton tbAddPict;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbRemovePict;
    private javax.swing.JButton tbTambahMbl;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfImagePath;
    private javax.swing.JTextField tfKubikasi;
    private javax.swing.JTextField tfLokasi;
    private javax.swing.JTextField tfMerek;
    private javax.swing.JTextField tfModel;
    private javax.swing.JTextField tfNoTel;
    private javax.swing.JTextField tfTahunModel;
    private javax.swing.JTextField tfWarna;
    // End of variables declaration//GEN-END:variables
    ArrayList<Car> carList;
    String username;
    
}