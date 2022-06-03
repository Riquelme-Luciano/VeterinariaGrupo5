
package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class MascotaData {
     private Connection con=null;

    public MascotaData(Conexion conexion) {
        this.con = conexion.getConexion();
    }
    
    
    
    
    
}
