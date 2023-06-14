
package autonoma.restaurante.models;

import java.util.ArrayList;
/**
*) Clase Menu
*) @autor Maria Luisa Rios
*) @version ----> 1.0.0
*) @since ---> 01/06/2023
*) @see 
*/
public class Menu {
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    /**
    * nombre menu
    */
    private String nombre;
    /**
    * Año creación menu
    */
    private int anoCreacion;
    /**
    * Lista de platos menu
    */
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
