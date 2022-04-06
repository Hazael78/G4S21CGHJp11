/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21cghjp11;

import com.google.gson.Gson;

/**
 *
 * @author hazae
 */
public class G4S21CGHJp11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos datos = new Datos("Victor", 42, "haza.el78@hotmail.com");
        Gson gson = new Gson();
        String cadena = gson.toJson(datos);        
        System.out.println("Nombre " +datos.getNombre());
        System.out.println("Edad " + String.valueOf(datos.getEdad()));
        System.out.println("Correo " + datos.getCorreo());
        
        System.out.println("La cadena contiene -> " + cadena);
        
        String cjson ="{\"nombre\":\"Javier\",\"edad\":22,\"correo\":\"Sin correo\"}";
        
        Datos datos2 = gson.fromJson(cjson, Datos.class);
        System.out.println("Nombre " +datos2.getNombre());
        System.out.println("Edad " + String.valueOf(datos2.getEdad()));
        System.out.println("Correo " + datos2.getCorreo());
    }
    
    
}
