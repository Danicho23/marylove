package marylove.controlador;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import marylove.DBmodelo.fichaLegalDB;
import marylove.vista.FichaEgreso;
import marylove.vista.V_Menu;
import marylove.vista.vistaCarga;

/**
 *
 * @author vasquez
 */

public class controlAbrir extends Thread {

    private int auxiliar = 0;
    vistaCarga vista = new vistaCarga();
    V_Menu menu = new V_Menu();
    boolean realizado = false;

    public void iniciarControl() {
        abrirVentana();
        formWindowActivated();
    }

    private void abrirVentana() {
        try {
            // ubicacion = new File("/iconos/cargarFuna1.png");
            //String filename = "C:\\Users\\Usuario\\OneDrive\\Documentos\\GitHub\\marylove\\marylove\\src\\iconos\\cargarFunda1.png";
            //vista.getFondo().setIcon(new ImageIcon(filename));
            vista.setVisible(true);
            vista.setLocationRelativeTo(null);
            //no se vea
            vista.getRootPane().setOpaque(false);
            //se pone transparente
            vista.getContentPane().setBackground(new Color(0, 0, 0, 0));
            vista.setBackground(new Color(0, 0, 0, 0));
            vista.setResizable(false);
            //Image imagenInterna = new ImageIcon(getClass().getResource("\\iconos\\cargarFunda1.png")).getImage();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void formWindowActivated() {
        
        if (realizado == false) {
            realizado = true;
            vista.getBarra().setMaximum(49);
            vista.getBarra().setMinimum(0);
            vista.getBarra().setStringPainted(true);
            start();

        }
    }

        FichaEgreso ficha = new FichaEgreso();

        @Override
        public void run() {
            try {
                while (true) {
                    auxiliar++;
                    vista.getBarra().setValue(auxiliar);
                    switch (auxiliar) {
                        case 5:
                            vista.getTexto().setText("cargando sistema....");
                            break;
                        case 20:
                            vista.getTexto().setText("cargando iconos....");
                            break;
                        case 40:
                            vista.getTexto().setText("cargando cargando datos....");
                            break;
                        case 50:
                            vista.getTexto().setText("cargando  ventana....");
                            menu.setVisible(true);
                            menu.setLocationRelativeTo(null);
                            vista.dispose();
                            break;

                    }
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                System.out.println("Error en el carga:" +e);
            }
        
    }
}
