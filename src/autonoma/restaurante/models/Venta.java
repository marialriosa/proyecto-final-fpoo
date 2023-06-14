package autonoma.restaurante.models;
 
 import java.util.ArrayList;
 import java.util.Date;
 /**
*) Clase Venta
*) Clase Administrador
*) @autor Maria Luisa Rios
*) @version ----> 1.0.0
*) @since ---> 01/06/2023
*) @see 
*/

 public class Venta {
     
     // Atributos
     ////////////////////////////////////////////////////////////////////////////
     /**
    * Codigo de venta
    */
     private String codigo;
    /**
    * Valor total venta
    */
     private Double valorTotal;
    /**
    * Valor ganancia venta
    */
     private Double valorGanancia;
    /**
    * Fecha venta
    */
     private Date fecha;
    /**
    * Lista platos vendidos
    */
     private ArrayList<Plato> platosVendidos;
     
     //Constructor
     ////////////////////////////////////////////////////////////////////////////
     
     public Venta(Double valorTotal, Double valorGanancia, ArrayList<Plato> platosVendidos) {
         this.codigo = crearCodigo();
         this.valorTotal = valorTotal;
         this.valorGanancia = valorGanancia;
         this.fecha = new Date();
         this.platosVendidos = platosVendidos;
     }
     
     
     
     //Metodos de acceso
    /////////////////////////////////////////////////////////////////////////////
     public String getCodigo() {
         return codigo;
     }
 
     public void setCodigo(String codigo) {
         this.codigo = codigo;
     }
 
     public Double getValorTotal() {
         return valorTotal;
     }
 
     public void setValorTotal(Double valorTotal) {
         this.valorTotal = valorTotal;
     }
 
     public Double getValorGanancia() {
         return valorGanancia;
     }
 
     public void setValorGanancia(Double valorGanancia) {
         this.valorGanancia = valorGanancia;
     }
 
     public Date getFecha() {
         return fecha;
     }
 
     public void setFecha(Date fecha) {
         this.fecha = fecha;
     }
 
     public ArrayList<Plato> getPlatosVendidos() {
         return platosVendidos;
     }
 
     public void setPlatosVendidos(ArrayList<Plato> platosVendidos) {
         this.platosVendidos = platosVendidos;
     }
 
     
     ////////////////////////////////////////////////////////////////////////////
   
     public void agregarPlatoVendido(Plato plato) {
         platosVendidos.add(plato);
         valorTotal += plato.getPrecioVenta();
         valorGanancia += (plato.getPrecioVenta() - plato.getCostoFabricacion() - (plato.getCostoFabricacion() * 0.19));
     }
 
     public void eliminarPlatoVendido(Plato plato) {
         platosVendidos.remove(plato);
         valorTotal -= plato.getPrecioVenta();
         valorGanancia -= plato.getPrecioVenta();
     }
 
     private String crearCodigo(){
         Integer count = Restaurante.getVentas().size() + 1;
 
         return String.format("%5s", count).replace(' ', '0');
     }
   // crear un metodo que sea cerrar venta que calcule el precio de venta final    
 }