
package autonoma.restaurante.models;

/*
 *
 * @author maria
 */
public class Plato {
    public static long contadorPlatos = 1;
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    
    private long identificador;
    private String nombre;
    private Double precioVenta;
    private Double costoFabricacion;
    private String descripcion;
    private Boolean esInternacional;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    
    public Plato(String nombre, Double costoFabricacion, String descripcion,Boolean esInternacional) {
        this.identificador = contadorPlatos;
        this.nombre = nombre;        
        this.costoFabricacion = costoFabricacion;        
        this.descripcion = descripcion;
        this.esInternacional = esInternacional;
        this.precioVenta = calcularPrecioVenta();
        contadorPlatos++;
    }
    
    public Plato (){
        
    }
    
    
    //Metodos de acceso
   /////////////////////////////////////////////////////////////////////////////
    
    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
       
    public Double getPrecioVenta() {
       
        return this.precioVenta;
    }
    public Double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(Double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public Boolean getEsInternacional() {
        return esInternacional;
    }

    public void setEsInternacional(Boolean esInternacional) {
        this.esInternacional = esInternacional;
    }
  
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
////////////////////////////////////////////////////////////////////////////////
    
      public final Double calcularPrecioVenta() {
        Double precioVentaCalculado = this.costoFabricacion + (this.costoFabricacion * 0.19); // Agregar IVA
        
        if(this.esInternacional){
            precioVentaCalculado = (precioVentaCalculado / (100 - 45)) * 100; 
        }else{
            precioVentaCalculado = (precioVentaCalculado / (100 - 25)) * 100;
        }
        
        return precioVentaCalculado;
    }

     @Override
    public String toString(){
        return "  PLATO   "+this.identificador+":\n"+
               "  Nombre: "+this.nombre+"\n"+
               "  Precio: "+this.precioVenta+"\n\n"; 
            
    }
    
}

  