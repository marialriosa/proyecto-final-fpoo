
package autonoma.restaurante.main;

import autonoma.restaurante.models.Restaurante;
import autonoma.restaurante.views.VentanaPrincipalVista;

/**
 *
 * @author maria
 */
public class Main {
    
    public static void main(String[]args){
        Restaurante restaurante = new Restaurante("El buen sabor","Muy muy lejano",12345);
        VentanaPrincipalVista ventana = new VentanaPrincipalVista();
        ventana.setVisible(true);
    }
}
