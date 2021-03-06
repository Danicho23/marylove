package marylove.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import marylove.conexion.ConexionHi;
import marylove.models.Cierre;
import marylove.models.Personal;

/**
 *
 * @author vasquez
 */
public class personalDB extends Personal {

    PreparedStatement ps;
    ResultSet re;
    ConexionHi conectar = new ConexionHi();
    String sql = "";
    List<Personal> listPers;
    boolean ingreso = true;

    boolean verif = true;

    public personalDB() {
    }

    public boolean ingrePersonal(Personal pel) {
        try {
            sql = "INSERT INTO public.personal( personal_usuario, "
                    + "personal_contra, persona_codigo)"
                    + "VALUES ('" + pel.getPersonal_usuario() + "','" + pel.getPersonal_contra()
                    + "'," + pel.getPersona_codigo() + ");";
            ingreso = conectar.noQuery(sql);
        } catch (Exception ex) {
            System.out.println("ERROR al ingresar personal " + ex.getMessage());
            ingreso = false;
        }
        return ingreso;
    }

    public List<Personal> obtenerPersonal() {
        listPers = new ArrayList();
        try {
            sql = "select pl.personal_codigo, pl.personal_usuario, pl.personal_contra, pr.persona_nombre||' '||pr.persona_apellido from personal pl "
                    + "join persona pr on pl.persona_codigo = pr.persona_codigo where pr.persona_estado_actual = true ;";
            re = conectar.query(sql);
            while (re.next()) {
                Personal pel = new Personal();
                pel.setPersonal_codigo(re.getInt(1));
                pel.setPersonal_usuario(re.getString(2));
                pel.setPersonal_contra(re.getString(3));
                pel.setPersona_nombre(re.getString(4));
                listPers.add(pel);
            }
        } catch (SQLException ex) {
            System.out.println("error al obtener personal " + ex.getMessage());
        }
        return listPers;
    }

    //(pl.personal_usuario like '%v%' OR pr.persona_cedula like '%03%' )
    public List<Personal> buscarPersonal(String aguja) {
        listPers = new ArrayList();
        try {
            sql = "select pl.personal_codigo, pl.personal_usuario, pl.personal_contra, pr.persona_nombre||' '||pr.persona_apellido from personal pl "
                    + "join persona pr on pl.persona_codigo = pr.persona_codigo where pr.persona_estado_actual = true AND "
                    + "(pl.personal_usuario like '%" + aguja + "%' OR pr.persona_cedula like '%" + aguja + "%' "
                    + "OR pr.persona_nombre like '%" + aguja + "%' OR pr.persona_apellido like '%" + aguja + "%');";
            re = conectar.query(sql);
            while (re.next()) {
                Personal pel = new Personal();
                pel.setPersonal_codigo(re.getInt(1));
                pel.setPersonal_usuario(re.getString(2));
                pel.setPersonal_contra(re.getString(3));
                pel.setPersona_nombre(re.getString(4));
                listPers.add(pel);
            }
        } catch (SQLException ex) {
            System.out.println("error al buscar personal " + ex.getMessage());
        }
        return listPers;
    }

    public boolean editPers(Personal pl) {
        try {
            sql = "UPDATE personal SET ";
            sql += "personal_usuario ='" + pl.getPersonal_usuario() + "', ";
            sql += "personal_contra ='" + pl.getPersonal_contra() + "'";
            sql += "WHERE personal_codigo = " + pl.getPersonal_codigo() + ";";
            return conectar.noQuery(sql);
        } catch (Exception ex) {
            System.out.println("Error al editar Personal " + ex.getMessage());
            return false;
        }
    }

    public String verifiUser(String c_user) { // verifica si ya existe un usuario con el mismo nombre
        String user = "";
        try {
            sql = "select personal_usuario from Personal where personal_usuario = '" + c_user + "';";
            re = conectar.query(sql);
            while (re.next()) {
                user = re.getString(2);
                System.out.println("Usuario ya existente");

            }
        } catch (SQLException ex) {
            System.out.println("Usuario");
            conectar.cerrarConexion();
        }
        return user;
    }

    // metodos para el ingreso de los usuarios
    public int verifContra(String user, String c_contra) { // verifica la contraseña y el ususario
        int contra = 0;
        try {
            sql = "select personal_codigo from Personal where personal_usuario = '" + user + "' AND personal_contra = '" + c_contra + "' ";
            re = conectar.query(sql);
            while (re.next()) {
                contra = re.getInt(1);
                System.out.println("Contraseña valida");
            }
        } catch (SQLException ex) {
            System.out.println("Contraseña no valida");
            conectar.cerrarConexion();
        }
        return contra;
    }

    public int obtenerCod(String user, String c_contra) {
        int codP = 0;
        try {
            sql = "select personal_codigo from Personal where personal_usuario = '" + user + "' AND personal_contra = '" + c_contra + "';";
            re = conectar.query(sql);
            while (re.next()) {
                codP = re.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("error al obtener codigo: " + ex.getMessage());
            conectar.cerrarConexion();
            codP = 0;
        }
        return codP;
    }
}
