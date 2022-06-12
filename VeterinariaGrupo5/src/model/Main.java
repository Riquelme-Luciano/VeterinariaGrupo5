package model;

import controller.ClienteData;
import controller.ConsultaData;
import controller.MascotaData;
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
        Conexion con = new Conexion();
        /*
        Cliente cl = new Cliente(3,"jorge", "de la selva", 2657, "jungla brasil 156 ", "tarzan",true);
        Date nacimiento = new Date(2005,5,5);
        Mascota ma = new Mascota(10,"floki", 'H', TipoMascota.PERRO, " ", " ", nacimiento, true, cl) ;
        Tratamiento tr = new Tratamiento(8,"dopaje"," ", " ", 1500, true);
        
        Date fecha = new Date(2022,5,7);
        Visita v = new Visita(9,ma, tr, fecha,"",12.5);
        
        ClienteData cd = new ClienteData(con);
        cd.insertarCliente(cl);
        */
        /*
        MascotaData md = new MascotaData(con);
//        md.buscarMascota(4);
//        md.insertarMascota(ma);
//        TratamientoData td = new TratamientoData(con);
//        td.insertarTratamiento(tr); 
        
        ConsultaData vd = new ConsultaData(con);
//        Date f = new Date(2022,3,22);
//        vd.actualizarVisita(11, 8,f,"se siente mejor",15.2);
//        vd.visitasDeUnaMascota(2, 2);
          vd.visitasDeUnTratamiento(0);
//        vd.eliminarVisita(4, 6);
//        vd.insertarVisita(v);
         */







    }

}
