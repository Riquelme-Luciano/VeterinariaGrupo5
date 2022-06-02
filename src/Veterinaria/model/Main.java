
package Veterinaria.model;

import Veterinaria.controller.ClienteData;
import Veterinaria.controller.MascotaData;

public class Main {

    public static void main(String[] args) {
          try {
            Conexion con = new Conexion();
            ClienteData cd= new ClienteData(con);
            MascotaData md = new MascotaData(con);
            //cd.buscarCliente(3);
            /*
            List<Cliente> listCliente=cd.listarClientes();
        
            for (Cliente cliente : listCliente) {
                System.out.println(cliente);
            }
            */ 
            /*
            List<Mascota> listaMascota=md.listarMascotasActivas();
            for (Mascota m : listaMascota) {
                System.out.println("Lista de Mascotas\n"+m);
            }
            */
        } catch (Exception e) {
            System.out.println("Fallo general con la base de datos");
        }
    }
    
}
