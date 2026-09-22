/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_carlosochoa;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Carlos Antonio
 */
public class Configuracion implements Serializable {
    
    Color colorFondo;
    Color colorNavbar;
    String fuente;
    int tamanoFuente;
    String imagenFondo;

    public Configuracion() {
        colorFondo = Color.WHITE;
        colorNavbar = Color.DARK_GRAY;
        fuente = "Arial";
        tamanoFuente = 14;
        imagenFondo = "";
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Color getColorNavbar() {
        return colorNavbar;
    }

    public void setColorNavbar(Color colorNavbar) {
        this.colorNavbar = colorNavbar;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public int getTamanoFuente() {
        return tamanoFuente;
    }

    public void setTamanoFuente(int tamanoFuente) {
        this.tamanoFuente = tamanoFuente;
    }

    public String getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(String imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
    
         
}
