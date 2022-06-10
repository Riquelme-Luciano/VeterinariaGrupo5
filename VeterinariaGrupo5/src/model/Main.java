package model;

import controller.ConsultaData;
import controller.TratamientoData;
import java.util.Date;
import view.MenuView;

public class Main {

    public static void main(String[] args) {
        
        MenuView v = new MenuView();
        v.setVisible(true);
        v.setLocationRelativeTo(v);
        //main
        
        /*
        Cliente cl = new Cliente(9, "joaquin", "funez", 123, " ", " ");
        Date nacimiento = new Date(2010,5,5);
        Mascota ma = new Mascota(2,"coli", 'M', TipoMascota.PERRO, " ", " ", nacimiento, true, cl);
        Tratamiento tr = new Tratamiento(1, "dopaje"," ", " ", 1500, true);
        Conexion con = new Conexion();
        
        Date fecha = new Date(2022,5,7);
        Visita v = new Visita(4,ma, tr, fecha,"",1500);
//        TratamientoData td = new TratamientoData(con);
        ConsultaData cd = new ConsultaData(con);
        cd.insertarVisita(v);
        */
        //td.insertarTratamiento(tr);
//        td.eliminarTratamiento(6);
//        td.actualizarTratamiento(tr);
//        td.listarActivos();
//        td.consultarTratamiento(4);
          
    }

}
