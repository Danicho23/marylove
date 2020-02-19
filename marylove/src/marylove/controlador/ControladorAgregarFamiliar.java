package marylove.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import marylove.vista.VistaAgregarFamiliar;

/**@author AG */
public class ControladorAgregarFamiliar implements ActionListener{
    private VistaAgregarFamiliar vistaAgregarFamiliar;
    private JTable tablaFamiliares;
    String [] data = new String[7];

    public ControladorAgregarFamiliar(VistaAgregarFamiliar vistaAgregarFamiliar, JTable tabla) {
        this.vistaAgregarFamiliar = vistaAgregarFamiliar;
        this.tablaFamiliares = tabla;
        this.vistaAgregarFamiliar.getBtnAgregar().addActionListener(this);
        this.vistaAgregarFamiliar.getBtnCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vistaAgregarFamiliar.getBtnAgregar())){
            if(verifyData()){
                JOptionPane.showMessageDialog(vistaAgregarFamiliar, "Datos registrados");
                addRelative();
                clear();
                vistaAgregarFamiliar.dispose();
            }else{
                JOptionPane.showMessageDialog(vistaAgregarFamiliar, "Por favor llenar todos los campos");
            }
        }
        if(e.getSource().equals(vistaAgregarFamiliar.getBtnCancelar())){
            vistaAgregarFamiliar.dispose();
        }
    }
    
    private boolean verifyData(){
        boolean bandera = true;
        data[0] = vistaAgregarFamiliar.getTxtNombre().getText();
        data[1] = vistaAgregarFamiliar.getTxtApellidos().getText();
        data[2] = vistaAgregarFamiliar.getSpnEdad().getValue().toString();
        data[3] = vistaAgregarFamiliar.getTxtParentesco().getText();
        data[4] = vistaAgregarFamiliar.getCbxInstruccion().getSelectedItem().toString();
        data[5] = vistaAgregarFamiliar.getTxtEscolaridad().getText();
        data[6] = vistaAgregarFamiliar.getTxtOcupacion().getText();
        for(int i=0; i<7; i++){
            System.out.println(data[i]);
            if(data[i].isEmpty()){
                bandera = false;
            }
        }
        return bandera;
    }
    
    private void clear(){
        vistaAgregarFamiliar.getTxtNombre().setText("");
        vistaAgregarFamiliar.getTxtApellidos().setText("");
        vistaAgregarFamiliar.getSpnEdad().setValue(0);
        vistaAgregarFamiliar.getTxtParentesco().setText("");
        vistaAgregarFamiliar.getCbxInstruccion().setSelectedIndex(0);
        vistaAgregarFamiliar.getTxtEscolaridad().setText("");
        vistaAgregarFamiliar.getTxtOcupacion().setText("");
    }
    
    private void addRelative(){
    }
}