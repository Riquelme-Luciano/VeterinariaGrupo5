
package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class TratamientoData {
     private Connection con=null;
    
    public TratamientoData(Conexion conexion) {
        this.con = conexion.getConexion();
    }
    
    
    
    
    
    
    
}
