
package autonoma.restaurante.models;

/**
 *
 * @author maria
 */
public abstract class Persona {
    
    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    
    private String nombre;
    private String Id;
    private Long telefono;
    private String direccion;
    
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////

    public Persona(String nombre, String Id, long telefono, String direccion) {
        this.nombre = nombre;
        this.Id = Id;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    //Métodos de acceso
    ////////////////////////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
