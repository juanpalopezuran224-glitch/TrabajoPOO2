/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.guiada.pkg2b;

/**
 *
 * @author estuam
 */
import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nombre;
    private String numeroCarne;
    private List<Prestamo> prestamos;

    public Socio(String nombre, String numeroCarne) {
        this.nombre = nombre;
        this.numeroCarne = numeroCarne;
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCarne() {
        return numeroCarne;
    }

    public void setNumeroCarne(String numeroCarne) {
        this.numeroCarne = numeroCarne;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
}