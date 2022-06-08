package model;

import controller.TratamientoData;
import view.MenuView;

public class Main {

    public static void main(String[] args) {
        /*
        MenuView v = new MenuView();
        v.setVisible(true);
        v.setLocationRelativeTo(v);
        //main
        */
        Tratamiento tr = new Tratamiento(3,"chekeo", " ", " ", 2000, true);
        Conexion con = new Conexion();
        TratamientoData td = new TratamientoData(con);
        //td.insertarTratamiento(tr);
//        td.eliminarTratamiento(6);
//        td.actualizarTratamiento(tr);
//        td.listarActivos();
//        td.consultarTratamiento(4);
    }

}
