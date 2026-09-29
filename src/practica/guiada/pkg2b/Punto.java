/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.guiada.pkg2b;

/**
 *
 * @author estuam
 */
public class Punto implements Dibujable {
    private Coordenada coordenada;

    public Punto(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando punto en la coordenada X: " + coordenada.x() + ", Y: " + coordenada.y());
    }
}