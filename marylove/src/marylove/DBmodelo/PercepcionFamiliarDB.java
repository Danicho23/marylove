package marylove.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import marylove.conexion.Conexion;
import marylove.models.PercepcionFamiliar;

public class PercepcionFamiliarDB extends PercepcionFamiliar {

    PreparedStatement ps;
    ResultSet re = null;
    String sql = "";
    Conexion conectar = new Conexion();

    public PercepcionFamiliarDB(int percepcion_id, int evaluacion_id, String comoSeSiente, String alcanzoObjetivosComo, String dificultadesEnconectartradas) {
        super(percepcion_id, evaluacion_id, comoSeSiente, alcanzoObjetivosComo, dificultadesEnconectartradas);
    }

    public PercepcionFamiliarDB() {
    }

    public boolean IngresarPercepcionFamil() {
         sql = "INSERT INTO percepcion_familiar"
                + "(evaluacion_id,comoseseinte,alcanzoonjetivos_como,dificultadesenconectartradas)"
                + "VALUES (" + getEvaluacion_id() + ",'" + getComoSeSiente() + "','" + getAlcanzoObjetivosComo() + "','" + getDificultadesEncontradas() + "')";
        ps = conectar.getPs(sql);
        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    public List<PercepcionFamiliar> listarPerFam() throws SQLException {
        List<PercepcionFamiliar> listarPerFam = new ArrayList<>();
         sql = "select percepcion_id,comoseseinte,alcanzoonjetivos_como,dificultadesencontradas from percepcion_familiar pf\n"
                + "join evaluacion_plan_vida epv\n"
                + "on epv.evaluacion_id = pf.evaluacion_id\n"
                + "where epv.victima_codigo = '1';";
//        sql += "order by 1";
        ResultSet rs = conectar.query(sql);
        try {
            while (rs.next()) {
                PercepcionFamiliar p = new PercepcionFamiliar();
                p.setPercepcion_id(rs.getInt("percepcion_id"));
                p.setComoSeSiente(rs.getString("comoseseinte"));
                p.setAlcanzoObjetivosComo(rs.getString("alcanzoonjetivos_como"));
                p.setDificultadesEncontradas(rs.getString("dificultadesencontradas"));
                listarPerFam.add(p);
            }
            rs.close();
            return listarPerFam;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean actualizarPerFam() {
         sql = "UPDATE percepcion_familiar SET ";
        sql += "comoseseinte='" + getComoSeSiente() + "', ";
        sql += "alcanzoonjetivos_como='" + getAlcanzoObjetivosComo() + "', ";
        sql += "dificultadesencontradas='" + getDificultadesEncontradas() + "'";
        sql += " WHERE percepcion_id='" + getPercepcion_id() + "'";

        if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    public List<PercepcionFamiliar> buscarTextoPercepcionFam(String texto) throws SQLException {
        List<PercepcionFamiliar> buscarTexto = new ArrayList();
        System.out.println("testoDB: "+texto);
         sql = "select* from percepcion_familiar pf\n"
                + "join evaluacion_plan_vida epv\n"
                + "on pf.evaluacion_id = epv.evaluacion_id join victima vic\n"
                + "on vic.victima_codigo= epv.victima_codigo join persona as pe\n"
                + "on vic.persona_codigo =  pe.persona_codigo\n"
                + "where persona_cedula like '"+texto+"%'\n"
                + "OR persona_nombre LIKE '"+texto+"%'\n"
                + "OR persona_apellido like '"+texto+"%';";
        ResultSet rs = conectar.query(sql);
        try {
            while (rs.next()) {
                PercepcionFamiliar p = new PercepcionFamiliar();
                p.setPercepcion_id(rs.getInt("percepcion_id"));
                p.setComoSeSiente(rs.getString("comoseseinte"));
                p.setAlcanzoObjetivosComo(rs.getString("alcanzoonjetivos_como"));
                p.setDificultadesEncontradas(rs.getString("dificultadesencontradas"));
                buscarTexto.add(p);

            }
            rs.close();
            return buscarTexto;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
