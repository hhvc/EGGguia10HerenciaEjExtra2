package servicios;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import java.util.ArrayList;
import java.util.Scanner;

public class EdificioDeOficinaService {
    
    Scanner leer = new Scanner(System.in);
    
    public EdificioDeOficinas crearEdOf(){

        System.out.println("Por favor, ingrese la cantidad de personas que entran en cada oficina");
        
        Integer personasXOficina = leer.nextInt();
        
        System.out.println("Por favor indique cuántas oficinas hay por piso");
        Integer numeroOficinas = leer.nextInt();
        
        System.out.println("Por favor, ingrese la cantidad de pisos que tiene el edificio");
        Integer numeroPisos = leer.nextInt();
        
        System.out.println("Ingrese el ancho del edificio (frente)");
        Double ancho = leer.nextDouble();
        
        System.out.println("Ingrese el largo del edificio (fondo)");
        Double largo = leer.nextDouble();
        
        System.out.println("Ingrese el alto del edificio");
        Double alto = leer.nextDouble();
        
        return new EdificioDeOficinas(numeroOficinas, personasXOficina, numeroPisos, ancho, alto, largo);
    }

    public void cantPersonas(EdificioDeOficinas ed){
        
        System.out.println("En este edificio entran " + ed.getNumeroOficinas()*ed.getNumeroPisos()*ed.getPersonasXOficina() + " personas");
        System.out.println("Por cada piso entran " + ed.getNumeroOficinas()*ed.getPersonasXOficina() + " personas\n");
    }

    
}
