/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.restaurante.utilidades;

import java.text.DecimalFormat;

/**
 *
 * @author maria
 */
public class Formateador {
    
    public static String formatearDouble(Double numero){
       DecimalFormat decimalFormat = new DecimalFormat("0");
       return decimalFormat.format(numero);
    }
}
