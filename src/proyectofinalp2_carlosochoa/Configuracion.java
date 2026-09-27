/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_carlosochoa;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

/**
 *
 * @author Carlos Antonio
 */
public class Configuracion implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    Color colorFondo;
    Color colorNavbar;
    Color colorTexto;
    Color colorBotones;
    String fuente;
    int tamanoFuente;
    int estiloFuente;
    String imagenFondo;

    public Configuracion() {
        colorFondo = Color.WHITE;
        colorNavbar = Color.DARK_GRAY;
        colorTexto = Color.BLACK;
        colorBotones = Color.WHITE;
        fuente = "Arial";
        tamanoFuente = 14;
        estiloFuente = Font.PLAIN;
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

    public Color getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
    }

    public Color getColorBotones() {
        return colorBotones;
    }

    public void setColorBotones(Color colorBotones) {
        this.colorBotones = colorBotones;
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

    public int getEstiloFuente() {
        return estiloFuente;
    }

    public void setEstiloFuente(int estiloFuente) {
        this.estiloFuente = estiloFuente;
    }

    public String getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(String imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
    
    
    
    

    
}
