package model;

import controller.ClienteData;
import controller.MascotaData;
import java.util.Date;
import view.MenuView;

public class Main {

    public static void main(String[] args) {

        //MenuView v = new MenuView();
        //v.setVisible(true);
        //v.setLocationRelativeTo(v);
        //main
        
        Conexion c = new Conexion();
        
        Cliente cli1 = new Cliente(24812266,"lisa","simpson",2434,"san martin 1233","asdasd");
        Cliente cli2 = new Cliente(25856542,"homero","simpson",545434,"san juan 233","ffffff");
        
        Date dia1 = new Date(2012,05,10);
        Date dia2 = new Date(2015,01,20);
        
        TipoMascota Gato = TipoMascota.GATO;
        TipoMascota Perro = TipoMascota.PERRO;
        
        Mascota m1 = new Mascota("tomi",'m',Perro,"blanco",dia1,true,cli1);
        Mascota m2 = new Mascota("leon",'m',Gato,"gris",dia2,true,cli2);
        
        ClienteData cData = new ClienteData(c); 
        MascotaData mData = new MascotaData(c);
        
        cData.insertarCliente(cli2);
        mData.insertarMascota(m2);
        
        mData.actualizarMascota(m1);
        System.out.println(mData.listar());
    }

}
