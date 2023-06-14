
package autonoma.restaurante.models;
/**
*) Clase Empleado
*) @autor Maria Luisa Rios
*) @version ----> 1.0.0
*) @since ---> 01/06/2023
*) @see 
*/
public class Empleado extends Persona {
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    /**
    * Cargo empleado
    */
    private String cargo;
    /**
    * Salario
    */
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
