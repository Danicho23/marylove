/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marylove;

import marylove.DBmodelo.*;
import marylove.conexion.Conexion;
import marylove.controlador.*;
import marylove.models.*;
import marylove.vista.*;

/**
 *
 * @author LENOVO
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        FichaPlanAtencionTerapeutica vista = new FichaPlanAtencionTerapeutica();
//        PlanAtencionTerapeuticoDB modelo = new PlanAtencionTerapeuticoDB ();
//        ControladorPlanAtencionTerapeutica ctrl = new ControladorPlanAtencionTerapeutica(vista, modelo);
//        ctrl.iniciarControlador();
//        VistaPlanEmergente vista = new VistaPlanEmergente();
//        PlanEmergenteDB modeloDB = new PlanEmergenteDB ();
//        PlanEmergente2DB modeloDB2 = new PlanEmergente2DB();
//        ControladorPlanEmergente ctrl = new ControladorPlanEmergente(vista, modeloDB,modeloDB2);
//        ctrl.iniciarControlador();
            
//           IngresoAvanceProceTerapeuticoDB modelo = new IngresoAvanceProceTerapeuticoDB();
//           FichaEvolucionProcesoTerapeutico vista = new FichaEvolucionProcesoTerapeutico();
//           CtrlFichaEvaluacionProcesoTerapeutico control = new CtrlFichaEvaluacionProcesoTerapeutico(modelo, vista);
//           control.iniciarControlador();
//           
           
//          PlanAtencionTerapeuticoDB modelo = new PlanAtencionTerapeuticoDB();
//          FichaPlanAtencionTerapeutica vista = new FichaPlanAtencionTerapeutica();
//          ControladorPlanAtencionTerapeutica control= new ControladorPlanAtencionTerapeutica (vista, modelo);
//          control.iniciarControlador();

   IngresoAvanceProceTerapeuticoDB modelo2 = new IngresoAvanceProceTerapeuticoDB();
        IngresoAvancesProcesoTerapeutico vista2 = new IngresoAvancesProcesoTerapeutico();
        CtrlIngresoAvanceProceTerapeutico control = new CtrlIngresoAvanceProceTerapeutico(modelo2, vista2);
        control.iniciarControl();
          
          
           
    }
    
}
