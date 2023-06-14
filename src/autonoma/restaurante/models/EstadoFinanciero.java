
package autonoma.restaurante.models;

import java.util.Date;
/**
*) Clase Estados Financieros
*) @autor Maria Luisa Rios
*) @version ----> 1.0.0
*) @since ---> 01/06/2023
*) @see 
*/
public class EstadoFinanciero {
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    
   /**
    * Fecha generación estados financieros
    */
    private Date fechaGeneracion;
    /**
    * valor recaudado hasta la fecha
    */
    private double valorTotalRecaudado;
    /**
    * Total ganancias hasta la fecha
    */
    private double totalGanancias;
    
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    
    public EstadoFinanciero(Date fechaGeneracion, double valorTotalRecaudado, double totalGanancias) {
        this.fechaGeneracion = fechaGeneracion;
        this.valorTotalRecaudado = valorTotalRecaudado;
        this.totalGanancias = totalGanancias;
    }
    
    
    
    //Metodos de acceso
   /////////////////////////////////////////////////////////////////////////////
    
    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public double getValorTotalRecaudado() {
        return valorTotalRecaudado;
    }

    public void setValorTotalRecaudado(double valorTotalRecaudado) {
        this.valorTotalRecaudado = valorTotalRecaudado;
    }

    public double getTotalGanancias() {
        return totalGanancias;
    }

    public void setTotalGanancias(double totalGanancias) {
        this.totalGanancias = totalGanancias;
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////

    

    
}
