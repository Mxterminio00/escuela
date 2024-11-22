package Servicio;

public class UsuarioDAO {
    //Atributos vienen del MER
    private String id;
    private String nombre;
    private String correo;
    private String telefono;
    private String login;
    private String password;
    private String fechaCreacion;
    private String tipoUsuario;
    //Metodos del UsuarioDAO

    public UsuarioDAO() {
        this.id = "";
        this.nombre = "";
        this.correo = "";
        this.telefono = "";
        this.login = "";
        this.password = "";
        this.fechaCreacion = "";
        this.tipoUsuario = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
