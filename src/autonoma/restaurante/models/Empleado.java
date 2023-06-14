
package autonoma.restaurante.models;

/**
 *
 * @author maria
 */
public class Empleado extends Persona {
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    
    private String cargo;
    private Double salario;
    
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    
    public Empleado( String nombre, String Id, Long telefono, String direccion, String cargo, double salario) {
        super(nombre, Id, telefono, direccion);
        this.cargo = cargo;
        this.salario = salario;
    }
        
    
    
    
    //Metodos de acceso
   /////////////////////////////////////////////////////////////////////////////
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
   
    
    ////////////////////////////////////////////////////////////////////////////

}
