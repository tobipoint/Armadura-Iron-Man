package Servicios;

import armadura.Entidades.Jarvis;
import java.util.Scanner;

public class AccionesServicios {
    
    Scanner leer = new Scanner(System.in);
    JarvisServicios jj;
    
    public void Acciones(Jarvis ja) {
        
        int aux;
        
        System.out.println("que accion desea realizar? ");
        System.out.println("       caminar (1)         ");
        System.out.println("       correr (2)          ");
        System.out.println("       propulsarse (3)     ");
        System.out.println("       volar (4)           ");
        System.out.println("       armas (5)           ");
        System.out.println(" volver a la consola priincipal (6)");
        
        aux = leer.nextInt();
        
        switch (aux) {
            case 1:
                Caminar(ja);
                break;
            case 2:
                Correr(ja);
                break;
            case 3:
                Propulsarse(ja);
                break;
            case 4:
                Volar(ja);
                break;
            case 5:
                Armas(ja);
                break;
            case 6:
                jj.ConsolaPrincipal(ja);
                break;
        }
        
    }
    
    public void Caminar(Jarvis ja) {
        
        System.out.println("por cuanto tiempo?");
        ja.setTiempo(leer.nextInt());
        ja.setAgotarbateria(1 * ja.getTiempo());
        ja.setBatbotas(ja.getBatbotas() - ja.getAgotarbateria());
        System.out.println(+ja.getBatbotas() + "% de bateria en las botas");
        if (ja.getBatbotas() <= 0) {
            System.out.println("bateria baja");
        }
        
    }
    
    public void Correr(Jarvis ja) {
        System.out.println("cuanto tiempo?");
        ja.setTiempo(leer.nextInt());
        ja.setAgotarbateria(2 * ja.getTiempo());
        ja.setBatbotas(ja.getBatbotas() - ja.getAgotarbateria());
        System.out.println(+ja.getBatbotas() + "% de bateria en las botas");
        if (ja.getBatbotas() <= 0) {
            System.out.println("bateria baja");
        }
    }
    
    public void Propulsarse(Jarvis ja) {
        System.out.println("cuanto tiempo?");
        ja.setTiempo(leer.nextInt());
        ja.setAgotarbateria(3 * ja.getTiempo());
        ja.setBatbotas(ja.getBatbotas() - ja.getAgotarbateria());
        System.out.println(+ja.getBatbotas() + "% de bateria en las botas");
        if (ja.getBatbotas() <= 0) {
            System.out.println("bateria baja");
        }
    }
    
    public void Volar(Jarvis ja) {
        System.out.println("cuanto tiempo?");
        ja.setTiempo(leer.nextInt());
        ja.setAgotarbateria(3 * ja.getTiempo());
        ja.setBatbotas(ja.getBatbotas() - ja.getAgotarbateria());
        System.out.println(+ja.getBatbotas() + "% de bateria en las botas");
        if (ja.getBatbotas() <= 0) {
            System.out.println("bateria baja");
        }
        ja.setAgotarbateria(2 * ja.getTiempo());
        ja.setBatguantes(ja.getBatguantes() - ja.getAgotarbateria());
        System.out.println(+ja.getBatguantes() + "% de bateria en los guantes ");
        if (ja.getBatguantes()<= 0) {
            System.out.println("bateria baja");
        }
    }
    
    public void Armas(Jarvis ja) {
        System.out.println("cuanto tiempo?");
        ja.setTiempo(leer.nextInt());
        ja.setAgotarbateria(3 * ja.getTiempo());
        ja.setBatguantes(ja.getBatguantes() - ja.getAgotarbateria());
        System.out.println(+ja.getBatguantes() + "%  de bateria en los guantes ");
         if (ja.getBatguantes()<= 0) {
            System.out.println("bateria baja");
        }
    }
    
}
