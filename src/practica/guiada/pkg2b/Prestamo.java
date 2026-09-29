/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.guiada.pkg2b;

/**
 *
 * @author estuam
 */
import java.time.LocalDate;

public class Prestamo {
    private LocalDate fecha;
    private Libro libro;

    public Prestamo(LocalDate fecha, Libro libro) {
        this.fecha = fecha;
        this.libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}