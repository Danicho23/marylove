package marylove.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import marylove.conexion.Conexion;
import marylove.conexion.ConexionHi;
import marylove.models.Direccion;

public class DireccionDB extends Direccion {

    PreparedStatement ps;
    ResultSet re = null;
    ConexionHi conn;
    String sql;
    //variables globales
    int direccionId;

    public DireccionDB() {
    }

    public DireccionDB(String calle_dir, String dir_interseccion, 
    String dir_num_casa, String dir_barrio, String dir_parroquia, 
    String dir_ciudad, String dir_referencias,  
    String provincia, String pais,boolean dir_estado) {
        super(calle_dir, dir_interseccion, dir_num_casa, dir_barrio, 
        dir_parroquia, dir_ciudad, dir_referencias, provincia, pais,dir_estado);
    }
    

    //hola
    public int obtenerIdDireccion() throws SQLException {
        conn = new ConexionHi();
        direccionId = 0;
        sql = "select dir_codigo from direccion order by dir_codigo desc limit 1;";
        ps = conn.getConnection().prepareStatement(sql);
        re = ps.executeQuery();

        while (re.next()) {
            direccionId = re.getInt(1);
        }

        return direccionId;
    }

    public boolean insertaDireccion() {
        conn= new ConexionHi();
        boolean ing = true;

        try {
            sql = "INSERT INTO public.direccion(dir_calle,dir_interseccion,dir_num_casa,dir_barrio,dir_parroquia,"
            + "dir_ciudad,dir_referencias,dir_provincia,dir_pais,dir_estado)VALUES('"+getCalle_dir()+"','"
            +getDir_interseccion()+ "','"+getDir_num_casa()+"','"+getDir_barrio()+"','"
            +getDir_parroquia()+"','"+getDir_ciudad()+"','"+getDir_referencias()+"','"
            +getProvincia()+"','"+getPais()+"','"+getDir_estado()+"');";
            ps = conn.getConnection().prepareStatement(sql);
            ps.execute();
            ing = true;
        } catch (SQLException ex) {
            System.out.println("ERROR al ingresar ficha Dirección: " + ex.getMessage());
            ing = false;
        }
        conn.CerrarConexion();
        return ing;
    }

    public int verifiDirecc(Conexion con) { // verifica que perfil es el usuario
        
        int dirCod = 0;
        try {
            sql = "select max(dir_codigo) from direccion;";
            ps = con.conectarBD().prepareStatement(sql);
            re = ps.executeQuery();
            while (re.next()) {
                dirCod = re.getInt(1);
            }

        } catch (SQLException ex) {
            dirCod = 0;
            System.out.println("erorr al obtener direccion persona" + ex.getMessage());
        }
        con.cerrarConexion();
        return dirCod;
    }
}
