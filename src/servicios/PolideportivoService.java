package servicios;

import entidades.Polideportivo;
import enums.tipoInstalacion;
import java.util.Scanner;

public class PolideportivoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Polideportivo crearEdOf(){

        System.out.println("Por favor, ingrese el nombre del polideportivo");

        String nombre = leer.next();

        System.out.println("Por favor indique el tipo de instalción: techado ó abierto");
        
        tipoInstalacion opcionTipoInstalacion;
        
        opcionTipoInstalacion = tipoInstalacion.valueOf(leer.next());

        System.out.println("Ingrese el ancho del edificio (frente)");
        Double ancho = leer.nextDouble();
        
        System.out.println("Ingrese el largo del edificio (fondo)");
        Double largo = leer.nextDouble();
        
        System.out.println("Ingrese el alto del edificio");
        Double alto = leer.nextDouble();
        
        return new Polideportivo(nombre, opcionTipoInstalacion, ancho, alto, largo);
    }    
    
    
    
    
}
