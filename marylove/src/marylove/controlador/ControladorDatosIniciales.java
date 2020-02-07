package marylove.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import marylove.vista.VistaDatosIniciales;

/** @author Angel Lucero */
public class ControladorDatosIniciales implements ActionListener{
    private VistaDatosIniciales vistaDatosIniciales;

    public ControladorDatosIniciales(VistaDatosIniciales vistaDatosIniciales) {
        this.vistaDatosIniciales = vistaDatosIniciales;
        addListener();
        setDate();
    }
    
    private void addListener(){
        vistaDatosIniciales.getBtnGuardar().addActionListener(this);
    }
    
    private void setDate(){
        vistaDatosIniciales.getDatFechaIngreso().setDate(getDate());
    }
  
    private Date getDate(){
        Date fecha = new Date();
        return fecha;
    }
    
    public static void main(String args[]) {
        new ControladorDatosIniciales(new VistaDatosIniciales());
    }

    @Override
    public void actionPerformed(ActionEvent arg) {
        if(arg.getSource().equals(vistaDatosIniciales.getBtnGuardar())){
            JOptionPane.showMessageDialog(vistaDatosIniciales, "Se supone que guardará la información");
        }
    }
}
