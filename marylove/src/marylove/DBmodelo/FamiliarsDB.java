package marylove.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import marylove.conexion.ConexionHi;
import marylove.models.Familiars;

public class FamiliarsDB extends Familiars {

    ConexionHi conectar = new ConexionHi();
    PreparedStatement ps;
    ResultSet re = null;
    String sql = "";
    int id = 0;

    public FamiliarsDB(int familiares_id, int persona_codigoFam, int hijo_codigoFam, String parentescoFam, boolean estadoFam, int edadFam) {
        super(familiares_id, persona_codigoFam, hijo_codigoFam, parentescoFam, estadoFam, edadFam);
    }

    public FamiliarsDB(int familiares_id, int persona_codigoFam, int hijo_codigoFam, String parentescoFam, boolean estadoFam, int edadFam, String persona_nombre, String persona_apellido, Date persona_fecha_nac, int persona_ocupacion, int persona_nivel_acad, int persona_estadocivil, char persona_sexo) {
        super(familiares_id, persona_codigoFam, hijo_codigoFam, parentescoFam, estadoFam, edadFam, persona_nombre, persona_apellido, persona_fecha_nac, persona_ocupacion, persona_nivel_acad, persona_estadocivil, persona_sexo);
    }

    public FamiliarsDB(int familiares_id, int persona_codigoFam, int hijo_codigoFam, String parentescoFam, boolean estadoFam, int edadFam, int persona_codigo, String persona_cedula, String persona_nombre, String persona_apellido, Date persona_fecha_nac, int persona_ocupacion, int persona_nivel_acad, int persona_est_migr, String persona_telefono, String persona_celular, int persona_estadocivil, int persona_nacionalidad, boolean persona_estado_actual, char persona_sexo, String persona_nivel_acad_otros, String persona_lugar_trabajo, String persona_referencia, int edad) {
        super(familiares_id, persona_codigoFam, hijo_codigoFam, parentescoFam, estadoFam, edadFam, persona_codigo, persona_cedula, persona_nombre, persona_apellido, persona_fecha_nac, persona_ocupacion, persona_nivel_acad, persona_est_migr, persona_telefono, persona_celular, persona_estadocivil, persona_nacionalidad, persona_estado_actual, persona_sexo, persona_nivel_acad_otros, persona_lugar_trabajo, persona_referencia, edad);
    }

    public FamiliarsDB(int familiares_id, int persona_codigoFam, int hijo_codigoFam, String parentescoFam, boolean estadoFam, int edadFam, String persona_cedula, String persona_nombre, String persona_apellido, Date persona_fecha_nac, String persona_telefono, String persona_celular, char persona_sexo) {
        super(familiares_id, persona_codigoFam, hijo_codigoFam, parentescoFam, estadoFam, edadFam, persona_cedula, persona_nombre, persona_apellido, persona_fecha_nac, persona_telefono, persona_celular, persona_sexo);
    }

    public FamiliarsDB(int familiares_id, int persona_codigoFam, int hijo_codigoFam, String parentescoFam, boolean estadoFam, int edadFam, String persona_cedula, String persona_nombre, String persona_apellido, String persona_telefono, String persona_celular) {
        super(familiares_id, persona_codigoFam, hijo_codigoFam, parentescoFam, estadoFam, edadFam, persona_cedula, persona_nombre, persona_apellido, persona_telefono, persona_celular);
    }

    public FamiliarsDB(int familiares_id, int persona_codigoFam, int hijo_codigoFam, String parentescoFam, boolean estadoFam, int edadFam, String persona_cedula, String persona_nombre, String persona_apellido, Date persona_fecha_nac, char persona_sexo) {
        super(familiares_id, persona_codigoFam, hijo_codigoFam, parentescoFam, estadoFam, edadFam, persona_cedula, persona_nombre, persona_apellido, persona_fecha_nac, persona_sexo);
    }

    public FamiliarsDB(int familiares_id, int persona_codigoFam, int hijo_codigoFam, String parentescoFam, boolean estadoFam, int edadFam, int persona_codigo, String persona_cedula, String persona_nombre, String persona_apellido, Date persona_fecha_nac, int persona_ocupacion, int persona_nivel_acad, int persona_est_migr, String persona_telefono, String persona_celular, int persona_estadocivil, int persona_nacionalidad, boolean persona_estado_actual, char persona_sexo, String persona_nivel_acad_otros, String persona_lugar_trabajo, String persona_referencia) {
        super(familiares_id, persona_codigoFam, hijo_codigoFam, parentescoFam, estadoFam, edadFam, persona_codigo, persona_cedula, persona_nombre, persona_apellido, persona_fecha_nac, persona_ocupacion, persona_nivel_acad, persona_est_migr, persona_telefono, persona_celular, persona_estadocivil, persona_nacionalidad, persona_estado_actual, persona_sexo, persona_nivel_acad_otros, persona_lugar_trabajo, persona_referencia);
    }

    public FamiliarsDB(int familiares_id, int persona_codigoFam, int hijo_codigoFam, String parentescoFam, boolean estadoFam, int edadFam, String persona_cedula, String persona_nombre, String persona_apellido, Date persona_fecha_nac, int persona_ocupacion, int persona_nivel_acad, int persona_est_migr, String persona_telefono, String persona_celular, int persona_estadocivil, int persona_nacionalidad, boolean persona_estado_actual, char persona_sexo, String persona_nivel_acad_otros, String persona_lugar_trabajo, String persona_referencia) {
        super(familiares_id, persona_codigoFam, hijo_codigoFam, parentescoFam, estadoFam, edadFam, persona_cedula, persona_nombre, persona_apellido, persona_fecha_nac, persona_ocupacion, persona_nivel_acad, persona_est_migr, persona_telefono, persona_celular, persona_estadocivil, persona_nacionalidad, persona_estado_actual, persona_sexo, persona_nivel_acad_otros, persona_lugar_trabajo, persona_referencia);
    }

    public FamiliarsDB() {
    }

    public int maxId() {
        int id = 0;
        try {
            sql = "select max(ingreso_id) from ingreso ;";
            ps = conectar.getConnection().prepareStatement(sql);
            re = ps.executeQuery();
            while (re.next()) {
                id = (re.getInt(1));
            }
            re = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error al obtener id " + ex.getMessage());
        }
        conectar.cerrarConexion();
        return id;
    }

    public boolean IngresarFamily() throws SQLException {
        sql = "insert into persona(persona_cedula,persona_nombre,persona_apellido,persona_fecha_nac)\n"
                + "values ('" + getPersona_cedula() + "','" + getPersona_nombre() + "','" + getPersona_apellido() + "','"
                + getPersona_fecha_nac() + "')returning persona_codigo;";
        System.out.println(sql);

        re = conectar.query(sql);

        while (re.next()) {
            id = re.getInt(1);
        }
        return true;
    }
    
    public boolean IngresarFamily2() throws SQLException {
        sql = "insert into familiares(persona_codigo,parentesco,estado)\n"
                + "VALUES (" + id + ",'" + getParentescoFam() + "',true)";
        System.out.println("sql2: " + sql);
        ps = conectar.getConnection().prepareStatement(sql);
        if (conectar.noQuery(sql) == true) {
            return true;
        } else {
            return false;
        }
    }

     public boolean EdadIngresarFamily3() throws SQLException {
        sql = "update familiares set edad \n"
                + "select(Extract(year from age(current_date,per.persona_fecha_nac )))\n"
                + "from persona per inner join familiares fm \n"
                + "on  per.persona_codigo = fm.persona_codigo";
        System.out.println("sql3: " + sql);
        ps = conectar.getConnection().prepareStatement(sql);
        if (conectar.noQuery(sql) == true) {
            return true;
        } else {
            return false;
        }
    }

}
