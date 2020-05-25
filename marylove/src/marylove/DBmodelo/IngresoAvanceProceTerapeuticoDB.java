package marylove.DBmodelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import marylove.conexion.ConexionHi;
import marylove.models.IngresoAvanceProceTeraputico;

/**
 *
 * @author LENOVO
 */
public class IngresoAvanceProceTerapeuticoDB extends IngresoAvanceProceTeraputico {

    PreparedStatement ps;
    ResultSet re = null;
    ConexionHi conectar;// = new ConexionHi();

    public IngresoAvanceProceTerapeuticoDB() {
    }

    public IngresoAvanceProceTerapeuticoDB(int avances_codigo, int plan_at_codigo, String avancesFecha, String avances_situacion, String avances_intervencion) {
        super(avances_codigo, plan_at_codigo, avancesFecha, avances_situacion, avances_intervencion);
    }

    public boolean insetarAvance() throws SQLException {
        String sql = "INSERT INTO avances_terapeuticos (avances_fecha, avances_situacion, avances_intervencion, plan_at_codigo)"
                + "VALUES"
                + "('" + getAvancesFecha() + "','" + getAvances_situacion() + "','" + getAvances_intervencion() +"', " + getPlan_at_codigo() + " )";
        return conectar.noQuery(sql);
    }

//      public List<IngresoAvanceProceTeraputico> obtenerRegisAct(int c_vic) {
//        List<IngresoAvanceProceTeraputico> listRA = new ArrayList();
//        try {
//            String sql = "select at.avances_codigo, " 
//                    + "at.plan_at_codigo, "
//                    + "at.avances_fecha, "
//                    + "at.avances_situacion, "
//                    + "at.avances_intervencion "
//                    + "from avances_terapeuticos at join ficha_plan_atencion_terapeuta ft "
//                    + "on at.plan_at_codigo = ft.plan_at_codigo "
//                    + "join historial_clinico hc "
//                    + "on hc.hist_id = ft.plan_at_codigo "
//                    + "where hc.victima_codigo =  " +c_vic+ ";";
//            ps = conectar.conectarBD().prepareStatement(sql);
//            re = ps.executeQuery();
//            while (re.next()) {
//                IngresoAvanceProceTeraputico it = new IngresoAvanceProceTeraputico();
//                it.setPlan_at_codigo(re.getInt("at.plan_at_codigo"));
//                it.setAvances_situacion(re.getString("at.avances_situacion"));
//               it.setAvances_intervencion(re.getString("at.avances_intervencion"));
//               it.setAvancesFecha("at.avances_fecha");
//                listRA.add(it);
//            }
//            re = ps.executeQuery();
//        } catch (SQLException ex) {
//            System.out.println("Error " + ex.getMessage());
//        }
//        conectar.cerrarConexion();
//        return listRA;
//    }
    public List<IngresoAvanceProceTeraputico> listar(int cod) throws SQLException {
        List<IngresoAvanceProceTeraputico> listar = new ArrayList<IngresoAvanceProceTeraputico>();
//      SELECT avt.avances_codigo, avt.avances_fecha, avt.avances_intervencion, avt.avances_situacion from avances_terapeuticos avt INNER JOIN ficha_plan_atencion_terapeuta pat 
//      ON avt.plan_at_codigo = pat.plan_at_codigo INNER JOIN historial_clinico hc 
//      ON pat.hist_id = hc.hist_id WHERE hc.victima_codigo = 
        try {
            String sql = "SELECT avt.avances_codigo, avt.avances_fecha, avt.avances_intervencion, avt.avances_situacion "
                    + "from avances_terapeuticos avt INNER JOIN ficha_plan_atencion_terapeuta pat "
                    + "ON avt.plan_at_codigo = pat.plan_at_codigo INNER JOIN historial_clinico hc "
                    + "ON pat.hist_id = hc.hist_id WHERE hc.victima_codigo = " +cod;
            re = conectar.query(sql);
            while (re.next()) {
                IngresoAvanceProceTeraputico p = new IngresoAvanceProceTeraputico();
                p.setAvances_codigo(re.getInt("avances_codigo"));
                p.setAvancesFecha(obtenerFecha(re.getDate("avances_fecha")));
                p.setAvances_situacion(re.getString("avances_situacion"));
                p.setAvances_intervencion(re.getString("avances_intervencion"));
                listar.add(p);
            }
            re.close();
            return listar;
        } catch (Exception ex) {
            System.out.println("error; " + ex);
            return null;
        }

    }

    public String obtenerFecha(Date fech) {
        String fecha2 = "";
        SimpleDateFormat NFormat = new SimpleDateFormat("yyyy/MM/dd");
        fecha2 = NFormat.format(fech);
        return fecha2;
    }

    public int maxID() {
        int id = 0;
        try {
            String sql = "select max (plan_at_codigo) from ficha_plan_atencion_terapeuta ;";

            re = conectar.query(sql);

            while (re.next()) {
                id = (re.getInt(1) + 1);
            }
        } catch (Exception ex) {
            System.out.println("Error al obtener id " + ex.getMessage());
        }
//        conectar.cerrarConexion();
        return id;
    }

}
