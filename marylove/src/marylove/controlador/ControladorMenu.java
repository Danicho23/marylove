package marylove.controlador;
//modificacion Test

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import marylove.vista.FichaEgreso;
import marylove.vista.FichaIngreso;
import marylove.vista.Ficharegistroyreferencia;
import marylove.vista.VistaMenuPrincipal;
import marylove.vista.VistaRegistroLlamada;
import marylove.vista.formularioR1;

public class ControladorMenu implements ActionListener {

    VistaMenuPrincipal vistaPrincipal;
    Ficharegistroyreferencia vistaRegisRef;
    CtrlRegistroReferencia ctrlRegRef;
    VistaRegistroLlamada vrLL;
    formularioR1 Vfr1;
    Controlador_registro_llamadas ctrlLlamadas;

    public ControladorMenu(VistaMenuPrincipal vistaPrincipal, Ficharegistroyreferencia vistaRegisRef, CtrlRegistroReferencia ctrlRegRef, VistaRegistroLlamada vrLL, formularioR1 Vfr1, Controlador_registro_llamadas ctrlLlamadas) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaRegisRef = vistaRegisRef;
//        this.ctrlRegRef = ctrlRegRef;
        this.vrLL = vrLL;
        this.Vfr1 = Vfr1;
        this.ctrlLlamadas = ctrlLlamadas;
    }

    public ControladorMenu(VistaMenuPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.setLocationRelativeTo(null);
        this.vistaPrincipal.getItmIngreso().addActionListener(this);
        this.vistaPrincipal.getItmEgreso().addActionListener(this);

    }

    public void iniciarContrl() {
        abrirVistaMenu();
        salir();
        ctrlRegRef.IniciaCtrlRegistroReferencia();
        ctrlLlamadas.iniciarControlRLL();
        //vistaPrincipal.getItmRegisRefer().addActionListener(e -> abriPanel2(vistaRegisRef.getPnlFRegistroReferencia()));
        vistaPrincipal.getItmLlamada().addActionListener(e -> abriPanel2(vrLL.getPnlLlamadas()));
        vistaPrincipal.getItmFR1().addActionListener(e -> abriPanel2(Vfr1.getPnlfr1()));

    }

    private void abrirVistaMenu() {
        vistaPrincipal.setSize(900, 700);
        vistaPrincipal.setVisible(true);
        vistaPrincipal.setLocationRelativeTo(null);

    }

    public void abrirVistaRegistroRefernce() {
        vistaRegisRef.setVisible(true);
        vistaRegisRef.setLocationRelativeTo(null);
    }

    public void salir() {
        System.out.println("dispouse");
        vistaRegisRef.dispose();
    }

    private void abriPanel2(JPanel panel) {
        panel.setSize(850, 400);
        panel.setLocation(2, 2);
        JScrollPane scrollpane;
        scrollpane = new JScrollPane();
        scrollpane.setBounds(0, 0, 870, 670);
        scrollpane.setViewportView(panel);
        vistaPrincipal.getPnlPrincipal().removeAll();
        vistaPrincipal.getPnlPrincipal().add(scrollpane);
        vistaPrincipal.getPnlPrincipal().revalidate();
        vistaPrincipal.getPnlPrincipal().repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vistaPrincipal.getItmIngreso()) {
            FichaIngreso fichaingreso = new FichaIngreso();
            ControladorFichaIngreso CTRL = new ControladorFichaIngreso(fichaingreso);

        }
        if (e.getSource() == this.vistaPrincipal.getItmEgreso()) {
            FichaEgreso fichaegreso = new FichaEgreso();
ControladorFichaEgreso CTRL1 = new ControladorFichaEgreso(fichaegreso);

        }
    }
}
