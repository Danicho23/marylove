/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marylove.vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class VistaCita extends javax.swing.JFrame {

    /**
     * Creates new form vistaCita
     */
    public VistaCita() {
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

        panelCitas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_lstCitas = new javax.swing.JTable();
        btnCrearCita = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxPsicologos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_NombreVictima = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        lblcodigovictima = new javax.swing.JLabel();
        txt_codigoVictima = new javax.swing.JTextField();
        btnCrearPersona = new javax.swing.JButton();
        dtc_FechaCita = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lbl_codigoempleado = new javax.swing.JLabel();
        lblCodEmpleado = new javax.swing.JLabel();
        lblTituloCitas = new javax.swing.JLabel();
        cbxHora = new javax.swing.JComboBox<>();
        btnDetalles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_lstCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"
            }
        ));
        jScrollPane1.setViewportView(tbl_lstCitas);

        btnCrearCita.setText("Crear Cita");

        btnEliminar.setText("Eliminar");

        btnCancelar.setText("Cancelar");

        btnSalir.setText("Salir");

        jLabel1.setText("Psicólogo:");

        cbxPsicologos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Nombre de la victima:");

        txt_NombreVictima.setText("example victima");

        lblHora.setText("Hora:");

        lblcodigovictima.setText("Código victima:");

        txt_codigoVictima.setText("vict0000");

        btnCrearPersona.setText("Crear persona");

        jLabel7.setText("Fecha:");

        lblFechaActual.setText("06/02/2020");

        lblFecha.setText("Fecha:");

        lbl_codigoempleado.setText("Código empleado: ");

        lblCodEmpleado.setText("0000000000");

        lblTituloCitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloCitas.setText("CITAS");
        lblTituloCitas.setToolTipText("");

        cbxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        btnDetalles.setText("Detalles");

        javax.swing.GroupLayout panelCitasLayout = new javax.swing.GroupLayout(panelCitas);
        panelCitas.setLayout(panelCitasLayout);
        panelCitasLayout.setHorizontalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCitasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDetalles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCrearCita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addComponent(lblTituloCitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addGroup(panelCitasLayout.createSequentialGroup()
                                .addComponent(lblcodigovictima)
                                .addGap(18, 18, 18)
                                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelCitasLayout.createSequentialGroup()
                                        .addComponent(txt_codigoVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCrearPersona)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCitasLayout.createSequentialGroup()
                                .addComponent(lbl_codigoempleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodEmpleado))
                            .addGroup(panelCitasLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(dtc_FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addComponent(jScrollPane1)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_NombreVictima)
                            .addComponent(cbxPsicologos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHora)
                        .addGap(25, 25, 25)
                        .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelCitasLayout.setVerticalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTituloCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigoempleado)
                    .addComponent(lblCodEmpleado))
                .addGap(23, 23, 23)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblcodigovictima)
                        .addComponent(txt_codigoVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCrearPersona)
                        .addComponent(jLabel7))
                    .addComponent(dtc_FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_NombreVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxPsicologos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora)
                    .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCrearCita)
                    .addComponent(btnDetalles))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VistaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCita().setVisible(true);
            }
        });
    }

    public JLabel getLblFechaActual() {
        return lblFechaActual;
    }

    public void setLblFechaActual(JLabel lblFechaActual) {
        this.lblFechaActual = lblFechaActual;
    }

    public JLabel getLbl_codigoempleado() {
        return lbl_codigoempleado;
    }

    public void setLbl_codigoempleado(JLabel lbl_codigoempleado) {
        this.lbl_codigoempleado = lbl_codigoempleado;
    }

    public JLabel getLblcodigovictima() {
        return lblcodigovictima;
    }

    public void setLblcodigovictima(JLabel lblcodigovictima) {
        this.lblcodigovictima = lblcodigovictima;
    }

    public JTable getTbl_lstCitas() {
        return tbl_lstCitas;
    }

    public void setTbl_lstCitas(JTable tbl_lstCitas) {
        this.tbl_lstCitas = tbl_lstCitas;
    }
    
    //BOTONES
    
    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnCrearCita() {
        return btnCrearCita;
    }

    public void setBtnCrearCita(JButton btnCrearCita) {
        this.btnCrearCita = btnCrearCita;
    }

    public JButton getBtnCrearPersona() {
        return btnCrearPersona;
    }

    public void setBtnCrearPersona(JButton btnCrearPersona) {
        this.btnCrearPersona = btnCrearPersona;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }
    
    //DATOS DE LLENADO
    
    public JDateChooser getDtc_FechaCita() {
        return dtc_FechaCita;
    }

    public void setDtc_FechaCita(JDateChooser dtc_FechaCita) {
        this.dtc_FechaCita = dtc_FechaCita;
    }

    public JComboBox<String> getCbxHora() {
        return cbxHora;
    }

    public void setCbxHora(JComboBox<String> cbxHora) {
        this.cbxHora = cbxHora;
    }

    public JTextField getTxt_NombreVictima() {
        return txt_NombreVictima;
    }

    public void setTxt_NombreVictima(JTextField txt_NombreVictima) {
        this.txt_NombreVictima = txt_NombreVictima;
    }

    public JTextField getTxt_codigoVictima() {
        return txt_codigoVictima;
    }

    public void setTxt_codigoVictima(JTextField txt_codigoVictima) {
        this.txt_codigoVictima = txt_codigoVictima;
    }

    public JComboBox<String> getCbxPsicologos() {
        return cbxPsicologos;
    }

    public void setCbxPsicologos(JComboBox<String> cbxPsicologos) {
        this.cbxPsicologos = cbxPsicologos;
    }

    public JPanel getPanelCitas() {
        return panelCitas;
    }

    public void setPanelCitas(JPanel panelCitas) {
        this.panelCitas = panelCitas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearCita;
    private javax.swing.JButton btnCrearPersona;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxHora;
    private javax.swing.JComboBox<String> cbxPsicologos;
    private com.toedter.calendar.JDateChooser dtc_FechaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodEmpleado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblTituloCitas;
    private javax.swing.JLabel lbl_codigoempleado;
    private javax.swing.JLabel lblcodigovictima;
    private javax.swing.JPanel panelCitas;
    private javax.swing.JTable tbl_lstCitas;
    private javax.swing.JTextField txt_NombreVictima;
    private javax.swing.JTextField txt_codigoVictima;
    // End of variables declaration//GEN-END:variables
}
