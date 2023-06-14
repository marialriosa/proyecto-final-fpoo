
package autonoma.restaurante.models;

/**
 *
 * @author maria
 */
public class Administrador extends Persona{
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    
    
    private String nombreUsuario;
    private String contrasena;
    //Constructor 
    ////////////////////////////////////////////////////////////////////////////
    
    public Administrador(String nombre, String Id, long telefono, String direccion, String nombreUsuario, String contrasena) {
        super(nombre, Id, telefono, direccion);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }       

    //Metodos de acceso
    /////////////////////////////////////////////////////////////////////////////
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

   
    
}