package Negocio;
import Servicio.ConexionBD;
import Servicio.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioBO {
    
    //Metodo para guardar la infomracion desde la Interfaz
    // a la clase UsuarioDAO
    public void guardarDatosUsuario(UsuarioDAO obj, String id, 
            String nombre, String correo, String telefono, 
            String login, String password, String fechaCreacion,
            String tipoUsuario){
        
        obj.setId(id);
        obj.setNombre(nombre);
        obj.setCorreo(correo);
        obj.setTelefono(telefono);
        obj.setLogin(login);
        obj.setPassword(password);
        obj.setFechaCreacion(fechaCreacion);
        obj.setTipoUsuario(tipoUsuario); 
    }
    
    public void guardarDatosUsuarioBD (UsuarioDAO obj){
        Connection con = null;
        if( ( con = ConexionBD.crearConexionBD() ) != null  ){
            try{
                String query = "INSERT INTO usuario (nombre, correo,"
                        + " telefono, login, password, fechaCreacion,"
                        + " tipoUsuario) VALUES (?,?,?,?,?,?,?) ";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, obj.getNombre());
                ps.setString(2, obj.getCorreo());
                ps.setString(3, obj.getTelefono());
                ps.setString(4, obj.getLogin());
                ps.setString(5, obj.getPassword());
                ps.setString(6, obj.getFechaCreacion());
                ps.setString(7, obj.getTipoUsuario());
                ps.execute();
                System.out.println("Datos de Usuario Insertados correctamente.");
                con.close();
            }
            catch(SQLException ex){
                System.out.println("Error en la consulta INSERT. " + ex.getMessage());
            }
        }
        
    }
}
    