package edu.escuelaing.arep.app.web;

import edu.escuelaing.arep.app.annotation.Web;

public class WebServiceImage {

    @Web("/fondodepantalla.html")
    public static String showImage() {
        return "<html><title>Fondo de Pantalla</title><body><img src=\"/Wallpaper.jpg\" width=\"1900\" height=\"950\"></body></html>";
    }
}
