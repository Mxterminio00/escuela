package Servicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection crearConexionBD(){
        Connection con = null;
        String host = "localhost"; //127.0.0.1
        String user = "root";
        String password = "";
        int port = 3303; //phpMyAdmin // MySQL
        String database = "drogeriaHE";
        String url = "";
        
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){
            System.out.println("Libreria no Encontrada " + e.getMessage());
        }
        
        try{
            url = String.format("jdbc:mysql/%s:%d/%s",host,port,database);
            System.out.print("url: " + url);
            con = DriverManager.getConnection(url, user, password);
            System.out.print("Conexion con" + database + "establecida");
        }catch(SQLException e){
            System.out.println("Error al conectar DB"  + e.getMessage());
        }
            
    
        return con;
    }
}
