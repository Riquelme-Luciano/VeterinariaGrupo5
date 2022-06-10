package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private String db = "veterinaria2";
    private String url = "jdbc:mysql://127.0.0.1/" + db;
    private String user = "root";
    private String pass = "";

    private Connection conexion;

    public Conexion() {
    }

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(this.url, this.user, this.pass);
            System.out.println("Conexion exitosa");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al conectar con la base de datos\n" + e);
        }
        return conexion;
    }
}
