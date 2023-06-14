
package autonoma.restaurante.models;
/**
*) Clase Administrador
*) @autor Maria Luisa Rios
*) @version ----> 1.0.0
*) @since ---> 01/06/2023
*) @see 
*/
public class Administrador extends Persona{
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    
    /**
    * Nombre usuario
    */
    private String nombreUsuario;
    /**
    * Contraseña
    */
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

   
    public String getNombrePersona() {
        return getNombre() ;
    }
    public String getIdPersona(){
        return getId();
    }
    public Long getTelefonoPersona(){
        return getTelefono();
    }
    public String getDireccionPersona(){
        return getDireccion();
    }
}