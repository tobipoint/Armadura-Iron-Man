package Servicios;

import armadura.Entidades.Jarvis;
import java.util.Scanner;

public class JarvisServicios {

    Scanner leer = new Scanner(System.in);
    AccionesServicios aj = new AccionesServicios();

    Jarvis ja = new Jarvis();

    public Jarvis Empezemos() {

        ja.setBatarmadura(100);
        ja.setBatarmas(100);
        ja.setBatbotas(100);
        ja.setBateria(100);
        ja.setBatguantes(100);
        ja.setTiempo(0);

        MostrandoEstado(ja);

        return ja;

    }

    public void MostrandoEstado(Jarvis ja) {

        System.out.println("BIENVEDIDO TONY");
        System.out.println("ESTE ES EL ESTADO DE TU ARMADURA");
        ja.setDaños(0);
        System.out.println("TU ARMADURA TIENE " + ja.getDaños() + " daños");
        EstadoBateria(ja);

    }

    public void EstadoBateria(Jarvis ja) {

        System.out.println("ESTA ES LA BATERIA DE TUS DISPOSITIVOS");

        System.out.println("bateria armadura: " + ja.getBatarmadura());
        System.out.println("baterira armas:" + ja.getBatarmas());
        System.out.println("baterira botas " + ja.getBatbotas());
        System.out.println("baterira: " + ja.getBateria());
        System.out.println("baterira guantes: " + ja.getBatguantes());

        //consola;
        InfoReactor(ja);

    }

    public void InfoReactor(Jarvis ja) {

        ja.setReactor((float) (3.4028235 * (Math.pow(10, 38))));
        System.out.println("el reactor se encuentra al: " + ja.getReactor() + "%");
        System.out.println(" ----------------------");
        ConsolaPrincipal(ja);
    }

    public void ConsolaPrincipal(Jarvis ja) {

        int aux;

        System.out.println("     COMO ANDA TONY?  ");
        System.out.println("que quiere realizar? ");
        System.out.println("    acciones (1)?");
        System.out.println("    reparar daños (2)");
        System.out.println("    sumilador (3)");
        System.out.println("    acciones evasivas (4)");
        System.out.println("    recargar barterias (5)");
        System.out.println("       SALIR (6)");

        aux = leer.nextInt();

        do {
            switch (aux) {
                case 1:
                    aj.Acciones(ja);
                    break;
                case 2:
                    RepararDaños();
                    break;
                case 3:
                    Simulador();
                    break;
                case 4:
                    AccionesEvasivas();
                    break;
                case 5:
                    RecargarBaterias(ja);
                    break;
                case 6:
                    System.out.println("HASTA PRONTO TONY");
                    break;
            }

        } while (aux != 6);

    }

    public void SufrirDaños() {
        /*
        public dispositivo dañado
        sout el dispositivo no se pueede usar
        ReparaDaños()
        
         */

    }

    public void RepararDaños() {

        int probabilidad;
        probabilidad = (int) (Math.random() * 100 + 1);

        if (probabilidad <= 40) {
            System.out.println("dispositivo sano");
        } else {
            System.out.println("quedara dañado");
        }

    }

    public void RevisarDispositivos() {

        /*
        revisara daños de disposit
        do 
        RepararDaños
        whlile reaparadp
        
         */
    }

    public void Radar(Jarvis ja) {

        int cantidad = (int) (Math.random() * 11);
        int enemigos[][][];

        enemigos = new int[1][1][1];

        for (int x = 0; x < 1; x++) {
            for (int y = 0; y < 1; y++) {
                for (int z = 0; z < 1; z++) {
                    enemigos[x][y][z] = (int) (Math.random() * 100 + 1);
                }
            }
        }

        System.out.println("¡enemigos en las coordenadas!");

        for (int x = 0; x < cantidad; x++) {
            for (int y = 0; y < cantidad; y++) {
                for (int z = 0; z < cantidad; z++) {
                    System.out.print(enemigos[x][y][z]);
                    System.out.println(" ");
                }
            }
        }

    }

    public void Simulador() {

        System.out.println("buscando enemigos");
        Radar(ja);

    }

    public void DestruyendoEnemigos() {

    }

    public void AccionesEvasivas() {

    }

    public void RecargarBaterias(Jarvis ja) {

        ja.setBatarmadura(100);
        ja.setBatarmas(100);
        ja.setBatbotas(100);
        ja.setBateria(100);
        ja.setBatguantes(100);
        ja.setTiempo(0);
        System.out.println("TODAS LAS BATERIAS ESTAN AL 100%");

    }

}
