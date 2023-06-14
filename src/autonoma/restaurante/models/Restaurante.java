
package autonoma.restaurante.models;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author maria
 */
public class Restaurante {
    
    
    // Atributos
    ////////////////////////////////////////////////////////////////////////////
    
    private String nombre;
    private String direccion;
    private long telefono;
    public static ArrayList<Menu> menus = new ArrayList<>(Collections.singleton(crearMenuPrueba()));
    public static ArrayList<Plato> platos = new ArrayList<>();
    public static ArrayList<Venta> ventas = new ArrayList<>();
    public static ArrayList<Empleado> empleados = new ArrayList<>();
    public static ArrayList<EstadoFinanciero> estadoFinanciero = new ArrayList<>();
    private static Administrador administrador ;
    
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////

    public Restaurante(String nombre, String direccion, long telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        crearAdmin();
        ventas.add(crearVentaPrueba());
        platos.add(crearPlatoPrueba());
        empleados.add(crearEmpleadoPrueba());
    }
    
    
    
    
    //Metodos de acceso
   /////////////////////////////////////////////////////////////////////////////
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public static ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public static ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public static Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(ArrayList<Empleado> empleados) {
        Restaurante.empleados = empleados;
    }

  //////////////////////////////////////////////////////////////////////////////
    public void agregarMenu(Menu menu) {
        menus.add(menu);
    }

    public void eliminarMenu(Menu menu) {
        menus.remove(menu);
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public void eliminarVenta(Venta venta) {
        ventas.remove(venta);
    }
    
    public void setPlatos(Plato plato){
        platos.add(plato);
    }
    public static ArrayList<Plato> getPlatos(){
        return platos;
    }
    public void eliminarPlato(Plato plato) {
        platos.remove(plato);
    }
    
    private void crearAdmin(){
        Restaurante.administrador = new Administrador("Maria Luisa","1",1234,"Muy muy lejano","malu","Malu");;
    }
   
    private static Menu crearMenuPrueba(){
        
       return new Menu("prueba",2023,new ArrayList<>(Collections.singleton(crearPlatoPrueba())));        
    }
    
    private static Plato crearPlatoPrueba(){
        Plato plato = new Plato("Plato prueba", Double.valueOf(2000),"Plato de prueba",false);
    
        return plato;
        
    }
    private static Venta crearVentaPrueba(){
        Venta venta = new Venta(2000d,200d,menus.get(0).getPlatos());
        
        return venta;
    }
    
    private static Empleado crearEmpleadoPrueba(){
        Empleado empleado = new Empleado("Maria Luisa","123",Long.valueOf(2345),"Muy muy lejano","Mesera",10000d);
        return empleado;
    }
}
