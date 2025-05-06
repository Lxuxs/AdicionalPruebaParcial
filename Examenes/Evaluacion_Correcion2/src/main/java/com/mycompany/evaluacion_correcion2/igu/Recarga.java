package com.mycompany.evaluacion_correcion2.igu;

import com.mycompany.evaluacion_correcion2.logica.Controladora;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Recarga extends javax.swing.JFrame {

    private Controladora controladora = new Controladora();
    private DecimalFormat df = new DecimalFormat("#.##"); // Formato para 2 decimales

    public Recarga() {
        initComponents();
        setVisible(true);
        // Añadir listener al JComboBox para actualizar campos automáticamente
        cmbSeleccionaRegarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDistribucionAutomatica();
            }
        });
    }

    // Método para calcular y actualizar saldo y megas automáticamente
    private void actualizarDistribucionAutomatica() {
        String valorRecarga = (String) cmbSeleccionaRegarga.getSelectedItem();
        if (valorRecarga != null && !valorRecarga.isEmpty()) {
            try {
                double valorRecargaNum = Double.parseDouble(valorRecarga.replace("$", ""));
                double saldo = (2.0 / 3.0) * valorRecargaNum;
                double megasDolares = (1.0 / 3.0) * valorRecargaNum;
                double megas = megasDolares * 5.0;
                txtDistribucionSaldoField.setText(df.format(saldo));
                txtDistribucionMegasField.setText(df.format(megas));
            } catch (NumberFormatException e) {
                txtDistribucionSaldoField.setText("");
                txtDistribucionMegasField.setText("");
            }
        } else {
            txtDistribucionSaldoField.setText("");
            txtDistribucionMegasField.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JLabel();
        IngresarCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        IngresarNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        IngresarApellido = new javax.swing.JTextField();
        txtNumeroCelular = new javax.swing.JLabel();
        IngresarNumeroCelular = new javax.swing.JTextField();
        txtEstadoCelular = new javax.swing.JLabel();
        cmbSeleccionarEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbSeleccionaRegarga = new javax.swing.JComboBox<>();
        txtDistribucionSaldo = new javax.swing.JLabel();
        txtDistribucionSaldoField = new javax.swing.JTextField();
        txtDistribucionMegas = new javax.swing.JLabel();
        txtDistribucionMegasField = new javax.swing.JTextField();
        BotonRecarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTitulo.setText("Recargas de Celular");

        txtCedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCedula.setText("Cedula");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.setText("Nombre");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Apellido");

        txtNumeroCelular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNumeroCelular.setText("NumeroCelular");

        txtEstadoCelular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEstadoCelular.setText("EstadoCelular");

        cmbSeleccionarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular en buen estado", "Celular en mal estado", " " }));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("ValorRecarga");

        cmbSeleccionaRegarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "$1.00", "$3.00", "$5.00" }));

        txtDistribucionSaldo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDistribucionSaldo.setText("DistribucionSaldo");

        txtDistribucionMegas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDistribucionMegas.setText("DistribucionMegas");

        BotonRecarga.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonRecarga.setText("Realizar Recarga");
        BotonRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRecargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDistribucionSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDistribucionSaldoField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEstadoCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumeroCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IngresarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(IngresarNombre)
                                    .addComponent(IngresarApellido)
                                    .addComponent(IngresarNumeroCelular)
                                    .addComponent(cmbSeleccionarEstado, 0, 159, Short.MAX_VALUE)
                                    .addComponent(cmbSeleccionaRegarga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDistribucionMegas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDistribucionMegasField)))))
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula)
                    .addComponent(IngresarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(IngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IngresarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroCelular)
                    .addComponent(IngresarNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoCelular)
                    .addComponent(cmbSeleccionarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbSeleccionaRegarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistribucionSaldo)
                    .addComponent(txtDistribucionSaldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistribucionMegas)
                    .addComponent(txtDistribucionMegasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void BotonRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRecargaActionPerformed
        {
            try {
                // Obtener datos de los campos
                String cedula = IngresarCedula.getText().trim();
                String nombre = IngresarNombre.getText().trim();
                String apellido = IngresarApellido.getText().trim();
                String numeroCelularStr = IngresarNumeroCelular.getText().trim();
                String estadoCelular = (String) cmbSeleccionarEstado.getSelectedItem();
                String valorRecarga = (String) cmbSeleccionaRegarga.getSelectedItem();
                String saldoStr = txtDistribucionSaldoField.getText().trim();
                String megasStr = txtDistribucionMegasField.getText().trim();

                // Validar campos vacíos
                if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || numeroCelularStr.isEmpty()
                        || estadoCelular == null || estadoCelular.trim().isEmpty() || valorRecarga == null
                        || saldoStr.isEmpty() || megasStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Validar estado del celular
                if (!estadoCelular.equals("Celular en buen estado")) {
                    JOptionPane.showMessageDialog(this, "El celular debe estar en buen estado para realizar la recarga", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Convertir número de celular
                int numeroCelular;
                try {
                    numeroCelular = Integer.parseInt(numeroCelularStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Número de celular inválido", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Convertir valor de recarga
                double valorRecargaNum;
                try {
                    valorRecargaNum = Double.parseDouble(valorRecarga.replace("$", ""));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Valor de recarga inválido", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Convertir saldo y megas
                double saldo, megas;
                try {
                    saldo = Double.parseDouble(saldoStr);
                    megas = Double.parseDouble(megasStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Saldo o megas inválidos", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Llamar al método de la controladora
                controladora.realizarRecarga(cedula, nombre, apellido, numeroCelular, estadoCelular, valorRecarga, saldo, megas);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Recarga realizada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                // Limpiar campos
                IngresarCedula.setText("");
                IngresarNombre.setText("");
                IngresarApellido.setText("");
                IngresarNumeroCelular.setText("");
                txtDistribucionSaldoField.setText("");
                txtDistribucionMegasField.setText("");
                cmbSeleccionarEstado.setSelectedIndex(0);
                cmbSeleccionaRegarga.setSelectedIndex(0);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_BotonRecargaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRecarga;
    private javax.swing.JTextField IngresarApellido;
    private javax.swing.JTextField IngresarCedula;
    private javax.swing.JTextField IngresarNombre;
    private javax.swing.JTextField IngresarNumeroCelular;
    private javax.swing.JComboBox<String> cmbSeleccionaRegarga;
    private javax.swing.JComboBox<String> cmbSeleccionarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCedula;
    private javax.swing.JLabel txtDistribucionMegas;
    private javax.swing.JTextField txtDistribucionMegasField;
    private javax.swing.JLabel txtDistribucionSaldo;
    private javax.swing.JTextField txtDistribucionSaldoField;
    private javax.swing.JLabel txtEstadoCelular;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNumeroCelular;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
