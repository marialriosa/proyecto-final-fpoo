
package autonoma.restaurante.models;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Menu {
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    
    private String nombre;
    private int anoCreacion;
    private ArrayList<Plato> platos;
    
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    
      public Menu(String nombre, int anoCreacion, ArrayList<Plato> platos) {
        this.nombre = nombre;
        this.anoCreacion = anoCreacion;
        this.platos = platos;
    }
    
    //Metodos de acceso
   /////////////////////////////////////////////////////////////////////////////
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

  //////////////////////////////////////////////////////////////////////////////
    
     public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void eliminarPlato(Plato plato) {
        platos.remove(plato);
    }
    
}
