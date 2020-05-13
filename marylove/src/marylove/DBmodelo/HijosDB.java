package marylove.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import marylove.conexion.ConexionHi;
import marylove.models.Hijos;
import marylove.models.InstitucionEducativa;

public class HijosDB extends Hijos {

    //VARIABLES STATIC
    private static List<HijosDB> arrayHijos = new ArrayList<>();
    private static List<Hijos> buscaHijos = new ArrayList<>();
    //variabñes DB
    public static int codigopersona = 0;
    public static int codigo_hijo_static;
    private ConexionHi conn;
    private String sql = "";
    PreparedStatement ps;
    ResultSet re;
    victimaDB vdb;
    //varibles globales

    public HijosDB(int persona_codigo, int victima_codigo, String hijo_anioescolar, int institucion_codigo, String persona_cedula, String persona_nombre, String persona_apellido, Date persona_fecha_nac, char persona_sexo) {
        super(persona_codigo, victima_codigo, hijo_anioescolar, institucion_codigo, persona_cedula, persona_nombre, persona_apellido, persona_fecha_nac, persona_sexo);
    }

    public HijosDB(String persona_cedula, String persona_nombre, String persona_apellido, Date persona_fecha_nac, char persona_sexo) {
        super(persona_cedula, persona_nombre, persona_apellido, persona_fecha_nac, persona_sexo);
    }

    public HijosDB() {
    }
    //-----------------------------------------------------------------------------------------------------------
    public void BusquedaHijos(int codigovictima) {
        conn = new ConexionHi();
        sql = "select hj.hijo_codigo, pe.persona_cedula , pe.persona_nombre, pe.persona_apellido from hijos hj join persona pe USING (persona_codigo) where   hj.victima_codigo=" + codigovictima;
        System.out.println(sql);
        try {
            ps = conn.getConnection().prepareStatement(sql);
            re = ps.executeQuery();
            while (re.next()) {
                Hijos hijo = new Hijos();

                hijo.setHijo_codigo(re.getInt(1));
                hijo.setPersona_cedula(re.getString(2));
                hijo.setPersona_nombre(re.getString(3));
                hijo.setPersona_apellido(re.getString(4));
                buscaHijos.add(hijo);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        conn.CerrarConexion();
    }
    public static List<Hijos> getBuscaHijos() {
        return buscaHijos;
    }

    public static void setBuscaHijos(List<Hijos> buscaHijos) {
        HijosDB.buscaHijos = buscaHijos;
    }
    
    //------------------------------------------------------------------------------------------------------------
    public static List<HijosDB> getArrayHijos() {
        return arrayHijos;
    }

    public static void setArrayHijos(List<HijosDB> arrayHijos) {
        HijosDB.arrayHijos = arrayHijos;
    }

    public String obtener_anioescolar(int id) throws SQLException {
        String res = "";
        sql = "Select hijo_anioescolar from hijos where hijo_codigo=" + id + ";";
        ps = conn.getConnection().prepareStatement(sql);
        re = ps.executeQuery();
        conn.CerrarConexion();
        while (re.next()) {
            res = re.getString(1);
        }
        return res;
    }

    public boolean agregarPrsonaHijo() throws SQLException {
        conn = new ConexionHi();
        sql = "INSERT INTO public.persona( persona_cedula, persona_nombre, persona_apellido,"
                + " persona_fecha_nac, persona_nivel_acad, persona_estado_actual, persona_sexo"
                + " )VALUES ( '" + getPersona_cedula() + "', "
                + "'" + getPersona_nombre() + "', '" + getPersona_apellido() + "', '" + getPersona_fecha_nac() + "', "
                + ", " + getPersona_nivel_acad() + ", 'true','" + getPersona_sexo() + "') returning persona_codigo;";
        ps = conn.getConnection().prepareStatement(sql);
        re = ps.executeQuery();
        conn.CerrarConexion();
        while (re.next()) {
            codigopersona = re.getInt(1);
        }
        return true;

    }

    public boolean insetarHijo() throws SQLException {

        conn = new ConexionHi();

        sql = "INSERT INTO public.hijos( persona_codigo, victima_codigo, hijo_anioescolar, institucion_codigo"
                + " )VALUES (" + codigopersona + ", " + vdb.getCodigo_victima_static() + "," + getHijo_anioescolar() + "," + getInstitucion_codigo() + ");";
        ps = conn.getConnection().prepareStatement(sql);
        re = ps.executeQuery();
        conn.CerrarConexion();
        while (re.next()) {
            codigo_hijo_static = re.getInt(1);
        }
        return true;
    }

    public boolean consultaHijosVictimas() {
        try {
            conn = new ConexionHi();
            sql = "select p.persona_cedula, p.persona_nombre, p.persona_apellido, p.persona_sexo, p.persona_fecha_nac from persona p,  hijos h where h.victima_codigo=" + vdb.getCodigo_victima_static() + " and h.persona_codigo=p.persona_codigo ";
            ps = conn.getConnection().prepareStatement(sql);
            re = ps.executeQuery();
            conn.CerrarConexion();
            HijosDB hijos;
            while (re.next()) {
                hijos = new HijosDB();
                hijos.setPersona_cedula(re.getString(1));
                hijos.setPersona_nombre(re.getString(2));
                hijos.setPersona_apellido(re.getString(3));
                hijos.setPersona_sexo(re.getString(4).charAt(0));
                hijos.setPersona_fecha_nac(re.getDate(5));
                arrayHijos.add(hijos);

            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        return true;
    }

}
