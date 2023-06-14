
package autonoma.restaurante.models;

/**
 *
 * @author maria
 */
public class PlatoInternacional {
    
    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    
    private String paisOrigen;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////

    public PlatoInternacional(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    
    
    
}
