/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author hecto
 */
public class EdificioDeOficinas extends Edificio{
    private Integer numeroOficinas;
    private Integer personasXOficina;
    private Integer numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numeroOficinas, Integer personasXOficina, Integer numeroPisos) {
        this.numeroOficinas = numeroOficinas;
        this.personasXOficina = personasXOficina;
        this.numeroPisos = numeroPisos;
    }

    public EdificioDeOficinas(Integer numeroOficinas, Integer personasXOficina, Integer numeroPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasXOficina = personasXOficina;
        this.numeroPisos = numeroPisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public Integer getPersonasXOficina() {
        return personasXOficina;
    }

    public void setPersonasXOficina(Integer personasXOficina) {
        this.personasXOficina = personasXOficina;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroOficinas=" + numeroOficinas + ", personasXOficina=" + personasXOficina + ", numeroPisos=" + numeroPisos + '}';
    }

    
    
    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie de este edificio de oficinas es: "+ (super.ancho*super.largo)*this.numeroPisos + " m2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen este edificio de oficinas es: " + super.ancho*super.largo*super.alto + " m3\n");
    }
    
    
}
