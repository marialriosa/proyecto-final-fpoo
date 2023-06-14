
package autonoma.restaurante.main;

import autonoma.restaurante.models.Restaurante;
import autonoma.restaurante.views.VentanaPrincipalVista;

/**
*) Vista principal restaurante
*) @autor Maria Luisa Rios
*) @version ----> 1.0.0
*) @since ---> 01/06/2023
*) @see 
*/
public class Main {
    
    public static void main(String[]args){
        Restaurante restaurante = new Restaurante("El buen sabor","Muy muy lejano",12345);
        VentanaPrincipalVista ventana = new VentanaPrincipalVista();
        ventana.setVisible(true);
    }
}
