/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armadura;

import Servicios.JarvisServicios;
import armadura.Entidades.Jarvis;

/**
 *
 * @author Usuario
 */
public class Armadura {

    /**
     * @param args the command line arguments
     */
    /*
    https://docs.google.com/document/d/1uF-PxoahPO_vo0MaUG4uWDq7ubwL3f0Y/edit
    */
    
    public static void main(String[] args) {
      
       JarvisServicios js = new JarvisServicios();
       
       Jarvis ja = js.Empezemos();
        

    }

}
/*
armaduras poseen un nivel de salud el cual se mide de 0 a 100

La batería a pesar de estar en el pecho de Tony, es considerada como parte de la armadura.


dispositivos: botas, guantes, consola y sintetizador)


Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le
pasa el nivel de intensidad y el tiempo. El dispositivo debe retornar la energía
consumida y la armadura deberá informar al generador se ha consumido esa
cantidad de energía.


*/
