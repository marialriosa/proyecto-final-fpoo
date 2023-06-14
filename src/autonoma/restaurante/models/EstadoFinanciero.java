/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.restaurante.models;

import java.util.Date;

/**
 *
 * @author maria
 */
public class EstadoFinanciero {
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    
   
    private Date fechaGeneracion;
    private double valorTotalRecaudado;
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
