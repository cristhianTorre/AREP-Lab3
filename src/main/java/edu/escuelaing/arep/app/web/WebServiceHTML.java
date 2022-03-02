package edu.escuelaing.arep.app.web;

import edu.escuelaing.arep.app.annotation.Web;

public class WebServiceHTML {

    @Web("/home.html")
    public static String sayHello() {
        return "<html>"
                + "<head>"
                + "<title>Fancy Wallpapers</title>\r\n"
                + "</head>\r\n"
                + "<body>\r\n"
                + "	<div style=\"padding:30px; width:96.9%; background:#000000; color:white; font-size:400%; position:absolute ; top:0px ; left:0px\">\r\n"
                + "	<center>Fancy Wallpapers</center>\r\n"
                + "	</div>\r\n"
                + "	<div style=\"padding:30px; width:96.9%; background:#000000; color:white; font-size:150%; position:absolute ; top:120px ; left:0px\">\r\n"
                + "	<center>Los mejores fondos de pantalla para tu PC y/o smartphone.</center>\r\n"
                + "	</div>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "</body>\r\n"
                + "<body style = \"background: url(https://i.pinimg.com/originals/19/3e/cb/193ecbf389570118d51e658cfefc9746.jpg) no-repeat ; background-size: 100% 111%;\">\r\n"
                + "</body>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "	<br><br>\r\n"
                + "</html>";
    }
}
