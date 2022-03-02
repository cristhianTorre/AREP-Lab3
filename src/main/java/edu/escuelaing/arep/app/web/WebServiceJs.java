package edu.escuelaing.arep.app.web;

import edu.escuelaing.arep.app.annotation.Web;

public class WebServiceJs {

    @Web("/agradecimiento.html")
    public static String returnHtmlWithJS(){
        return "<html><title>Agradecimiento</title><head><script src=\"/agradecimiento.js\"></script></head>"
                + "<body style = \"background: url(https://www.setaswall.com/wp-content/uploads/2017/03/Artistic-Landscape-4K-Wallpaper-3840x2160.jpg) no-repeat ; background-size: 100% 100%;\">\r\n"
                + "</body>"
                + "</html>";
    }
}
