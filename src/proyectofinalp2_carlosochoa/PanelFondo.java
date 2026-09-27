/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_carlosochoa;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Carlos Antonio
 */
public class PanelFondo extends JPanel {
    
    private String rutaImagen = "";

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (rutaImagen != null && !rutaImagen.isEmpty()) {

            Image imagen =
                    new ImageIcon(rutaImagen).getImage();

            g.drawImage(
                    imagen,
                    0,
                    0,
                    getWidth(),
                    getHeight(),
                    this
            );
        }
    }
    
}
