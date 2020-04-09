package marylove.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import marylove.conexion.Conexion;
import marylove.conexion.ConexionHi;
import marylove.models.EvaluacionPlanVida;
import marylove.models.PercepcionFamiliar;

public class EvaluacionPlanVidaDB extends EvaluacionPlanVida {

    Conexion con = new Conexion();
    PreparedStatement ps;
    ResultSet re = null;
    ConexionHi conn;
    String sql = "";

    public EvaluacionPlanVidaDB() {
    }

    public EvaluacionPlanVidaDB(int evaluacion_id, int victima_codigo, String evaluacion_fecha, String evaluacion_proxima, int personal_codigo) {
        super(evaluacion_id, victima_codigo, evaluacion_fecha, evaluacion_proxima, personal_codigo);
    }

    public boolean IngresarEvaluacionPlaVida() {
        String sql = "INSERT INTO evaluacion_plan_vida"
                + "(victima_codigo,personal_codigo,evalucion_fecha,evalucion_proxima)"
                + "VALUES (" + getVictima_codigo() + "," + getPersonal_codigo() + ",'" + getEvaluacion_fecha() + "','" + getEvaluacion_proxima() + "')";

        PreparedStatement ps = con.getPs(sql);
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }

    public int verifiUserP(int c_per) { // verifica que perfil es el usuario
        int user = 0;
        try {
            sql = "select * from personal where personal_codigo = " + c_per + ";";
            ps = con.conectarBD().prepareStatement(sql);
            re = ps.executeQuery();
            while (re.next()) {
                user = re.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Error personal " + ex.getMessage());
            user = 0;
        }
//        con.cerrarConexion();
        return user;
    }

    public int maxId() {
        int id = 0;
        try {
            String sql = "select max(evaluacion_id) from evaluacion_plan_vida;";
            ps = con.conectarBD().prepareStatement(sql);
            re = ps.executeQuery();
            while (re.next()) {
                id = (re.getInt(1));
            }
            re = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al obtener id " + ex.getMessage());
        }
//        con.cerrarConexion();
        return id;
    }
    
    
}
