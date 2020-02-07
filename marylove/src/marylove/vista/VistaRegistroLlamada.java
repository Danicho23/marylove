package marylove.vista;

import com.toedter.calendar.JDateChooser;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* @author Angel Lucero */

public class VistaRegistroLlamada extends javax.swing.JFrame {
    public VistaRegistroLlamada() {
          initComponents();
          this.setVisible(true);
          this.setLocationRelativeTo(null);
         
    }
    
    

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JCheckBox getCbAbortos() {
        return cbAbortos;
    }

    public void setCbAbortos(JCheckBox cbAbortos) {
        this.cbAbortos = cbAbortos;
    }

    public JCheckBox getCbAbusoSexual() {
        return cbAbusoSexual;
    }

    public void setCbAbusoSexual(JCheckBox cbAbusoSexual) {
        this.cbAbusoSexual = cbAbusoSexual;
    }

    public JCheckBox getCbAccesoriaLegal() {
        return cbAccesoriaLegal;
    }

    public void setCbAccesoriaLegal(JCheckBox cbAccesoriaLegal) {
        this.cbAccesoriaLegal = cbAccesoriaLegal;
    }

    public JCheckBox getCbAlcolismo() {
        return cbAlcolismo;
    }

    public void setCbAlcolismo(JCheckBox cbAlcolismo) {
        this.cbAlcolismo = cbAlcolismo;
    }

    public JCheckBox getCbAlivioyApoyo() {
        return cbAlivioyApoyo;
    }

    public void setCbAlivioyApoyo(JCheckBox cbAlivioyApoyo) {
        this.cbAlivioyApoyo = cbAlivioyApoyo;
    }

    public JCheckBox getCbAlt_Nerviosas() {
        return cbAlt_Nerviosas;
    }

    public void setCbAlt_Nerviosas(JCheckBox cbAlt_Nerviosas) {
        this.cbAlt_Nerviosas = cbAlt_Nerviosas;
    }

    public JCheckBox getCbAnsiosa() {
        return cbAnsiosa;
    }

    public void setCbAnsiosa(JCheckBox cbAnsiosa) {
        this.cbAnsiosa = cbAnsiosa;
    }

    public JCheckBox getCbAsustada() {
        return cbAsustada;
    }

    public void setCbAsustada(JCheckBox cbAsustada) {
        this.cbAsustada = cbAsustada;
    }

    public JCheckBox getCbAtencionPsicologica() {
        return cbAtencionPsicologica;
    }

    public void setCbAtencionPsicologica(JCheckBox cbAtencionPsicologica) {
        this.cbAtencionPsicologica = cbAtencionPsicologica;
    }

    public JCheckBox getCbBajaAutoestima() {
        return cbBajaAutoestima;
    }

    public void setCbBajaAutoestima(JCheckBox cbBajaAutoestima) {
        this.cbBajaAutoestima = cbBajaAutoestima;
    }

    public JCheckBox getCbCelos() {
        return cbCelos;
    }

    public void setCbCelos(JCheckBox cbCelos) {
        this.cbCelos = cbCelos;
    }

    public JCheckBox getCbContagiosETS() {
        return cbContagiosETS;
    }

    public void setCbContagiosETS(JCheckBox cbContagiosETS) {
        this.cbContagiosETS = cbContagiosETS;
    }

    public JCheckBox getCbDepresion() {
        return cbDepresion;
    }

    public void setCbDepresion(JCheckBox cbDepresion) {
        this.cbDepresion = cbDepresion;
    }

    public JCheckBox getCbDesempleo() {
        return cbDesempleo;
    }

    public void setCbDesempleo(JCheckBox cbDesempleo) {
        this.cbDesempleo = cbDesempleo;
    }

    public JCheckBox getCbEconomica() {
        return cbEconomica;
    }

    public void setCbEconomica(JCheckBox cbEconomica) {
        this.cbEconomica = cbEconomica;
    }

    public JCheckBox getCbEmbarazoNoDeseado() {
        return cbEmbarazoNoDeseado;
    }

    public void setCbEmbarazoNoDeseado(JCheckBox cbEmbarazoNoDeseado) {
        this.cbEmbarazoNoDeseado = cbEmbarazoNoDeseado;
    }

    public JCheckBox getCbEnojada() {
        return cbEnojada;
    }

    public void setCbEnojada(JCheckBox cbEnojada) {
        this.cbEnojada = cbEnojada;
    }

    public JCheckBox getCbEsposo() {
        return cbEsposo;
    }

    public void setCbEsposo(JCheckBox cbEsposo) {
        this.cbEsposo = cbEsposo;
    }

    public JCheckBox getCbExPareja() {
        return cbExPareja;
    }

    public void setCbExPareja(JCheckBox cbExPareja) {
        this.cbExPareja = cbExPareja;
    }

    public JCheckBox getCbFisica() {
        return cbFisica;
    }

    public void setCbFisica(JCheckBox cbFisica) {
        this.cbFisica = cbFisica;
    }

    public JCheckBox getCbFracturas() {
        return cbFracturas;
    }

    public void setCbFracturas(JCheckBox cbFracturas) {
        this.cbFracturas = cbFracturas;
    }

    public JComboBox<String> getCbFrecuenciaAgresion() {
        return cbFrecuenciaAgresion;
    }

    public void setCbFrecuenciaAgresion(JComboBox<String> cbFrecuenciaAgresion) {
        this.cbFrecuenciaAgresion = cbFrecuenciaAgresion;
    }

    public JComboBox<String> getCbHabla() {
        return cbHabla;
    }

    public void setCbHabla(JComboBox<String> cbHabla) {
        this.cbHabla = cbHabla;
    }

    public JCheckBox getCbHeridas() {
        return cbHeridas;
    }

    public void setCbHeridas(JCheckBox cbHeridas) {
        this.cbHeridas = cbHeridas;
    }

    public JCheckBox getCbHijo() {
        return cbHijo;
    }

    public void setCbHijo(JCheckBox cbHijo) {
        this.cbHijo = cbHijo;
    }

    public JCheckBox getCbInfidelidad() {
        return cbInfidelidad;
    }

    public void setCbInfidelidad(JCheckBox cbInfidelidad) {
        this.cbInfidelidad = cbInfidelidad;
    }

    public JCheckBox getCbInformacionCasadeAcojida() {
        return cbInformacionCasadeAcojida;
    }

    public void setCbInformacionCasadeAcojida(JCheckBox cbInformacionCasadeAcojida) {
        this.cbInformacionCasadeAcojida = cbInformacionCasadeAcojida;
    }

    public JCheckBox getCbInformacionOtrasInstituciones() {
        return cbInformacionOtrasInstituciones;
    }

    public void setCbInformacionOtrasInstituciones(JCheckBox cbInformacionOtrasInstituciones) {
        this.cbInformacionOtrasInstituciones = cbInformacionOtrasInstituciones;
    }

    public JCheckBox getCbIntentoSuicidio() {
        return cbIntentoSuicidio;
    }

    public void setCbIntentoSuicidio(JCheckBox cbIntentoSuicidio) {
        this.cbIntentoSuicidio = cbIntentoSuicidio;
    }

    public JCheckBox getCbJefe() {
        return cbJefe;
    }

    public void setCbJefe(JCheckBox cbJefe) {
        this.cbJefe = cbJefe;
    }

    public JComboBox<String> getCbJornada() {
        return cbJornada;
    }

    public void setCbJornada(JComboBox<String> cbJornada) {
        this.cbJornada = cbJornada;
    }

    public JCheckBox getCbLaboral() {
        return cbLaboral;
    }

    public void setCbLaboral(JCheckBox cbLaboral) {
        this.cbLaboral = cbLaboral;
    }

    public JCheckBox getCbLlorosa() {
        return cbLlorosa;
    }

    public void setCbLlorosa(JCheckBox cbLlorosa) {
        this.cbLlorosa = cbLlorosa;
    }

    public JCheckBox getCbMachismo() {
        return cbMachismo;
    }

    public void setCbMachismo(JCheckBox cbMachismo) {
        this.cbMachismo = cbMachismo;
    }

    public JCheckBox getCbMigracion() {
        return cbMigracion;
    }

    public void setCbMigracion(JCheckBox cbMigracion) {
        this.cbMigracion = cbMigracion;
    }

    public JCheckBox getCbMoretones() {
        return cbMoretones;
    }

    public void setCbMoretones(JCheckBox cbMoretones) {
        this.cbMoretones = cbMoretones;
    }

    public JComboBox<String> getCbNacionalidadAgresor() {
        return cbNacionalidadAgresor;
    }

    public void setCbNacionalidadAgresor(JComboBox<String> cbNacionalidadAgresor) {
        this.cbNacionalidadAgresor = cbNacionalidadAgresor;
    }

    public JCheckBox getCbNegligencia() {
        return cbNegligencia;
    }

    public void setCbNegligencia(JCheckBox cbNegligencia) {
        this.cbNegligencia = cbNegligencia;
    }

    public JCheckBox getCbNerviosa() {
        return cbNerviosa;
    }

    public void setCbNerviosa(JCheckBox cbNerviosa) {
        this.cbNerviosa = cbNerviosa;
    }

    public JCheckBox getCbNoReporta() {
        return cbNoReporta;
    }

    public void setCbNoReporta(JCheckBox cbNoReporta) {
        this.cbNoReporta = cbNoReporta;
    }

    public JCheckBox getCbNoReportaConcecuenciasFisicas() {
        return cbNoReportaConcecuenciasFisicas;
    }

    public void setCbNoReportaConcecuenciasFisicas(JCheckBox cbNoReportaConcecuenciasFisicas) {
        this.cbNoReportaConcecuenciasFisicas = cbNoReportaConcecuenciasFisicas;
    }

    public JCheckBox getCbNoReportaFactoresRiesgo() {
        return cbNoReportaFactoresRiesgo;
    }

    public void setCbNoReportaFactoresRiesgo(JCheckBox cbNoReportaFactoresRiesgo) {
        this.cbNoReportaFactoresRiesgo = cbNoReportaFactoresRiesgo;
    }

    public JCheckBox getCbNoReportaQuienEsElAgresor() {
        return cbNoReportaQuienEsElAgresor;
    }

    public void setCbNoReportaQuienEsElAgresor(JCheckBox cbNoReportaQuienEsElAgresor) {
        this.cbNoReportaQuienEsElAgresor = cbNoReportaQuienEsElAgresor;
    }

    public JCheckBox getCbNoReportaTipoViolencia() {
        return cbNoReportaTipoViolencia;
    }

    public void setCbNoReportaTipoViolencia(JCheckBox cbNoReportaTipoViolencia) {
        this.cbNoReportaTipoViolencia = cbNoReportaTipoViolencia;
    }

    public JCheckBox getCbNovio() {
        return cbNovio;
    }

    public void setCbNovio(JCheckBox cbNovio) {
        this.cbNovio = cbNovio;
    }

    public JCheckBox getCbPadre_Madre() {
        return cbPadre_Madre;
    }

    public void setCbPadre_Madre(JCheckBox cbPadre_Madre) {
        this.cbPadre_Madre = cbPadre_Madre;
    }

    public JCheckBox getCbPsicologica() {
        return cbPsicologica;
    }

    public void setCbPsicologica(JCheckBox cbPsicologica) {
        this.cbPsicologica = cbPsicologica;
    }

    public JComboBox<String> getCbReultados() {
        return cbReultados;
    }

    public void setCbReultados(JComboBox<String> cbReultados) {
        this.cbReultados = cbReultados;
    }

    public JCheckBox getCbTranquila() {
        return cbTranquila;
    }

    public void setCbTranquila(JCheckBox cbTranquila) {
        this.cbTranquila = cbTranquila;
    }

    public JCheckBox getCbViolacion() {
        return cbViolacion;
    }

    public void setCbViolacion(JCheckBox cbViolacion) {
        this.cbViolacion = cbViolacion;
    }

    public JCheckBox getCbViolenciaInstitucional() {
        return cbViolenciaInstitucional;
    }

    public void setCbViolenciaInstitucional(JCheckBox cbViolenciaInstitucional) {
        this.cbViolenciaInstitucional = cbViolenciaInstitucional;
    }

    public JCheckBox getCbViolenciaIntrafamiliar() {
        return cbViolenciaIntrafamiliar;
    }

    public void setCbViolenciaIntrafamiliar(JCheckBox cbViolenciaIntrafamiliar) {
        this.cbViolenciaIntrafamiliar = cbViolenciaIntrafamiliar;
    }

    public JCheckBox getCbViolenciaSocial() {
        return cbViolenciaSocial;
    }

    public void setCbViolenciaSocial(JCheckBox cbViolenciaSocial) {
        this.cbViolenciaSocial = cbViolenciaSocial;
    }

    public JComboBox<String> getCbVoz() {
        return cbVoz;
    }

    public void setCbVoz(JComboBox<String> cbVoz) {
        this.cbVoz = cbVoz;
    }

    public JComboBox<String> getCbxEstadoCivilVictima() {
        return cbxEstadoCivilVictima;
    }

    public void setCbxEstadoCivilVictima(JComboBox<String> cbxEstadoCivilVictima) {
        this.cbxEstadoCivilVictima = cbxEstadoCivilVictima;
    }

    public JComboBox<String> getCbxPrioridad() {
        return cbxPrioridad;
    }

    public void setCbxPrioridad(JComboBox<String> cbxPrioridad) {
        this.cbxPrioridad = cbxPrioridad;
    }

    public JDateChooser getDatFechaLlamada() {
        return datFechaLlamada;
    }

    public void setDatFechaLlamada(JDateChooser datFechaLlamada) {
        this.datFechaLlamada = datFechaLlamada;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JDialog getjDialog1() {
        return jDialog1;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.jDialog1 = jDialog1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel30() {
        return jLabel30;
    }

    public void setjLabel30(JLabel jLabel30) {
        this.jLabel30 = jLabel30;
    }

    public JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public JLabel getjLabel34() {
        return jLabel34;
    }

    public void setjLabel34(JLabel jLabel34) {
        this.jLabel34 = jLabel34;
    }

    public JLabel getjLabel35() {
        return jLabel35;
    }

    public void setjLabel35(JLabel jLabel35) {
        this.jLabel35 = jLabel35;
    }

    public JLabel getjLabel39() {
        return jLabel39;
    }

    public void setjLabel39(JLabel jLabel39) {
        this.jLabel39 = jLabel39;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel40() {
        return jLabel40;
    }

    public JComboBox<String> getCbnacionalidadVictima() {
        return cbnacionalidadVictima;
    }

    public void setCbnacionalidadVictima(JComboBox<String> cbnacionalidadVictima) {
        this.cbnacionalidadVictima = cbnacionalidadVictima;
    }

   

    public void setjLabel40(JLabel jLabel40) {
        this.jLabel40 = jLabel40;
    }

    public JLabel getjLabel41() {
        return jLabel41;
    }

    public void setjLabel41(JLabel jLabel41) {
        this.jLabel41 = jLabel41;
    }

    public JLabel getjLabel42() {
        return jLabel42;
    }

    public void setjLabel42(JLabel jLabel42) {
        this.jLabel42 = jLabel42;
    }

    public JLabel getjLabel43() {
        return jLabel43;
    }

    public void setjLabel43(JLabel jLabel43) {
        this.jLabel43 = jLabel43;
    }

    public JLabel getjLabel44() {
        return jLabel44;
    }

    public void setjLabel44(JLabel jLabel44) {
        this.jLabel44 = jLabel44;
    }

    public JLabel getjLabel45() {
        return jLabel45;
    }

    public void setjLabel45(JLabel jLabel45) {
        this.jLabel45 = jLabel45;
    }

    public JLabel getjLabel46() {
        return jLabel46;
    }

    public void setjLabel46(JLabel jLabel46) {
        this.jLabel46 = jLabel46;
    }

    public JLabel getjLabel47() {
        return jLabel47;
    }

    public void setjLabel47(JLabel jLabel47) {
        this.jLabel47 = jLabel47;
    }

    public JLabel getjLabel48() {
        return jLabel48;
    }

    public void setjLabel48(JLabel jLabel48) {
        this.jLabel48 = jLabel48;
    }

    public JLabel getjLabel49() {
        return jLabel49;
    }

    public void setjLabel49(JLabel jLabel49) {
        this.jLabel49 = jLabel49;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel50() {
        return jLabel50;
    }

    public void setjLabel50(JLabel jLabel50) {
        this.jLabel50 = jLabel50;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel14() {
        return jPanel14;
    }

    public void setjPanel14(JPanel jPanel14) {
        this.jPanel14 = jPanel14;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JRadioButton getjRadioButton7() {
        return jRadioButton7;
    }

    public void setjRadioButton7(JRadioButton jRadioButton7) {
        this.jRadioButton7 = jRadioButton7;
    }

    public JRadioButton getjRadioButton8() {
        return jRadioButton8;
    }

    public void setjRadioButton8(JRadioButton jRadioButton8) {
        this.jRadioButton8 = jRadioButton8;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTabbedPane getjTabbedPane2() {
        return jTabbedPane2;
    }

    public void setjTabbedPane2(JTabbedPane jTabbedPane2) {
        this.jTabbedPane2 = jTabbedPane2;
    }

    public JTextField getjTextField11() {
        return jTextField11;
    }

    public void setjTextField11(JTextField jTextField11) {
        this.jTextField11 = jTextField11;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public void setjTextField6(JTextField jTextField6) {
        this.jTextField6 = jTextField6;
    }

    public JPanel getPnlCaracteristicas() {
        return pnlCaracteristicas;
    }

    public void setPnlCaracteristicas(JPanel pnlCaracteristicas) {
        this.pnlCaracteristicas = pnlCaracteristicas;
    }

    public JPanel getPnlDatos() {
        return pnlDatos;
    }

    public void setPnlDatos(JPanel pnlDatos) {
        this.pnlDatos = pnlDatos;
    }

    public JPanel getPnlEstado() {
        return pnlEstado;
    }

    public void setPnlEstado(JPanel pnlEstado) {
        this.pnlEstado = pnlEstado;
    }

    public JPanel getPnlLlamadas() {
        return pnlLlamadas;
    }

    public void setPnlLlamadas(JPanel pnlLlamadas) {
        this.pnlLlamadas = pnlLlamadas;
    }

    public JPanel getPnlMotivo() {
        return pnlMotivo;
    }

    public void setPnlMotivo(JPanel pnlMotivo) {
        this.pnlMotivo = pnlMotivo;
    }

    public JPanel getPnlNotas() {
        return pnlNotas;
    }

    public void setPnlNotas(JPanel pnlNotas) {
        this.pnlNotas = pnlNotas;
    }

    public JPanel getPnlReferencia() {
        return pnlReferencia;
    }

    public void setPnlReferencia(JPanel pnlReferencia) {
        this.pnlReferencia = pnlReferencia;
    }

    public JPanel getPnlResultados() {
        return pnlResultados;
    }

    public void setPnlResultados(JPanel pnlResultados) {
        this.pnlResultados = pnlResultados;
    }

    public JRadioButton getRbHijosNo() {
        return rbHijosNo;
    }

    public void setRbHijosNo(JRadioButton rbHijosNo) {
        this.rbHijosNo = rbHijosNo;
    }

    public JRadioButton getRbHijosNoReporta() {
        return rbHijosNoReporta;
    }

    public void setRbHijosNoReporta(JRadioButton rbHijosNoReporta) {
        this.rbHijosNoReporta = rbHijosNoReporta;
    }

    public JRadioButton getRbHijosSi() {
        return rbHijosSi;
    }

    public void setRbHijosSi(JRadioButton rbHijosSi) {
        this.rbHijosSi = rbHijosSi;
    }

    public JRadioButton getRbTrabajaNoReporta() {
        return rbTrabajaNoReporta;
    }

    public void setRbTrabajaNoReporta(JRadioButton rbTrabajaNoReporta) {
        this.rbTrabajaNoReporta = rbTrabajaNoReporta;
    }

    public JRadioButton getRbTrabajaSi() {
        return rbTrabajaSi;
    }

    public void setRbTrabajaSi(JRadioButton rbTrabajaSi) {
        this.rbTrabajaSi = rbTrabajaSi;
    }

    public JRadioButton getRbTrabajoNo() {
        return rbTrabajoNo;
    }

    public void setRbTrabajoNo(JRadioButton rbTrabajoNo) {
        this.rbTrabajoNo = rbTrabajoNo;
    }

    public JSpinner getSpnEdadVictima() {
        return spnEdadVictima;
    }

    public void setSpnEdadVictima(JSpinner spnEdadVictima) {
        this.spnEdadVictima = spnEdadVictima;
    }

    public JSpinner getSpnNumeroHijos() {
        return spnNumeroHijos;
    }

    public void setSpnNumeroHijos(JSpinner spnNumeroHijos) {
        this.spnNumeroHijos = spnNumeroHijos;
    }

    public JTextField getTxtApellidoVictima() {
        return txtApellidoVictima;
    }

    public void setTxtApellidoVictima(JTextField txtApellidoVictima) {
        this.txtApellidoVictima = txtApellidoVictima;
    }

    public JTextField getTxtComoSupoLineaTelfonica() {
        return txtComoSupoLineaTelfonica;
    }

    public void setTxtComoSupoLineaTelfonica(JTextField txtComoSupoLineaTelfonica) {
        this.txtComoSupoLineaTelfonica = txtComoSupoLineaTelfonica;
    }

    public JTextField getTxtDireccionVictima() {
        return txtDireccionVictima;
    }

    public void setTxtDireccionVictima(JTextField txtDireccionVictima) {
        this.txtDireccionVictima = txtDireccionVictima;
    }

    public JTextField getTxtNombreVictima() {
        return txtNombreVictima;
    }

    public void setTxtNombreVictima(JTextField txtNombreVictima) {
        this.txtNombreVictima = txtNombreVictima;
    }

    public JTextArea getTxtNotasAdicionalesVictima() {
        return txtNotasAdicionalesVictima;
    }

    public void setTxtNotasAdicionalesVictima(JTextArea txtNotasAdicionalesVictima) {
        this.txtNotasAdicionalesVictima = txtNotasAdicionalesVictima;
    }

    public JTextField getTxtOperador() {
        return txtOperador;
    }

    public void setTxtOperador(JTextField txtOperador) {
        this.txtOperador = txtOperador;
    }

    public JTextField getTxtOtroConsecienciasFisicas() {
        return txtOtroConsecienciasFisicas;
    }

    public void setTxtOtroConsecienciasFisicas(JTextField txtOtroConsecienciasFisicas) {
        this.txtOtroConsecienciasFisicas = txtOtroConsecienciasFisicas;
    }

    public JTextField getTxtOtrosFactoresRiesgo() {
        return txtOtrosFactoresRiesgo;
    }

    public void setTxtOtrosFactoresRiesgo(JTextField txtOtrosFactoresRiesgo) {
        this.txtOtrosFactoresRiesgo = txtOtrosFactoresRiesgo;
    }

    public JTextField getTxtOtrosMotivoLlamada() {
        return txtOtrosMotivoLlamada;
    }

    public void setTxtOtrosMotivoLlamada(JTextField txtOtrosMotivoLlamada) {
        this.txtOtrosMotivoLlamada = txtOtrosMotivoLlamada;
    }

    public JTextField getTxtOtrosQuienEsElAgresor() {
        return txtOtrosQuienEsElAgresor;
    }

    public void setTxtOtrosQuienEsElAgresor(JTextField txtOtrosQuienEsElAgresor) {
        this.txtOtrosQuienEsElAgresor = txtOtrosQuienEsElAgresor;
    }

    public JTextField getTxtOtrosResultado() {
        return txtOtrosResultado;
    }

    public void setTxtOtrosResultado(JTextField txtOtrosResultado) {
        this.txtOtrosResultado = txtOtrosResultado;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public boolean isRootPaneCheckingEnabled() {
        return rootPaneCheckingEnabled;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        pnlLlamadas = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pnlMotivo = new javax.swing.JPanel();
        cbViolacion = new javax.swing.JCheckBox();
        cbAccesoriaLegal = new javax.swing.JCheckBox();
        cbIntentoSuicidio = new javax.swing.JCheckBox();
        cbNoReporta = new javax.swing.JCheckBox();
        cbInformacionOtrasInstituciones = new javax.swing.JCheckBox();
        cbAtencionPsicologica = new javax.swing.JCheckBox();
        cbViolenciaSocial = new javax.swing.JCheckBox();
        cbAbusoSexual = new javax.swing.JCheckBox();
        cbViolenciaIntrafamiliar = new javax.swing.JCheckBox();
        cbViolenciaInstitucional = new javax.swing.JCheckBox();
        cbAlivioyApoyo = new javax.swing.JCheckBox();
        cbInformacionCasadeAcojida = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        txtOtrosMotivoLlamada = new javax.swing.JTextField();
        pnlEstado = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cbAnsiosa = new javax.swing.JCheckBox();
        cbTranquila = new javax.swing.JCheckBox();
        cbLlorosa = new javax.swing.JCheckBox();
        cbAsustada = new javax.swing.JCheckBox();
        cbNerviosa = new javax.swing.JCheckBox();
        cbEnojada = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        cbHabla = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cbVoz = new javax.swing.JComboBox<>();
        pnlNotas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNotasAdicionalesVictima = new javax.swing.JTextArea();
        pnlCaracteristicas = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cbFisica = new javax.swing.JCheckBox();
        cbPsicologica = new javax.swing.JCheckBox();
        cbLaboral = new javax.swing.JCheckBox();
        cbEconomica = new javax.swing.JCheckBox();
        cbNegligencia = new javax.swing.JCheckBox();
        cbNoReportaTipoViolencia = new javax.swing.JCheckBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cbFrecuenciaAgresion = new javax.swing.JComboBox<>();
        cbEsposo = new javax.swing.JCheckBox();
        cbJefe = new javax.swing.JCheckBox();
        txtOtrosQuienEsElAgresor = new javax.swing.JTextField();
        cbPadre_Madre = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        cbNoReportaQuienEsElAgresor = new javax.swing.JCheckBox();
        cbNovio = new javax.swing.JCheckBox();
        cbExPareja = new javax.swing.JCheckBox();
        cbHijo = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cbAlcolismo = new javax.swing.JCheckBox();
        cbMachismo = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        cbMigracion = new javax.swing.JCheckBox();
        txtOtrosFactoresRiesgo = new javax.swing.JTextField();
        cbNoReportaFactoresRiesgo = new javax.swing.JCheckBox();
        cbCelos = new javax.swing.JCheckBox();
        cbDesempleo = new javax.swing.JCheckBox();
        cbInfidelidad = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        cbFracturas = new javax.swing.JCheckBox();
        cbMoretones = new javax.swing.JCheckBox();
        cbHeridas = new javax.swing.JCheckBox();
        cbDepresion = new javax.swing.JCheckBox();
        cbBajaAutoestima = new javax.swing.JCheckBox();
        cbAlt_Nerviosas = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        txtOtroConsecienciasFisicas = new javax.swing.JTextField();
        cbNoReportaConcecuenciasFisicas = new javax.swing.JCheckBox();
        cbAbortos = new javax.swing.JCheckBox();
        cbContagiosETS = new javax.swing.JCheckBox();
        cbEmbarazoNoDeseado = new javax.swing.JCheckBox();
        cbNacionalidadAgresor = new javax.swing.JComboBox<>();
        pnlResultados = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        cbReultados = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtOtrosResultado = new javax.swing.JTextField();
        pnlReferencia = new javax.swing.JPanel();
        txtComoSupoLineaTelfonica = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtNombreVictima = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        spnEdadVictima = new javax.swing.JSpinner();
        jLabel47 = new javax.swing.JLabel();
        cbxEstadoCivilVictima = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        txtDireccionVictima = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        rbHijosSi = new javax.swing.JRadioButton();
        rbHijosNo = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        rbTrabajaSi = new javax.swing.JRadioButton();
        rbTrabajoNo = new javax.swing.JRadioButton();
        spnNumeroHijos = new javax.swing.JSpinner();
        rbHijosNoReporta = new javax.swing.JRadioButton();
        rbTrabajaNoReporta = new javax.swing.JRadioButton();
        txtApellidoVictima = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbnacionalidadVictima = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cbxPrioridad = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        datFechaLlamada = new com.toedter.calendar.JDateChooser();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbJornada = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de llamadas");
        setResizable(false);

        pnlLlamadas.setToolTipText("Mañana\nTarde\nNoche");

        cbViolacion.setText("Violación");

        cbAccesoriaLegal.setText("Accesoría legal");

        cbIntentoSuicidio.setText("Intento de sucidio");

        cbNoReporta.setText("No reporta");

        cbInformacionOtrasInstituciones.setText("Información sobre otras instituciones");

        cbAtencionPsicologica.setText("Atención psicológica");

        cbViolenciaSocial.setText("Violencia social");

        cbAbusoSexual.setText("Abuso sexual");

        cbViolenciaIntrafamiliar.setText("Violencia intrafamiliar");

        cbViolenciaInstitucional.setText("Violencia institucional");

        cbAlivioyApoyo.setText("Alivio y apoyo");

        cbInformacionCasadeAcojida.setText("Información sobre la casa de acogida");

        jLabel16.setText("Otros:");

        javax.swing.GroupLayout pnlMotivoLayout = new javax.swing.GroupLayout(pnlMotivo);
        pnlMotivo.setLayout(pnlMotivoLayout);
        pnlMotivoLayout.setHorizontalGroup(
            pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMotivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMotivoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOtrosMotivoLlamada))
                    .addComponent(cbViolenciaIntrafamiliar)
                    .addComponent(cbViolenciaInstitucional)
                    .addComponent(cbAlivioyApoyo)
                    .addComponent(cbInformacionCasadeAcojida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addGroup(pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAbusoSexual)
                    .addComponent(cbViolenciaSocial)
                    .addComponent(cbAtencionPsicologica)
                    .addComponent(cbInformacionOtrasInstituciones))
                .addGap(34, 34, 34)
                .addGroup(pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbNoReporta)
                    .addComponent(cbViolacion)
                    .addComponent(cbAccesoriaLegal)
                    .addComponent(cbIntentoSuicidio))
                .addContainerGap())
        );
        pnlMotivoLayout.setVerticalGroup(
            pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMotivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbViolenciaIntrafamiliar)
                    .addComponent(cbAbusoSexual)
                    .addComponent(cbViolacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbViolenciaInstitucional)
                    .addComponent(cbViolenciaSocial)
                    .addComponent(cbAccesoriaLegal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlivioyApoyo)
                    .addComponent(cbAtencionPsicologica)
                    .addComponent(cbIntentoSuicidio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbInformacionCasadeAcojida)
                    .addComponent(cbInformacionOtrasInstituciones)
                    .addComponent(cbNoReporta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMotivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtOtrosMotivoLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("MOTIVO DE LA LLAMADA", pnlMotivo);

        jLabel18.setText("Emociones:");

        cbAnsiosa.setText("Ansiosa");

        cbTranquila.setText("Tranquila");

        cbLlorosa.setText("Llorosa");

        cbAsustada.setText("Asustada");

        cbNerviosa.setText("Nerviosa");

        cbEnojada.setText("Enojada");

        jLabel19.setText("Habla:");

        cbHabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Mucho", "Poco", "Nada" }));

        jLabel20.setText("Voz:");

        cbVoz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Susurro", "Grita" }));

        javax.swing.GroupLayout pnlEstadoLayout = new javax.swing.GroupLayout(pnlEstado);
        pnlEstado.setLayout(pnlEstadoLayout);
        pnlEstadoLayout.setHorizontalGroup(
            pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAnsiosa)
                    .addComponent(cbAsustada)
                    .addComponent(cbNerviosa))
                .addGap(18, 18, 18)
                .addGroup(pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstadoLayout.createSequentialGroup()
                        .addComponent(cbTranquila)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHabla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(cbVoz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEstadoLayout.createSequentialGroup()
                        .addGroup(pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEnojada)
                            .addComponent(cbLlorosa))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEstadoLayout.setVerticalGroup(
            pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(cbAnsiosa)
                    .addComponent(cbTranquila)
                    .addComponent(cbHabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAsustada)
                    .addComponent(cbLlorosa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNerviosa)
                    .addComponent(cbEnojada))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ESTADO PSICO-EMOCIONAL EN EL TELÉFONO", pnlEstado);

        txtNotasAdicionalesVictima.setColumns(20);
        txtNotasAdicionalesVictima.setRows(5);
        jScrollPane2.setViewportView(txtNotasAdicionalesVictima);

        javax.swing.GroupLayout pnlNotasLayout = new javax.swing.GroupLayout(pnlNotas);
        pnlNotas.setLayout(pnlNotasLayout);
        pnlNotasLayout.setHorizontalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNotasLayout.setVerticalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("NOTAS ADICIONALES", pnlNotas);

        jLabel35.setText("Donde:");

        jRadioButton8.setText("No");

        jRadioButton7.setText("Si");

        jLabel34.setText("¿Ha recibido atención anterior por la violencia?");

        jLabel23.setText("Tipo de violencia:");

        cbFisica.setText("Física");

        cbPsicologica.setText("Psicológica");

        cbLaboral.setText("Laboral");

        cbEconomica.setText("Econímica");

        cbNegligencia.setText("Negligencia");

        cbNoReportaTipoViolencia.setText("No reporta");

        jLabel5.setText("Otra:");

        jLabel24.setText("Frecuencia de la agresión:");

        cbFrecuenciaAgresion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera vez", "Ocasionalmente", "Constantemente", "No reporta" }));

        cbEsposo.setText("Esposo");

        cbJefe.setText("Jefe");

        cbPadre_Madre.setText("Padre/Madre");

        jLabel25.setText("¿Quién es el agresor?:");

        cbNoReportaQuienEsElAgresor.setText("No reporta");

        cbNovio.setText("Novio");

        cbExPareja.setText("Ex pareja");

        cbHijo.setText("Hijo");

        jLabel29.setText("Nacionalidad del agresor:");

        jLabel28.setText("Otro:");

        jLabel30.setText("Factores de riesgo:");

        cbAlcolismo.setText("Alcoholismo");

        cbMachismo.setText("Machismo");

        jLabel31.setText("Otro:");

        cbMigracion.setText("Migración");

        cbNoReportaFactoresRiesgo.setText("No reporta");

        cbCelos.setText("Celos");

        cbDesempleo.setText("Desempleo");

        cbInfidelidad.setText("Infidelidad");

        jLabel32.setText("Consecuencias físicas de la agresión:");

        cbFracturas.setText("Fracturas");

        cbMoretones.setText("Moretones");

        cbHeridas.setText("Heridas");

        cbDepresion.setText("Depresión");

        cbBajaAutoestima.setText("Baja autoestima");

        cbAlt_Nerviosas.setText("Alt. nerviosas");

        jLabel33.setText("Otro:");

        cbNoReportaConcecuenciasFisicas.setText("No reporta");

        cbAbortos.setText("Abortos");

        cbContagiosETS.setText("Contagios ETS");

        cbEmbarazoNoDeseado.setText("Embarazo no deseado");

        cbNacionalidadAgresor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(cbFisica))
                                .addGap(41, 41, 41)
                                .addComponent(cbPsicologica)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbLaboral)
                                    .addComponent(cbNoReportaTipoViolencia))))
                        .addGap(89, 89, 89)
                        .addComponent(cbEconomica)
                        .addGap(72, 72, 72)
                        .addComponent(cbNegligencia)
                        .addContainerGap())
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAlcolismo)
                                    .addComponent(cbMachismo))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMigracion)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOtrosFactoresRiesgo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel32)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOtroConsecienciasFisicas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbNoReportaConcecuenciasFisicas))
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbNacionalidadAgresor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbFrecuenciaAgresion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(cbAlt_Nerviosas)
                                        .addGap(52, 52, 52)
                                        .addComponent(cbBajaAutoestima))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbEsposo)
                                            .addComponent(cbJefe)
                                            .addComponent(cbFracturas))
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbPadre_Madre)
                                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                                        .addComponent(jLabel28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtOtrosQuienEsElAgresor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(cbMoretones)))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbNoReportaFactoresRiesgo)
                                            .addComponent(cbCelos)
                                            .addComponent(cbHeridas)
                                            .addComponent(cbDepresion)
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbNovio)
                                                    .addComponent(cbNoReportaQuienEsElAgresor))))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbExPareja)
                                            .addComponent(cbAbortos)
                                            .addComponent(cbDesempleo))))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbHijo)
                                    .addComponent(cbInfidelidad)
                                    .addComponent(cbContagiosETS)
                                    .addComponent(cbEmbarazoNoDeseado))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFisica)
                    .addComponent(cbPsicologica)
                    .addComponent(cbLaboral)
                    .addComponent(cbEconomica)
                    .addComponent(cbNegligencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNoReportaTipoViolencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cbFrecuenciaAgresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEsposo)
                            .addComponent(cbPadre_Madre)
                            .addComponent(cbExPareja)
                            .addComponent(cbHijo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbJefe)
                            .addComponent(txtOtrosQuienEsElAgresor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(cbNacionalidadAgresor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAlcolismo)
                            .addComponent(cbMigracion)
                            .addComponent(cbDesempleo)
                            .addComponent(cbInfidelidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMachismo)
                            .addComponent(jLabel31)
                            .addComponent(txtOtrosFactoresRiesgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFracturas)
                            .addComponent(cbMoretones)
                            .addComponent(cbAbortos)
                            .addComponent(cbContagiosETS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEmbarazoNoDeseado)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbAlt_Nerviosas)
                                .addComponent(cbBajaAutoestima))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(cbNovio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNoReportaQuienEsElAgresor)
                        .addGap(58, 58, 58)
                        .addComponent(cbCelos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNoReportaFactoresRiesgo)
                        .addGap(34, 34, 34)
                        .addComponent(cbHeridas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDepresion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtOtroConsecienciasFisicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNoReportaConcecuenciasFisicas))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel14);

        javax.swing.GroupLayout pnlCaracteristicasLayout = new javax.swing.GroupLayout(pnlCaracteristicas);
        pnlCaracteristicas.setLayout(pnlCaracteristicasLayout);
        pnlCaracteristicasLayout.setHorizontalGroup(
            pnlCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addGroup(pnlCaracteristicasLayout.createSequentialGroup()
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        pnlCaracteristicasLayout.setVerticalGroup(
            pnlCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaracteristicasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel35)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CARACTERÍSTICAS DE LA VIOLENCIA", pnlCaracteristicas);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel2.setText("Otros:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOtrosResultado))
                    .addComponent(cbReultados, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cbReultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOtrosResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("RESULTADOS", pnlResultados);

        jLabel6.setText("¿CÓMO SUPO DE LA LÍNEA TELAFÓNICA?");

        javax.swing.GroupLayout pnlReferenciaLayout = new javax.swing.GroupLayout(pnlReferencia);
        pnlReferencia.setLayout(pnlReferenciaLayout);
        pnlReferenciaLayout.setHorizontalGroup(
            pnlReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlReferenciaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComoSupoLineaTelfonica, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        pnlReferenciaLayout.setVerticalGroup(
            pnlReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReferenciaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtComoSupoLineaTelfonica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("¿CÓMO SUPO DE LA LÍNEA TELAFÓNICA?", pnlReferencia);

        pnlDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel44.setText("Nombre:");

        jLabel45.setText("Nacionalidad:");

        jLabel46.setText("Edad:");

        spnEdadVictima.setModel(new javax.swing.SpinnerNumberModel(18, 0, 100, 1));

        jLabel47.setText("Estado civil:");

        cbxEstadoCivilVictima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltera", "Casada", "Divirciado", "Viuda", "Unión libre" }));

        jLabel48.setText("Dirección:");

        jLabel49.setText("¿Hijos?:");

        rbHijosSi.setText("Si");

        rbHijosNo.setText("No");

        jLabel50.setText("¿Trabaja?:");

        rbTrabajaSi.setText("Si");

        rbTrabajoNo.setText("No");

        spnNumeroHijos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        rbHijosNoReporta.setText("No reporta");

        rbTrabajaNoReporta.setText("No reporta");

        jLabel7.setText("Apellido:");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(12, 12, 12)
                        .addComponent(txtDireccionVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(24, 24, 24)
                        .addComponent(rbHijosSi)
                        .addGap(0, 0, 0)
                        .addComponent(rbHijosNo)
                        .addGap(29, 29, 29)
                        .addComponent(spnNumeroHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(rbHijosNoReporta))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(6, 6, 6)
                        .addComponent(rbTrabajaSi)
                        .addGap(0, 0, 0)
                        .addComponent(rbTrabajoNo)
                        .addGap(4, 4, 4)
                        .addComponent(rbTrabajaNoReporta))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(34, 34, 34)
                        .addComponent(spnEdadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidoVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(21, 21, 21)
                                .addComponent(txtNombreVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(201, 201, 201)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbnacionalidadVictima, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(11, 11, 11)
                                .addComponent(cbxEstadoCivilVictima, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel45)
                                .addComponent(cbnacionalidadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxEstadoCivilVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel47))))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnEdadVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel46)))
                .addGap(26, 26, 26)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel48))
                    .addComponent(txtDireccionVictima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel49))
                    .addComponent(rbHijosSi)
                    .addComponent(rbHijosNo)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(spnNumeroHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbHijosNoReporta))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel50))
                    .addComponent(rbTrabajaSi)
                    .addComponent(rbTrabajoNo)
                    .addComponent(rbTrabajaNoReporta))
                .addContainerGap())
        );

        jTabbedPane2.addTab("DATOS DE INFORMACIÓN", pnlDatos);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("FICHA DE REGISTRO DE LLAMADAS TELEFÓNICAS");

        jLabel40.setText("Fecha:");

        cbxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgente", "Medio", "Normal" }));

        jLabel39.setText("Prioridad del caso:");

        jLabel41.setText("Hora de llamada:");

        jLabel43.setText("Operador:");

        btnCancelar.setText("Cancelar");

        btnGuardar.setText("GUARDAR");

        jLabel4.setText("jLabel4");

        jButton1.setText("GENERAR CITA");

        javax.swing.GroupLayout pnlLlamadasLayout = new javax.swing.GroupLayout(pnlLlamadas);
        pnlLlamadas.setLayout(pnlLlamadasLayout);
        pnlLlamadasLayout.setHorizontalGroup(
            pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLlamadasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLlamadasLayout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLlamadasLayout.createSequentialGroup()
                        .addComponent(cbJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLlamadasLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLlamadasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLlamadasLayout.createSequentialGroup()
                            .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLlamadasLayout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(datFechaLlamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLlamadasLayout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41)
                            .addGap(247, 247, 247)
                            .addComponent(jLabel43)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        pnlLlamadasLayout.setVerticalGroup(
            pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLlamadasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(cbJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLlamadasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel42)
                    .addGap(20, 20, 20)
                    .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43)
                            .addComponent(txtOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(datFechaLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(pnlLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(cbxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlLlamadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlLlamadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox cbAbortos;
    private javax.swing.JCheckBox cbAbusoSexual;
    private javax.swing.JCheckBox cbAccesoriaLegal;
    private javax.swing.JCheckBox cbAlcolismo;
    private javax.swing.JCheckBox cbAlivioyApoyo;
    private javax.swing.JCheckBox cbAlt_Nerviosas;
    private javax.swing.JCheckBox cbAnsiosa;
    private javax.swing.JCheckBox cbAsustada;
    private javax.swing.JCheckBox cbAtencionPsicologica;
    private javax.swing.JCheckBox cbBajaAutoestima;
    private javax.swing.JCheckBox cbCelos;
    private javax.swing.JCheckBox cbContagiosETS;
    private javax.swing.JCheckBox cbDepresion;
    private javax.swing.JCheckBox cbDesempleo;
    private javax.swing.JCheckBox cbEconomica;
    private javax.swing.JCheckBox cbEmbarazoNoDeseado;
    private javax.swing.JCheckBox cbEnojada;
    private javax.swing.JCheckBox cbEsposo;
    private javax.swing.JCheckBox cbExPareja;
    private javax.swing.JCheckBox cbFisica;
    private javax.swing.JCheckBox cbFracturas;
    private javax.swing.JComboBox<String> cbFrecuenciaAgresion;
    private javax.swing.JComboBox<String> cbHabla;
    private javax.swing.JCheckBox cbHeridas;
    private javax.swing.JCheckBox cbHijo;
    private javax.swing.JCheckBox cbInfidelidad;
    private javax.swing.JCheckBox cbInformacionCasadeAcojida;
    private javax.swing.JCheckBox cbInformacionOtrasInstituciones;
    private javax.swing.JCheckBox cbIntentoSuicidio;
    private javax.swing.JCheckBox cbJefe;
    private javax.swing.JComboBox<String> cbJornada;
    private javax.swing.JCheckBox cbLaboral;
    private javax.swing.JCheckBox cbLlorosa;
    private javax.swing.JCheckBox cbMachismo;
    private javax.swing.JCheckBox cbMigracion;
    private javax.swing.JCheckBox cbMoretones;
    private javax.swing.JComboBox<String> cbNacionalidadAgresor;
    private javax.swing.JCheckBox cbNegligencia;
    private javax.swing.JCheckBox cbNerviosa;
    private javax.swing.JCheckBox cbNoReporta;
    private javax.swing.JCheckBox cbNoReportaConcecuenciasFisicas;
    private javax.swing.JCheckBox cbNoReportaFactoresRiesgo;
    private javax.swing.JCheckBox cbNoReportaQuienEsElAgresor;
    private javax.swing.JCheckBox cbNoReportaTipoViolencia;
    private javax.swing.JCheckBox cbNovio;
    private javax.swing.JCheckBox cbPadre_Madre;
    private javax.swing.JCheckBox cbPsicologica;
    private javax.swing.JComboBox<String> cbReultados;
    private javax.swing.JCheckBox cbTranquila;
    private javax.swing.JCheckBox cbViolacion;
    private javax.swing.JCheckBox cbViolenciaInstitucional;
    private javax.swing.JCheckBox cbViolenciaIntrafamiliar;
    private javax.swing.JCheckBox cbViolenciaSocial;
    private javax.swing.JComboBox<String> cbVoz;
    private javax.swing.JComboBox<String> cbnacionalidadVictima;
    private javax.swing.JComboBox<String> cbxEstadoCivilVictima;
    private javax.swing.JComboBox<String> cbxPrioridad;
    private com.toedter.calendar.JDateChooser datFechaLlamada;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel pnlCaracteristicas;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlEstado;
    private javax.swing.JPanel pnlLlamadas;
    private javax.swing.JPanel pnlMotivo;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JPanel pnlReferencia;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JRadioButton rbHijosNo;
    private javax.swing.JRadioButton rbHijosNoReporta;
    private javax.swing.JRadioButton rbHijosSi;
    private javax.swing.JRadioButton rbTrabajaNoReporta;
    private javax.swing.JRadioButton rbTrabajaSi;
    private javax.swing.JRadioButton rbTrabajoNo;
    private javax.swing.JSpinner spnEdadVictima;
    private javax.swing.JSpinner spnNumeroHijos;
    private javax.swing.JTextField txtApellidoVictima;
    private javax.swing.JTextField txtComoSupoLineaTelfonica;
    private javax.swing.JTextField txtDireccionVictima;
    private javax.swing.JTextField txtNombreVictima;
    private javax.swing.JTextArea txtNotasAdicionalesVictima;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtOtroConsecienciasFisicas;
    private javax.swing.JTextField txtOtrosFactoresRiesgo;
    private javax.swing.JTextField txtOtrosMotivoLlamada;
    private javax.swing.JTextField txtOtrosQuienEsElAgresor;
    private javax.swing.JTextField txtOtrosResultado;
    // End of variables declaration//GEN-END:variables
}
