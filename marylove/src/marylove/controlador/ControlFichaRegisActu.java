package marylove.controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import marylove.DBmodelo.CierreDB;
import marylove.DBmodelo.RegisActuacionesDB;
import marylove.DBmodelo.fichaLegalDB;
import marylove.DBmodelo.victimaDB;
import marylove.conexion.Conexion;
import marylove.models.Cierre;
import marylove.models.Register_Actuaciones;
import marylove.vista.FichaRegistroActuaciones;

/**
 *
 * @author vasquez
 */
public class ControlFichaRegisActu extends Validaciones {

    private FichaRegistroActuaciones vFRA;
    private Cierre mC;
    private CierreDB cDB;
    private Register_Actuaciones mRA;
    private RegisActuacionesDB raDB;

    DefaultTableModel modeloTab;
    DefaultTableModel modeloTab2;
    Conexion cx = new Conexion();
    fichaLegalDB fDB = new fichaLegalDB();
    Calendar cal = new GregorianCalendar();

    public ControlFichaRegisActu() {
    }

    public ControlFichaRegisActu(FichaRegistroActuaciones vFRA, Cierre mC, CierreDB cDB, Register_Actuaciones mRA, RegisActuacionesDB raDB) {
        this.vFRA = vFRA;
        this.mC = mC;
        this.cDB = cDB;
        this.mRA = mRA;
        this.raDB = raDB;
    }

    public void iniciarCFichaRegusActu() {
        // mostrar la fecha actual en el a JDateChooser

        vFRA.getFechaRegistroActuaciones().setCalendar(cal);
        vFRA.getJdcRAFechLimite().setCalendar(cal);
        vFRA.getJdcCFechLimite().setCalendar(cal);
        vFRA.getJdcCFechCier().setCalendar(cal);
        // validaciones
        vFRA.getTxtCedula().addKeyListener(validarCedula(vFRA.getTxtCedula()));
        vFRA.getTxtNombre().addKeyListener(validarLetras(vFRA.getTxtNombre()));
        vFRA.getTxtCodigo().addKeyListener(validarNumeros(vFRA.getTxtCodigo()));

        vFRA.getTxtCedula().addKeyListener(enter1(cx, vFRA.getTxtCedula(), vFRA.getTxtNombre(), vFRA.getTxtCodigo()));
        vFRA.getTxtCedula().addKeyListener(enterTabla());
        //control de botones
        vFRA.getBtnAñadirActuacion().addActionListener(e -> visualizarDialog(vFRA.getJdiRegActu()));
        vFRA.getBtnAñadirActuacion().addActionListener(e -> vFRA.getLabRAId().setText("" + raDB.maxID()));
        vFRA.getBtnEditarActuacion().addActionListener(e -> editar(1));
        vFRA.getBtnAñadirCierre().addActionListener(e -> visualizarDialog(vFRA.getJdiCierre()));
        vFRA.getBtnAñadirCierre().addActionListener(e -> vFRA.getLabCId().setText("" + cDB.maxID()));
        vFRA.getBtnEditarCierre().addActionListener(e -> editar(2));

        vFRA.getBtnGuarRA().addActionListener(e -> ingreRegisAct());
        vFRA.getBtnRACanc().addActionListener(e -> borrarDatos(1));
        vFRA.getBtnCGuar().addActionListener(e -> ingreCierre());
        vFRA.getBtnCCanc().addActionListener(e -> borrarDatos(2));

    }

    public Register_Actuaciones datosRA() {
        mRA.setReg_id(Integer.parseInt(vFRA.getLabRAId().getText()));
        mRA.setLegal_id(fDB.obtenerLegal_Id(Integer.parseInt(vFRA.getTxtCodigo().getText())));
        mRA.setNotf_dilig(vFRA.getTxtRANotDil().getText());
        mRA.setFecha_limite(obtenerFecha(vFRA.getJdcRAFechLimite()));
        mRA.setObserv(vFRA.getTxtRAObs().getText());
        return mRA;
    }

    public Cierre datosCierre() {
        mC.setCierre_id(Integer.parseInt(vFRA.getLabCId().getText()));
        mC.setLegal_id(fDB.obtenerLegal_Id(Integer.parseInt(vFRA.getTxtCodigo().getText())));
        mC.setNotifi_dilig(vFRA.getTxtCNotDil().getText());
        mC.setFecha_limite(obtenerFecha(vFRA.getJdcCFechLimite()));
        mC.setObservacion(vFRA.getTxtCObs().getText());
        mC.setFecha_cierre(obtenerFecha(vFRA.getJdcCFechCier()));
        return mC;
    }

    public void ingreRegisAct() {
        if (vFRA.getBtnGuarRA().getText().equals("Editar")) {
            if (raDB.actualizar(datosRA())) {
                vFRA.getJdiRegActu().setVisible(false);
                mostrarTabla(1);
                 borrarDatos(1);
                vFRA.getBtnGuarRA().setText("Guardar");
            } else {
                JOptionPane.showMessageDialog(null, "Datos no actualizados");
            }
        } else {
            if (raDB.ingreRegis_Actu(datosRA())) {
                vFRA.getJdiRegActu().setVisible(false);
                borrarDatos(1);
                mostrarTabla(1);
            } else {
                JOptionPane.showMessageDialog(null, "Datos no ingresar");
            }
        }

    }

    public void ingreCierre() {
        if (vFRA.getBtnCGuar().getText().equals("Editar")) {
            if (cDB.actualizar(datosCierre())) {
                vFRA.getJdiCierre().setVisible(false);
                mostrarTabla(2);
                vFRA.getBtnCGuar().setText("Guardar");
                borrarDatos(2);
            } else {
                JOptionPane.showMessageDialog(null, "Datos no ingresar");
            }
        } else {
            if (cDB.ingreCierre(datosCierre())) {
                vFRA.getJdiCierre().setVisible(false);
                mostrarTabla(2);
                borrarDatos(2);
            } else {
                JOptionPane.showMessageDialog(null, "Datos no ingresar");
            }
        }

    }

    public void visualizarDialog(JDialog dialog) {
        dialog.setVisible(true);
        dialog.setSize(429, 295);
        dialog.setLocationRelativeTo(null);
    }

    public void mostrarTabla(int fun) {
        List<Register_Actuaciones> listAR;
        List<Cierre> listC;
        if (fun == 1) {
            int canFilas = vFRA.getJtTablaActuaciones().getRowCount();
            for (int a = canFilas - 1; a >= 0; a--) {
                modeloTab.removeRow(a);
            }
            modeloTab = (DefaultTableModel) vFRA.getJtTablaActuaciones().getModel();
            listAR = raDB.obtenerRegisAct(Integer.parseInt(vFRA.getTxtCodigo().getText()));
            int columnas = modeloTab.getColumnCount();
            for (int i = 0; i < listAR.size(); i++) {
                modeloTab.addRow(new Object[columnas]);
                vFRA.getJtTablaActuaciones().setValueAt(listAR.get(i).getReg_id(), i, 0);
                vFRA.getJtTablaActuaciones().setValueAt(listAR.get(i).getNotf_dilig(), i, 1);
                vFRA.getJtTablaActuaciones().setValueAt(listAR.get(i).getFecha_limite(), i, 2);
                vFRA.getJtTablaActuaciones().setValueAt(listAR.get(i).getObserv(), i, 3);
            }
        } else if (fun == 2) {
            int canFilas2 = vFRA.getJtTablaCierre().getRowCount();
            for (int a = canFilas2 - 1; a >= 0; a--) {
                modeloTab2.removeRow(a);
            }
            modeloTab2 = (DefaultTableModel) vFRA.getJtTablaCierre().getModel();
            listC = cDB.obtenerCierre(Integer.parseInt(vFRA.getTxtCodigo().getText()));

            int columnas2 = modeloTab2.getColumnCount();
            for (int j = 0; j < listC.size(); j++) {
                modeloTab2.addRow(new Object[columnas2]);
                vFRA.getJtTablaCierre().setValueAt(listC.get(j).getCierre_id(), j, 0);
                vFRA.getJtTablaCierre().setValueAt(listC.get(j).getNotifi_dilig(), j, 1);
                vFRA.getJtTablaCierre().setValueAt(listC.get(j).getFecha_limite(), j, 2);
                vFRA.getJtTablaCierre().setValueAt(listC.get(j).getObservacion(), j, 3);
                vFRA.getJtTablaCierre().setValueAt(listC.get(j).getFecha_cierre(), j, 4);
            }
        }

        try {

        } catch (Exception e) {
            System.out.println("error al cargar tablas " + e.getMessage());
        }

    }

    public void editar(int edit) {
        if (edit == 1) {
            DefaultTableModel moTablaRA = (DefaultTableModel) vFRA.getJtTablaActuaciones().getModel();
            int fsel = vFRA.getJtTablaActuaciones().getSelectedRow();
            if (fsel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila lista", "Verificación", JOptionPane.WARNING_MESSAGE);
            } else {
                vFRA.getLabRAId().setText(moTablaRA.getValueAt(vFRA.getJtTablaActuaciones().getSelectedRow(), 0).toString());
                vFRA.getTxtRANotDil().setText(moTablaRA.getValueAt(vFRA.getJtTablaActuaciones().getSelectedRow(), 1).toString());
                ingreDATE(vFRA.getJdcRAFechLimite(), moTablaRA.getValueAt(vFRA.getJtTablaActuaciones().getSelectedRow(), 2).toString());
                vFRA.getTxtRAObs().setText(moTablaRA.getValueAt(vFRA.getJtTablaActuaciones().getSelectedRow(), 3).toString());
                vFRA.getBtnGuarRA().setText("Editar");
                visualizarDialog(vFRA.getJdiRegActu());
            }
        } else if (edit == 2) {
            DefaultTableModel moTablaC = (DefaultTableModel) vFRA.getJtTablaCierre().getModel();
            int fsel = vFRA.getJtTablaCierre().getSelectedRow();
            if (fsel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila lista", "Verificación", JOptionPane.WARNING_MESSAGE);
            } else {
                vFRA.getLabCId().setText(moTablaC.getValueAt(vFRA.getJtTablaCierre().getSelectedRow(), 0).toString());
                vFRA.getTxtCNotDil().setText(moTablaC.getValueAt(vFRA.getJtTablaCierre().getSelectedRow(), 1).toString());
                ingreDATE(vFRA.getJdcCFechLimite(), moTablaC.getValueAt(vFRA.getJtTablaCierre().getSelectedRow(), 2).toString());
                vFRA.getTxtCObs().setText(moTablaC.getValueAt(vFRA.getJtTablaCierre().getSelectedRow(), 3).toString());
                ingreDATE(vFRA.getJdcCFechCier(), moTablaC.getValueAt(vFRA.getJtTablaCierre().getSelectedRow(), 4).toString());
                vFRA.getBtnCGuar().setText("Editar");
                visualizarDialog(vFRA.getJdiCierre());
            }
        }

    }

    public void borrarDatos(int att) {
        if (att == 1) {
            vFRA.getTxtRANotDil().setText("");
            vFRA.getTxtRAObs().setText("");
            vFRA.getJdcRAFechLimite().setCalendar(cal);

        } else if (att == 1) {
            vFRA.getTxtCNotDil().setText("");
            vFRA.getTxtCObs().setText("");
            vFRA.getJdcCFechLimite().setCalendar(cal);
            vFRA.getJdcCFechCier().setCalendar(cal);
        }
    }

    public KeyListener enterTabla() { // al hacer un enter realizar una acción 
        KeyListener kn = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                victimaDB vDB = new victimaDB();
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!vFRA.getTxtCodigo().getText().equals("")) {
                        mostrarTabla(1);
                        mostrarTabla(2);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        return kn;
    }

}