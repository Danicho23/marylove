package marylove.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import marylove.conexion.ConexionHi;
import marylove.controlador.FiltroHijosVictima;
import marylove.models.Persona;
import marylove.models.Victima;

/**
 *
 * @author vasquez
 */
public class victimaDB extends Victima {

    PreparedStatement ps;
    ResultSet re;
    int cod = 0;

    ConexionHi conectar = new ConexionHi();
    String sql = "";
    //variables globqales
    int id = 0;
    Victima v;
    //vatriables staticas
    private static int codigo_victima_static = 0 ;
    private static int victima_static_formulario = 0;
    private static String victima_nom_formulario = "";
    private static List<Victima> arrayvictima = new ArrayList<>();

    public static String getVictima_nom_formulario() {
        return victima_nom_formulario;
    }

    public static void setVictima_nom_formulario(String victima_nom_formulario) {
        victimaDB.victima_nom_formulario = victima_nom_formulario;
    }

    public static int getVictima_static_formulario() {
        return victima_static_formulario;
    }

    public static void setVictima_static_formulario(int victima_static_formulario) {
        victimaDB.victima_static_formulario = victima_static_formulario;
    }

    public victimaDB() {
    }

    public victimaDB(int persona_codigo, boolean victima_estado) {
        super(persona_codigo, victima_estado);
    }
    //registro y referencia metodo para obtener el id de la victima al modificar la persona
    //-----------------------------------------------------------------------------------
    public void getIdVictimaWithAPersonCode(int id) throws SQLException {
        sql = "select victima_codigo from victima where persona_codigo = "+id+";";
        re = conectar.query(sql);
        if (re!= null){
            while (re.next()){
                codigo_victima_static= re.getInt(1);
            }
        }
    }
    //-----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------FormularioR1
    public Victima obtener_id_formulario(String ced) throws SQLException {
        Victima vc = new Victima();
        sql = "select v.victima_codigo,p.persona_nombre,p.persona_apellido from victima v join persona p using (persona_codigo) where persona_cedula='"+ced+"';";
        re = conectar.query(sql);
        if (re != null) {
            while (re.next()) {
                victima_static_formulario = re.getInt(1);
                victima_nom_formulario = re.getString(2) + " " + re.getString(3);
                vc.setVictima_codigo(re.getInt(1));
                vc.setPersona_nombre(re.getString(2) + " " + re.getString(3));
                
            }
            return vc;
        } else {
            return null;
        }

    }

    //-----------------------------------------------------------------------------------------------------
    public void datosVictima(String nombre, String cedula) {

        v = new Victima();
        String sql2 = "";
        try {
            if (nombre.equals("") && !cedula.equals("")) {
                sql2 = "select vc.victima_codigo,pe.persona_cedula, pe.persona_nombre, pe.persona_apellido from victima vc join persona as pe on vc.persona_codigo = pe.persona_codigo where pe.persona_cedula Like '%" + cedula + "%'";
                System.out.println(sql2);
            } else if (!nombre.equals("") && cedula.equals("")) {
                sql2 = "select vc.victima_codigo,pe.persona_cedula, pe.persona_nombre, pe.persona_apellido from victima vc join persona as pe on vc.persona_codigo = pe.persona_codigo where pe.persona_nombre Like '%" + nombre + "%'";
                System.out.println("2");
            } else if (nombre.equals("") && cedula.equals("")) {
                sql2 = "select vc.victima_codigo, pe.persona_cedula,pe.persona_nombre, pe.persona_apellido from victima vc join persona as pe on vc.persona_codigo = pe.persona_codigo ";
                // System.out.println(" holaaaaaaaaaaaaaaa");
            } else {
                System.out.println("vacio");
                sql2 = "select vc.victima_codigo, pe.persona_cedula,pe.persona_nombre, pe.persona_apellido from victima vc join persona as pe on vc.persona_codigo = pe.persona_codigo ";
            }

            //  sql = " select hj.hijo_codigo , pe.persona_nombre||' '||pe.persona_apellido from hijos hj join persona pe USING (persona_codigo) where   hj.victima_codigo="+codigo_victima
            ps = conectar.getConnection().prepareStatement(sql2);
            re = ps.executeQuery();
            while (re.next()) {
                Victima vc = new Victima();
                vc.setVictima_codigo(re.getInt(1));
                vc.setPersona_cedula(re.getString(2));
                vc.setPersona_nombre(re.getString(3));
                vc.setPersona_apellido(re.getString(4));
                arrayvictima.add(vc);
            }

        } catch (Exception e) {
        }
        conectar.cerrarConexion();
    }

    //-----------------------------------------------------------------------------------------------------
    public static List<Victima> getArrayvictima() {
        return arrayvictima;
    }

    public static void setArrayvictima(List<Victima> arrayvictima) {
        victimaDB.arrayvictima = arrayvictima;
    }

    public static int getCodigo_victima_static() {
        return codigo_victima_static;
    }

    public static void setCodigo_victima_static(int codigo_victima_static) {
        victimaDB.codigo_victima_static = codigo_victima_static;
    }

   
    public boolean insertarVictima2(int codv) throws SQLException {
        
            sql = "INSERT into public.victima ( persona_codigo, victima_embarazo"
                    + ")	VALUES (" + codv + ", true )  RETURNING victima_codigo;";
            System.out.println(sql);
            re = conectar.query(sql);

            while (re.next()) {
                codigo_victima_static = re.getInt(1);
                System.out.println("julio "+ codigo_victima_static);
            }
        
        return true;
    }
    
      

    public Victima obtenetCV(String ced, String nom, String app) {
        Victima v = new Victima();
        if (nom.equals("")) {
            nom = " ";
        }
        if (app.equals("")) {
            app = " ";
        }
        try {
            sql = "select vc.victima_codigo, pe.persona_nombre||' '||pe.persona_apellido, pe.persona_cedula from victima vc "
                    + " inner join persona pe on vc.persona_codigo = pe.persona_codigo "
                    + " where pe.persona_cedula = '" + ced + "' OR (pe.persona_nombre LIKE '%" + nom + "%' "
                    + " AND pe.persona_apellido LIKE '%" + app + "%');";
            re = conectar.query(sql);
            while (re.next()) {
                v.setVictima_codigo(re.getInt(1));
                v.setPersona_nombre(re.getString(2));
                v.setPersona_cedula(re.getString(3));
            }
        } catch (Exception ex) {
            System.out.println("error al obtener datos de victima " + ex.getMessage());
            conectar.cerrarConexion();
        }
        return v;
    }

    public int obtenerIdVictima() {

        try {

            sql = "select victima_codigo from victima where persona_codigo='" + getPersona_codigo() + "'";
            System.out.println(sql + "----------------");
            re = conectar.query(sql);
            while (re.next()) {
                id = re.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            conectar.cerrarConexion();
        }
        return id;
    }

    public void MadreVictimaAnamnesis(Victima v) {
        sql = "select  p.persona_nombre, p.persona_apellido,p.persona_nacionalidad, Extract(year from age( current_date , p.persona_fecha_nac)) from victima v join persona p using (persona_codigo) join hijos h using (victima_codigo) where h.hijo_codigo=" + AnamnesisDB.hijoCodigo + ";";
        System.out.println(sql);
        re = conectar.query(sql);
        try {
            while (re.next()) {
                v.setPersona_nombre(re.getString(1));
                v.setPersona_apellido(re.getString(2));
                v.setPersona_nacionalidad(re.getInt(3));
                v.setEdad(Integer.parseInt(String.valueOf(re.getString(4))));
            }

        } catch (SQLException ex) {
            Logger.getLogger(victimaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
