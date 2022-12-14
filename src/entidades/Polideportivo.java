
package entidades;

import enums.tipoInstalacion;

public class Polideportivo extends Edificio{

    private String nombre;
    private tipoInstalacion tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, tipoInstalacion tipoDeInstalacion) {
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public Polideportivo(String nombre, tipoInstalacion tipoDeInstalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
    
    
    
    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo " + this.getNombre() + " es de: "+ super.ancho*super.largo + " m2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo " + this.getNombre() + " es de: " + super.ancho*super.largo*super.alto + " m3\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipoInstalacion getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(tipoInstalacion tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoDeInstalacion=" + tipoDeInstalacion + '}';
    }
    
    
    
}
